package facultymanagementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
public class ChangePassword extends javax.swing.JInternalFrame {
    AdministratorControl administratorcontrol = new AdministratorControl();
    public ChangePassword() {
        initComponents();
        Connection conn;
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        newpass = new javax.swing.JLabel();
        oldpass = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        cmdChange = new javax.swing.JButton();
        conpass = new javax.swing.JLabel();
        comuserid = new javax.swing.JLabel();
        comoldpss = new javax.swing.JLabel();
        comconfirmpass = new javax.swing.JLabel();
        txtOldpass = new javax.swing.JPasswordField();
        txtNewpass = new javax.swing.JPasswordField();
        txtConpass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Change  Password");
        setAutoscrolls(true);
        setDoubleBuffered(true);
        setFocusTraversalPolicyProvider(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/facultymanagementsystem/FourAL.png"))); // NOI18N
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(900, 500));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        newpass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newpass.setText("New Password");

        oldpass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oldpass.setText("Old Password");

        txtUserID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserIDKeyPressed(evt);
            }
        });

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setText("User  ID");

        cmdChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdChange.setText("Change");
        cmdChange.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdChangeActionPerformed(evt);
            }
        });

        conpass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conpass.setText("Confirm Password");

        txtOldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldpassActionPerformed(evt);
            }
        });
        txtOldpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOldpassKeyPressed(evt);
            }
        });

        txtNewpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNewpassKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(oldpass)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(username)
                                .addGap(68, 68, 68)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comuserid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtOldpass, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                            .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(conpass)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConpass, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(newpass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(comoldpss, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addComponent(txtNewpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldpass)
                    .addComponent(txtOldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comoldpss, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newpass))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comconfirmpass, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdChangeActionPerformed
        // TODO add your handling code here:
        if(checkEmpty()==true){
            JOptionPane.showMessageDialog(rootPane, "Fill the all blanks");            
        }
        else if(checkValidity()==true){
            JOptionPane.showMessageDialog(rootPane, "Password should be integer"); 
        }else{
            try{
                Connection conn= administratorcontrol.getConnection();
                String userID= txtUserID.getText();
                String oldpass = txtOldpass.getText();
                String newpass = txtNewpass.getText();
                String conpass = txtConpass.getText();
                String sql1="update userinfo set password='"+newpass+"'where userID='"+userID+"'";
                String sql2="select * from userinfo where userID='"+userID+"'";
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql2);
                if(rs.next()){
                    if(rs.getString("password").equals(oldpass))
                    {
                        comoldpss.setText("");
                        if(newpass.equals(conpass)){
                            comconfirmpass.setText("");
                            stmt.executeUpdate(sql1);
                            JOptionPane.showMessageDialog(rootPane, "Password Change Succefully");
                            this.dispose();
                        }else{
                            comconfirmpass.setText("Does not Match");
                            txtConpass.requestFocus();
                        }
                    }
                    else{
                        comoldpss.setText("Invalid Old Password");
                        txtOldpass.requestFocus();
                    }
                    comuserid.setText("");
                }
                else{
                    comuserid.setText("Invalid User ID");
                    txtUserID.requestFocus();
                }
                conn.close();
            }catch(Exception e){
                System.out.print(e);
            }
        }
        
    }//GEN-LAST:event_cmdChangeActionPerformed

    private void txtUserIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserIDKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtOldpass.requestFocus();
        }
    }//GEN-LAST:event_txtUserIDKeyPressed

    private void txtOldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldpassActionPerformed

    private void txtOldpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldpassKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtNewpass.requestFocus();
        }
    }//GEN-LAST:event_txtOldpassKeyPressed

    private void txtNewpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewpassKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtConpass.requestFocus();
        }
    }//GEN-LAST:event_txtNewpassKeyPressed

    private boolean checkEmpty(){
        boolean returnVal=false;
        if((txtUserID.getText().trim().length()==0)||(txtOldpass.getPassword().length==0) || (txtNewpass.getText().trim().length()==0) || (txtConpass.getText().trim().length()==0)){
            returnVal=true;
        }
        return returnVal;
    }
    
    public boolean checkValidity(){
        try{
            Integer.parseInt(txtOldpass.getText());
            Integer.parseInt(txtNewpass.getText());
            Integer.parseInt(txtConpass.getText());
        }catch (NumberFormatException e){
            return true;
        }
        return false; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdChange;
    private javax.swing.JLabel comconfirmpass;
    private javax.swing.JLabel comoldpss;
    private javax.swing.JLabel comuserid;
    private javax.swing.JLabel conpass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newpass;
    private javax.swing.JLabel oldpass;
    private javax.swing.JPasswordField txtConpass;
    private javax.swing.JPasswordField txtNewpass;
    private javax.swing.JPasswordField txtOldpass;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
