package p.phone;

import javax.swing.JOptionPane;

public class ContactForm extends javax.swing.JFrame {
    private boolean cform;
    private Values editValues;
  
    public ContactForm() {
        initComponents();
    }
    
    public void SetTexts(Values c){
        if(c != null){
            jlastname.setText(c.getLastName());
            jfirstname.setText(c.getFirstName());
            jemail.setText(c.getEmailAddress());
            jnum.setText(c.getMobileNum());
            jbday.setText(c.getBirthday());
            jaddress.setText(c.getAddress()); 
            editValues = c;
        }
    }
    
    protected void CloseDialog() {
        Main Form = new Main();
        Form.setVisible(true);
        this.dispose();
     }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        jlastname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jfirstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jnum = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jbday = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jaddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contact Information");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(70, 84, 97));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 137, 59));
        jLabel1.setText("Contact Form");

        savebtn.setBackground(new java.awt.Color(236, 243, 244));
        savebtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        savebtn.setForeground(new java.awt.Color(255, 137, 56));
        savebtn.setText("Save");
        savebtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        savebtn.setBorderPainted(false);
        savebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savebtn.setFocusPainted(false);
        savebtn.setFocusable(false);
        savebtn.setRequestFocusEnabled(false);
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        cancelbtn.setBackground(new java.awt.Color(236, 243, 244));
        cancelbtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 137, 56));
        cancelbtn.setText("Cancel");
        cancelbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelbtn.setBorderPainted(false);
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbtn.setFocusPainted(false);
        cancelbtn.setFocusable(false);
        cancelbtn.setRequestFocusEnabled(false);
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        jlastname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlastname.setToolTipText("Input Last Name");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 137, 59));
        jLabel2.setText("Last Name");

        jfirstname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jfirstname.setToolTipText("Input First Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 137, 59));
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 137, 59));
        jLabel4.setText("Email Address");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 137, 59));
        jLabel5.setText("Mobile Number");

        jnum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jnum.setToolTipText("Input Mobile Number");

        jemail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jemail.setToolTipText("Input email Address");

        jbday.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbday.setToolTipText("Input Birthday");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 137, 59));
        jLabel6.setText("Birthday");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 137, 59));
        jLabel7.setText("Address");

        jaddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jaddress.setToolTipText("Input Address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jnum, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbday, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(58, 58, 58)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jnum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jbday, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        CloseDialog();
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        String LastName = jlastname.getText();
        String FirstName = jfirstname.getText();
        String EmailAddress = jemail.getText();
        String MobileNumber = jnum.getText();
        String Birthday = jbday.getText();
        String Address = jaddress.getText();
        String buildContact = "";
       
        if(!LastName.isEmpty()){
            buildContact += LastName + ",";
        }else {
            buildContact += " " + ",";
        }
       
        if(!FirstName.isEmpty()){
            buildContact += FirstName + ",";
        }else {
            buildContact += " " + ",";
        }
       
        if(!EmailAddress.isEmpty()){
            buildContact += EmailAddress + ",";
        }else {
            buildContact += " " + ",";
        }
        
        if(!MobileNumber.isEmpty()){
            buildContact += MobileNumber + ",";
        }else {
            buildContact += " " + ",";
        }
        
        if(!Birthday.isEmpty()){
            buildContact += Birthday + ",";
        }else {
            buildContact += " " + ",";
        }
        
        if(!Address.isEmpty()){
            buildContact += Address + ",";
        }else {
            buildContact += " " + ",";
        }
       
        buildContact = buildContact.substring(0,buildContact.length() -1);
       
        if(cform){
            if(Functions.append(buildContact + "\r\n")){
                JOptionPane.showMessageDialog(null,LastName+" has been added.");               
                Functions.read(); 
                Main.BindIntoTable();
                CloseDialog();
                
            }else{
                JOptionPane.showMessageDialog(null,"Please Try again!");
            } 
        }else{
            if(Functions.update(editValues.getLastName(),
                    editValues.getFirstName(),
                    editValues.getEmailAddress(), 
                    editValues.getMobileNum(),
                    editValues.getBirthday(),
                    editValues.getAddress(),buildContact)){
                JOptionPane.showMessageDialog(null,LastName+" has been updated.");
                Functions.read();
                Main.BindIntoTable();
                CloseDialog();
            }else{
                JOptionPane.showMessageDialog(null,"Please Try again!");
            }               
        }
    }//GEN-LAST:event_savebtnActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new ContactForm().setVisible(true);
        });
    }
    
    public boolean isCForm() {
        return cform;
    }

    public void setCForm(boolean cform) {
        this.cform = cform;
    }

    public Values getEditValues() {
        return editValues;
    }

    public void setEditValues(Values editValues) {
        this.editValues = editValues;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jaddress;
    private javax.swing.JTextField jbday;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jfirstname;
    private javax.swing.JTextField jlastname;
    private javax.swing.JTextField jnum;
    private javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
