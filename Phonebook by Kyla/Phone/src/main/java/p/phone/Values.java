package p.phone;

public class Values {
    
    private String LastName;
    private String FirstName;
    private String EmailAddress;
    private String MobileNum;
    private String Birthday;
    private String Address;
   
    public Values() {
        LastName = "";
        FirstName = "";
        EmailAddress = "";
        MobileNum = "";
        Birthday = "";
        Address = "";
    }
   
    public String getLastName() {
        return LastName;
    }
  
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }
   
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
  
    public String getEmailAddress() {
        return EmailAddress;
    }
 
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }
    
     public String getMobileNum() {
        return MobileNum;
    }
 
    public void setMobileNum(String MobileNum) {
        this.MobileNum = MobileNum;
    }
    
     public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }
    
     public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
   
}
