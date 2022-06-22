package facultymanagementsystem;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class TeachersInfoRegister extends javax.swing.JInternalFrame {
    AdministratorControl administratorcontrol = new AdministratorControl();
    List<TeachersInfoRegisterEntity> teacherinfo=new ArrayList<>();
    public TeachersInfoRegister() {
        initComponents();
        teacherinfo=administratorcontrol.showRecords();
        showTable();
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(TeachersInfoRegister.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmdDelete = new javax.swing.JButton();
        phonenumber = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        teachername = new javax.swing.JLabel();
        txtPhonenumber = new javax.swing.JTextField();
        cmdShow = new javax.swing.JButton();
        cmdChange = new javax.swing.JButton();
        cmdAdd = new javax.swing.JButton();
        teacherid = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JComboBox<>();
        address = new javax.swing.JLabel();
        txtTeachername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        txtTeacherid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        teacherregistertable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Teachers Information Register");
        setAutoscrolls(true);
        setDoubleBuffered(true);
        setFocusTraversalPolicyProvider(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/facultymanagementsystem/FourAL.png"))); // NOI18N
        setInheritsPopupMenu(true);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        cmdDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDelete.setText("Delete");
        cmdDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        phonenumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phonenumber.setText("Phone Number");

        department.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        department.setText("Department");

        teachername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        teachername.setText("Teacher Name");

        txtPhonenumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPhonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhonenumberKeyPressed(evt);
            }
        });

        cmdShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdShow.setText("Show");
        cmdShow.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdShowActionPerformed(evt);
            }
        });

        cmdChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdChange.setText("Change");
        cmdChange.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdChangeActionPerformed(evt);
            }
        });

        cmdAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdAdd.setText("Add");
        cmdAdd.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        teacherid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        teacherid.setText("Teacher ID");

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtDepartment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "ECE", "CE", "Macanical", "Arch" }));
        txtDepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepartmentKeyPressed(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address.setText("Address");

        txtTeachername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTeachername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTeachernameKeyPressed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setText("Email");

        txtTeacherid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTeacherid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTeacheridKeyPressed(evt);
            }
        });

        teacherregistertable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        teacherregistertable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        teacherregistertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "Teacher Name", "Departement", "Email", "Phone Number", "Address"
            }
        ));
        teacherregistertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherregistertableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(teacherregistertable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(teacherid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTeacherid))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email)
                                .addGap(44, 44, 44)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teachername)
                            .addComponent(phonenumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhonenumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addComponent(txtTeachername))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(department)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(address)
                                .addGap(12, 12, 12)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 591, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(teacherid)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTeacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teachername)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(email)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phonenumber)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtTeachername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(department)
                            .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // TODO add your handling code here:
        if(checkEmpty()==true){
            JOptionPane.showMessageDialog(null, "Fill the all blanks");
            return;
        }
        TeachersInfoRegisterEntity teacherregister=new TeachersInfoRegisterEntity(txtTeacherid.getText(),txtTeachername.getText(),txtDepartment.getSelectedItem().toString(),txtPhonenumber.getText(),txtEmail.getText(),txtAddress.getText());
        administratorcontrol.addFunction(teacherregister);
        teacherinfo=administratorcontrol.showRecords();
        showTable();
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdChangeActionPerformed
        // TODO add your handling code here:
        if(checkEmpty()==true){
            JOptionPane.showMessageDialog(null, "Fill the all blanks");
            return;
        }
        TeachersInfoRegisterEntity teacherregister=new TeachersInfoRegisterEntity(txtTeacherid.getText(),txtTeachername.getText(),txtDepartment.getSelectedItem().toString(),txtPhonenumber.getText(),txtEmail.getText(),txtAddress.getText());
        administratorcontrol.changeFunction(teacherregister);
        teacherinfo=administratorcontrol.showRecords();
        showTable();
    }//GEN-LAST:event_cmdChangeActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        TeachersInfoRegisterEntity teacherregister=new TeachersInfoRegisterEntity(txtTeacherid.getText(),txtTeachername.getText(),txtDepartment.getSelectedItem().toString(),txtPhonenumber.getText(),txtEmail.getText(),txtAddress.getText());
        administratorcontrol.deleteFunction(teacherregister);
        teacherinfo=administratorcontrol.showRecords();
        showTable();
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdShowActionPerformed
        // TODO add your handling code here:
        TeachersInfo info = new TeachersInfo();
        JDesktopPane desktopPane = this.getDesktopPane();
        desktopPane.add(info);
        info.setVisible(true);
        try{
            info.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdShowActionPerformed

    private void txtTeacheridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeacheridKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtTeachername.requestFocus();
        }
    }//GEN-LAST:event_txtTeacheridKeyPressed

    private void txtTeachernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeachernameKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtDepartment.requestFocus();
        }
    }//GEN-LAST:event_txtTeachernameKeyPressed

    private void txtDepartmentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartmentKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtDepartmentKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtPhonenumber.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtPhonenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhonenumberKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtAddress.requestFocus();
        }
    }//GEN-LAST:event_txtPhonenumberKeyPressed

    private void teacherregistertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherregistertableMouseClicked
        // TODO add your handling code here:
        int row = teacherregistertable.getSelectedRow();
        if(row==-1)
        return;
        txtTeacherid.setText(teacherregistertable.getValueAt(row, 0).toString());
        txtTeachername.setText(teacherregistertable.getValueAt(row, 1).toString());
        txtDepartment.setSelectedItem(teacherregistertable.getValueAt(row, 2).toString());
        txtEmail.setText(teacherregistertable.getValueAt(row, 3).toString());
        txtPhonenumber.setText(teacherregistertable.getValueAt(row, 4).toString());
        txtAddress.setText(teacherregistertable.getValueAt(row, 5).toString());
    }//GEN-LAST:event_teacherregistertableMouseClicked

    private void showTable(){
        for(int i=teacherregistertable.getRowCount()-1;i>-1;i--){
                ((DefaultTableModel)teacherregistertable.getModel()).removeRow(i);
            }
        for(TeachersInfoRegisterEntity infoteacher : teacherinfo){
                ((DefaultTableModel)teacherregistertable.getModel()).addRow(new Object[]{infoteacher.getTeacherid(),
                    infoteacher.getTeachername(),infoteacher.getDepartment(),infoteacher.getPhonenumber(),
                    infoteacher.getEmail(),infoteacher.getAddress()});
            }        
    }
    private boolean checkEmpty(){
        boolean returnVal=false;
        if((txtTeacherid.getText().trim().length()==0)||("".equals(txtTeachername.getText()))||("".equals(txtDepartment.getSelectedItem())) || ("".equals(txtPhonenumber.getText())) || ("".equals(txtEmail.getText()))||("".equals(txtAddress.getText()))){
            returnVal=true;
        }
        return returnVal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdChange;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdShow;
    private javax.swing.JLabel department;
    private javax.swing.JLabel email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JLabel teacherid;
    private javax.swing.JLabel teachername;
    private javax.swing.JTable teacherregistertable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JComboBox<String> txtDepartment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JTextField txtTeacherid;
    private javax.swing.JTextField txtTeachername;
    // End of variables declaration//GEN-END:variables
}
