package facultymanagementsystem;
import java.sql.*;
import javax.swing.JOptionPane;
public class AdministratorSetPassword extends javax.swing.JInternalFrame {
    AdministratorControl administratorcontrol = new AdministratorControl();
    public AdministratorSetPassword() {
        initComponents();
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(AdministratorSetPassword.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        cmdAdd = new javax.swing.JButton();
        txtUserID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        cmdChange = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        usertype = new javax.swing.JLabel();
        txtUsertype = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administrator Set Password");
        setAutoscrolls(true);
        setDoubleBuffered(true);
        setFocusTraversalPolicyProvider(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FourAL.png"))); // NOI18N
        setInheritsPopupMenu(true);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(800, 400));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setText("User ID");

        cmdAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdAdd.setText("Add");
        cmdAdd.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        txtUserID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUserID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserIDKeyPressed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.setText("Password");

        cmdChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdChange.setText("Change");
        cmdChange.setMaximumSize(new java.awt.Dimension(80, 30));
        cmdChange.setMinimumSize(new java.awt.Dimension(80, 30));
        cmdChange.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdChangeActionPerformed(evt);
            }
        });

        cmdDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDelete.setText("Delete");
        cmdDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        usertype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usertype.setText("User Type");

        txtUsertype.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username)
                    .addComponent(password)
                    .addComponent(usertype))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdChange, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUserID)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(txtUsertype)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usertype)
                    .addComponent(txtUsertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // TODO add your handling code here:
        if(checkEmpty()==true){
            JOptionPane.showMessageDialog(rootPane, "Fill the all blanks");            
        }
        else if(checkDuplicacy(txtUserID.getText())==true){
            JOptionPane.showMessageDialog(rootPane, "UserID Has duplicacy"); 
        }
        else if(checkValidity()==true){
            JOptionPane.showMessageDialog(rootPane, "Password should be integer"); 
        }else{
            try{
            Connection conn=administratorcontrol.getConnection();
            String sql="insert into userinfo values(?,?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setString(1, txtUserID.getText());
            preparedStmt.setString(2, txtPassword.getText());
            preparedStmt.setString(3, txtUsertype.getText());
            preparedStmt.execute();
            conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdChangeActionPerformed
        // TODO add your handling code here:
        if(checkEmpty()==true){
            JOptionPane.showMessageDialog(rootPane, "Fill the all blanks");            
        }
        else if(checkDuplicacy1(txtUserID.getText())==true){
            JOptionPane.showMessageDialog(rootPane, "UserID Has duplicacy"); 
        }
        else if(checkValidity()==true){
            JOptionPane.showMessageDialog(rootPane, "Password should be integer"); 
        }else{
            try{
            Connection conn = administratorcontrol.getConnection();
            String sql = "update userinfo set password=?,userType=?  where userID=?";
            PreparedStatement preparedStmt=conn.prepareStatement(sql);
            preparedStmt.setString(1,txtPassword.getText());
            preparedStmt.setString(2,txtUserID.getText());
            preparedStmt.execute();
            conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cmdChangeActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn=administratorcontrol.getConnection();
            String  sql="delete from userinfo where userID=?";
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setString(1, txtUserID.getText());
            preparedStmt.execute();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void txtUserIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserIDKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtUserIDKeyPressed

    private boolean checkEmpty(){
        boolean returnVal=false;
        if((txtUserID.getText().trim().length()==0)||(txtPassword.getPassword().length==0) || (txtUsertype.getText().trim().length()==0)){
            returnVal=true;
        }
        return returnVal;
    }
    public boolean checkDuplicacy(String userID){
        boolean returnValue=false;
        try{
            Connection conn=administratorcontrol.getConnection();            
            String query = "select count(*) userID from userinfo where userID=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, userID);
            ResultSet rs=preparedStmt.executeQuery();
            int count=0;
            if(rs.next()){
                count=rs.getInt(1);
            }
            if(count>1){
                returnValue=true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return returnValue;
    }
    public boolean checkDuplicacy1(String userID){
        boolean returnVal=false;
        try{
            java.sql.Connection conn=administratorcontrol.getConnection();            
            String query = "select count(*) userID from userinfo where userID=? and usertype!=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, userID);
            ResultSet rs=preparedStmt.executeQuery();    
            int count=0;
            if(rs.next()){
                count=rs.getInt(1);
            }
            if(count>0){
                returnVal=true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return returnVal;
        
    }
    public boolean checkValidity(){
        try{
            Integer.parseInt(txtPassword.getText());
        }catch (NumberFormatException e){
            return true;
        }
        return false; 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdChange;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUsertype;
    private javax.swing.JLabel username;
    private javax.swing.JLabel usertype;
    // End of variables declaration//GEN-END:variables
}
