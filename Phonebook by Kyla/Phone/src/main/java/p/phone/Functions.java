package p.phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Functions {
    
 private static List<Values> AllContacts;

    public static final String FileName = "PhoneBook.txt";
 
    
    public Functions() {
        AllContacts = new ArrayList<>();
    }

    
    protected static boolean create(String store) {
        FileWriter writer = null;
        boolean successfulWrite = false;
        try {
            writer = new FileWriter(FileName);
            writer.write(store);
            writer.close();
            successfulWrite = true;
        } catch (IOException ex) {
            successfulWrite = false;
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
         
            }
        }
        return successfulWrite;
    }
  
    
    public static void read() {
        
        BufferedReader br = null;
        try {
            if (new File(FileName).exists()) {

                if (AllContacts == null) {
                    AllContacts = new ArrayList<>();
                } else {
                    AllContacts.clear();
                }
                br = new BufferedReader(new FileReader(FileName));
                String line = "";
                Values ContactClass = null;
                while ((line = br.readLine()) != null) {
                    if (!line.equalsIgnoreCase("")) {
                        ContactClass = new Values();
                        String[] _temp = line.split(",");
                        String _tempValue = _temp[0];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setLastName(_tempValue);

                        _tempValue = _temp[1];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setFirstName(_tempValue);

                        _tempValue = _temp[2];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setEmailAddress(_tempValue);
                        
                        _tempValue = _temp[3];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setMobileNum(_tempValue);
                        
                        _tempValue = _temp[4];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setBirthday(_tempValue);
                        
                        _tempValue = _temp[5];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setAddress(_tempValue);
                        
                        AllContacts.add(ContactClass);
                    }
                }
            } else {
                new File(FileName).createNewFile();
                read();
            }

        } catch (NullPointerException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //sorting Last Names A-Z
        BufferedReader reader = null; 
 
        BufferedWriter writer = null;
        ArrayList<String> lines = new ArrayList<>();
 
        try{
            reader = new BufferedReader(new FileReader("PhoneBook.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null){
                lines.add(currentLine);
                currentLine = reader.readLine();
            }
 
            Collections.sort(lines);
            writer = new BufferedWriter(new FileWriter("PhoneBook.txt"));
 
            for (String line : lines){
                writer.write(line);
                writer.newLine();
            }
        }
        catch (IOException e){
        }
        finally{
            try{
                if (reader != null){
                    reader.close();
                }
 
                if(writer != null){
                    writer.close();
                }
            }
            catch (IOException e){
            }
        }
    }
    
    
    public static boolean update(String lastname, String firstname, String email, String mobilenum, String birthday, String address, String NewStringLine) {
        BufferedReader br = null;
        String ReWrite = "";
        boolean success = false;
        try {
            if (new File(FileName).exists()) {
                br = new BufferedReader(new FileReader(FileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    if (!"".equals(line)) {
                        String[] _temp = line.split(",");
                        if (_temp[0].equalsIgnoreCase(lastname) && _temp[1].equalsIgnoreCase(firstname)
                                && _temp[2].equalsIgnoreCase(email) && _temp[3].equalsIgnoreCase(mobilenum)
                                && _temp[4].equalsIgnoreCase(birthday) && _temp[5].equalsIgnoreCase(address)) {
                            ReWrite += NewStringLine + "\r\n";
                        } else {
                            ReWrite += line + "\r\n";
                        }
                    }
                }
                br.close();
                success = create(ReWrite);
                
                read(); //update ArrayList with new List
            } else {
                new File(FileName).createNewFile();
                read();
                success = false;
            }
        } catch (FileNotFoundException ex) {            
            success = false;
        } catch (IOException ex) {          
            success = false;
        }
        return success;
    }
    
    
    public static void delete(Values C) {
        BufferedReader br = null;
        String rewrite = "";
        try {
            if (new File(FileName).exists()) {
                br = new BufferedReader(new FileReader(FileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    String[] _temp = line.split(",");
                    if (!(_temp[0].equalsIgnoreCase(C.getLastName()) && _temp[1].equalsIgnoreCase(C.getFirstName())
                                && _temp[2].equalsIgnoreCase(C.getEmailAddress()) && _temp[3].equalsIgnoreCase(C.getMobileNum())
                                && _temp[4].equalsIgnoreCase(C.getBirthday()) && _temp[5].equalsIgnoreCase(C.getAddress()))) {
                         rewrite += line + "\r\n";
                    }                   
                }
                br.close();

                if (create(rewrite)) {
                    JOptionPane.showMessageDialog(null, C.getLastName()+ " has been deleted.");
                } else {
                    JOptionPane.showMessageDialog(null, "Please try again!");
                }

                Functions.read();
                Main.BindIntoTable();

            } else {
                new File(FileName).createNewFile();
                read();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    public static boolean append(String appendValue) {
        boolean success = false;
        try {
            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FileName, true)))) {
                out.println(appendValue);
            }
            success = true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return success;
    }

    
    public static List<Values> search(String searchValue) {
        List<Values> cnt = new ArrayList<>();
        BufferedReader br = null;

        try {
            if (new File(FileName).exists()) {
                br = new BufferedReader(new FileReader(FileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    if (!("".equals(line))) {
                        String[] _temp = line.split(",");
                        if (_temp[0].equalsIgnoreCase(searchValue) || _temp[1].equalsIgnoreCase(searchValue)
                                || _temp[2].equalsIgnoreCase(searchValue) || _temp[3].equalsIgnoreCase(searchValue) || _temp[4].equalsIgnoreCase(searchValue)
                                || _temp[5].equalsIgnoreCase(searchValue)) {
                            Values c = new Values();
                            c.setLastName(_temp[0]);
                            c.setFirstName(_temp[1]);
                            c.setEmailAddress(_temp[2]);
                            c.setMobileNum(_temp[3]);
                            c.setBirthday(_temp[4]);
                            c.setAddress(_temp[5]);
                            cnt.add(c);
                        }
                    }
                }
            } else {
                new File(FileName).createNewFile();
                cnt = search(searchValue);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return cnt;
    }

    
    public static List<Values> getAllContacts() {
        return AllContacts;
    }

    
    public static void setAllContacts(List<Values> aAllContacts) {
        AllContacts = aAllContacts;
    }
}
