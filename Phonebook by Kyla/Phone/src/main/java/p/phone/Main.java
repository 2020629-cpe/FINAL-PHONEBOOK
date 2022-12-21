package p.phone;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Functions.read();
        BindIntoTable();
    }
    
    public static void BindIntoTable() {
        ContactTable.removeAll();
        List<Values> AllContacts = Functions.getAllContacts();
        if (AllContacts != null) {           
            int index = 1;
            String colNames[] = {"ID","Last Name", "First Name", "Email Address", "Mobile Number", "Birthday", "Address"};
            DefaultTableModel dtm = new DefaultTableModel(null, colNames);

            for (Values AllContact : AllContacts) {
                dtm.addRow(new String[7]);
            }
            ContactTable.setModel(dtm);

            if (!AllContacts.isEmpty()) {
                int row = 0;
                for (Values c : AllContacts) {
                    ContactTable.setValueAt(Integer.toString(index), row, 0);                                       
                    ContactTable.setValueAt(c.getLastName(), row, 1);
                    ContactTable.setValueAt(c.getFirstName(), row, 2);                   
                    ContactTable.setValueAt(c.getEmailAddress(), row, 3);
                    ContactTable.setValueAt(c.getMobileNum(), row, 4);
                    ContactTable.setValueAt(c.getBirthday(), row, 5);
                    ContactTable.setValueAt(c.getAddress(), row, 6);
                    index++;                   
                    row++;
                }
                ContactTable.getColumn("ID").setMaxWidth(30);
                ContactTable.getColumn("Last Name").setMaxWidth(110);
                ContactTable.getColumn("First Name").setMaxWidth(110);
                ContactTable.getColumn("Email Address").setMaxWidth(150);
                ContactTable.getColumn("Mobile Number").setMaxWidth(100);
                ContactTable.getColumn("Birthday").setMaxWidth(100);
                ContactTable.getColumn("Address").setMaxWidth(200);  
            }
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContactTable = new javax.swing.JTable();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phone Book by Kyla");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(70, 84, 97));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 137, 59));
        jLabel1.setText("CONTACTS");

        newbtn.setBackground(new java.awt.Color(236, 243, 244));
        newbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        newbtn.setForeground(new java.awt.Color(255, 137, 56));
        newbtn.setText("New");
        newbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        newbtn.setBorderPainted(false);
        newbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newbtn.setFocusPainted(false);
        newbtn.setFocusable(false);
        newbtn.setRequestFocusEnabled(false);
        newbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbtnActionPerformed(evt);
            }
        });

        ContactTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ContactTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Last Name", "First Name", "Email Address", "Mobile Number", "Birthday", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ContactTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContactTable.setGridColor(new java.awt.Color(70, 84, 97));
        ContactTable.setRowHeight(30);
        ContactTable.setShowGrid(false);
        ContactTable.setShowHorizontalLines(true);
        ContactTable.getTableHeader().setResizingAllowed(false);
        ContactTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ContactTable);
        if (ContactTable.getColumnModel().getColumnCount() > 0) {
            ContactTable.getColumnModel().getColumn(0).setResizable(false);
            ContactTable.getColumnModel().getColumn(0).setPreferredWidth(110);
            ContactTable.getColumnModel().getColumn(1).setResizable(false);
            ContactTable.getColumnModel().getColumn(1).setPreferredWidth(110);
            ContactTable.getColumnModel().getColumn(2).setResizable(false);
            ContactTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            ContactTable.getColumnModel().getColumn(3).setResizable(false);
            ContactTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            ContactTable.getColumnModel().getColumn(4).setResizable(false);
            ContactTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            ContactTable.getColumnModel().getColumn(5).setResizable(false);
            ContactTable.getColumnModel().getColumn(5).setPreferredWidth(200);
        }
        ContactTable.getAccessibleContext().setAccessibleName("");

        updatebtn.setBackground(new java.awt.Color(236, 243, 244));
        updatebtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 137, 56));
        updatebtn.setText("Update");
        updatebtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updatebtn.setBorderPainted(false);
        updatebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatebtn.setFocusPainted(false);
        updatebtn.setFocusable(false);
        updatebtn.setRequestFocusEnabled(false);
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(236, 243, 244));
        deletebtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 137, 56));
        deletebtn.setText("Delete");
        deletebtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deletebtn.setBorderPainted(false);
        deletebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletebtn.setFocusPainted(false);
        deletebtn.setFocusable(false);
        deletebtn.setRequestFocusEnabled(false);
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        refreshbtn.setBackground(new java.awt.Color(236, 243, 244));
        refreshbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(255, 137, 56));
        refreshbtn.setText("Refresh");
        refreshbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        refreshbtn.setBorderPainted(false);
        refreshbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshbtn.setFocusPainted(false);
        refreshbtn.setFocusable(false);
        refreshbtn.setRequestFocusEnabled(false);
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        searchbtn.setBackground(new java.awt.Color(236, 243, 244));
        searchbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 137, 56));
        searchbtn.setText("Search");
        searchbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchbtn.setBorderPainted(false);
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbtn.setFocusPainted(false);
        searchbtn.setFocusable(false);
        searchbtn.setRequestFocusEnabled(false);
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        searchbox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        searchbox.setToolTipText("Input Any Text");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(newbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbtnActionPerformed
       ContactForm Form = new ContactForm();
        Form.setVisible(true);
        Form.setCForm(true);
        this.dispose();
    }//GEN-LAST:event_newbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
         int row = ContactTable.getSelectedRow(); 
        if(row != -1){
           
            String lastname = (String)ContactTable.getValueAt(row,1);
            String firstname = (String)ContactTable.getValueAt(row,2);
            String email = (String)ContactTable.getValueAt(row,3);
            String mobile = (String)ContactTable.getValueAt(row,4);
            String bday = (String)ContactTable.getValueAt(row,5);
            String address = (String)ContactTable.getValueAt(row,6);
           
            Values C = new Values();
            C.setLastName(lastname);
            C.setFirstName(firstname);
            C.setEmailAddress(email);
            C.setMobileNum(mobile);
            C.setBirthday(bday);
            C.setAddress(address);
        
            ContactForm Form = new ContactForm();
            Form.setCForm(false);
            Form.SetTexts(C);
            Form.setVisible(true);  
            this.dispose();
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        int row = ContactTable.getSelectedRow(); 
        if(row != -1){ //-1 : no selected row
            String lastname = (String)ContactTable.getValueAt(row,1);
            String firstname = (String)ContactTable.getValueAt(row,2);
            String email = (String)ContactTable.getValueAt(row,3);
            String mobile = (String)ContactTable.getValueAt(row,4);
            String bday = (String)ContactTable.getValueAt(row,5);
            String address = (String)ContactTable.getValueAt(row,6);
           
            Values C = new Values();
            C.setLastName(lastname);
            C.setFirstName(firstname);
            C.setEmailAddress(email);
            C.setMobileNum(mobile);
            C.setBirthday(bday);
            C.setAddress(address);
           
            if (JOptionPane.showConfirmDialog(null, "Remove " + lastname + "?",
                    "", JOptionPane.OK_CANCEL_OPTION) == 0) {
                Functions.delete(C);
            }
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        Functions.read();       
        BindIntoTable();
        searchbox.setText("");
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String searchValue = searchbox.getText();
        List<Values> contacts = Functions.search(searchValue);
        Functions.setAllContacts(contacts);
        BindIntoTable();
    }//GEN-LAST:event_searchbtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable ContactTable;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newbtn;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

}
