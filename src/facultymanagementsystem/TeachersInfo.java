package facultymanagementsystem;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class TeachersInfo extends javax.swing.JInternalFrame {
    AdministratorControl administratorcontrol = new AdministratorControl();
    List<TeachersInfoRegisterEntity> teacherinfo=new ArrayList<>();
    public TeachersInfo() {
        initComponents();
        teacherinfo=administratorcontrol.showRecords();
        showTable();
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(TeachersInfo.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teacherid = new javax.swing.JLabel();
        txtTeacherid = new javax.swing.JTextField();
        teachername = new javax.swing.JLabel();
        txtTeachername = new javax.swing.JTextField();
        department = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        phonenumber = new javax.swing.JLabel();
        txtPhonenumber = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmdSearch = new javax.swing.JButton();
        address = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        teacherinfotable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Teachers Information");
        setAutoscrolls(true);
        setDoubleBuffered(true);
        setFocusTraversalPolicyProvider(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FourAL.png"))); // NOI18N
        setInheritsPopupMenu(true);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        teacherid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        teacherid.setText("Teacher ID");

        txtTeacherid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        teachername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        teachername.setText("Teacher Name");

        txtTeachername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        department.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        department.setText("Department");

        txtDepartment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        phonenumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phonenumber.setText("Phone Number");

        txtPhonenumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setText("Email");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cmdSearch.setBackground(new java.awt.Color(255, 255, 255));
        cmdSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdSearch.setText("Search");
        cmdSearch.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address.setText("Address");

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        teacherinfotable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        teacherinfotable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        teacherinfotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "Teacher Name", "Department", "Email", "Phone Number", "Address"
            }
        ));
        jScrollPane2.setViewportView(teacherinfotable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(623, 623, 623)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherid)
                            .addComponent(email))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail)
                                    .addComponent(txtTeacherid, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teachername)
                                    .addComponent(phonenumber))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTeachername)
                                    .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(department)
                                    .addComponent(address))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDepartment)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTeacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teacherid))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTeachername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teachername))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(address)
                                .addComponent(phonenumber))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(department))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed

       try{
            String us =txtSearch.getText();
            Connection conn=administratorcontrol.getConnection();
            PreparedStatement preparedStmt = conn.prepareStatement("select * from teacherregistationtable where teachername like '%"+us+"' or phonenumber like '%"+us+"' or email like '%"+us+"'");
            preparedStmt.execute();
            ResultSet rs=preparedStmt.executeQuery();
            if(rs.next()){
                String s = rs.getString(1);  
                String s1 = rs.getString(2);  
                String s2 = rs.getString(3);  
                String s3 = rs.getString(4);
                String s4 = rs.getString(5);
                String s5 = rs.getString(6);
                txtTeacherid.setText(s);
                txtTeachername.setText(s1);
                txtDepartment.setText(s2);
                txtPhonenumber.setText(s3);
                txtEmail.setText(s4);
                txtAddress.setText(s5);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Name not found");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(checkEmpty()==true){
            JOptionPane.showMessageDialog(rootPane, "Fill the all blanks");
        }else{
           try{
                String us =txtSearch.getText();
                Connection conn=administratorcontrol.getConnection();
                PreparedStatement preparedStmt = conn.prepareStatement("select * from teacherregistationtable where teachername like '%"+us+"' or phonenumber like '%"+us+"' or email like '%"+us+"'");
                preparedStmt.execute();
                ResultSet rs=preparedStmt.executeQuery();
                if(rs.next()){
                    String s = rs.getString(1);  
                    String s1 = rs.getString(2);  
                    String s2 = rs.getString(3);  
                    String s3 = rs.getString(4);
                    String s4 = rs.getString(5);
                    String s5 = rs.getString(6);
                    txtTeacherid.setText(s);
                    txtTeachername.setText(s1);
                    txtDepartment.setText(s2);
                    txtPhonenumber.setText(s3);
                    txtEmail.setText(s4);
                    txtAddress.setText(s5);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Name not found");
                }
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void showTable(){
        for(int i=teacherinfotable.getRowCount()-1;i>-1;i--){
                ((DefaultTableModel)teacherinfotable.getModel()).removeRow(i);
            }
        for(TeachersInfoRegisterEntity infoteacher : teacherinfo){
                ((DefaultTableModel)teacherinfotable.getModel()).addRow(new Object[]{infoteacher.getTeacherid(),infoteacher.getTeachername(),infoteacher.getDepartment(),infoteacher.getPhonenumber(),infoteacher.getEmail(),infoteacher.getAddress()});
            }        
    }
    private boolean checkEmpty(){
        boolean returnVal=false;
        if((txtSearch.getText().trim().length()==0)){
            returnVal=true;
        }
        return returnVal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton cmdSearch;
    private javax.swing.JLabel department;
    private javax.swing.JLabel email;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JLabel teacherid;
    private javax.swing.JTable teacherinfotable;
    private javax.swing.JLabel teachername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTeacherid;
    private javax.swing.JTextField txtTeachername;
    // End of variables declaration//GEN-END:variables
}
