package facultymanagementsystem;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class StudentInquiryForm extends javax.swing.JInternalFrame {
    TeacherUserControl  teacherusercontrol = new TeacherUserControl();
    List<StudentRegisterEntity> infofacaulty=new ArrayList<>();
    AdministratorControl administratorcontrol = new AdministratorControl();
    public StudentInquiryForm() {
        initComponents();
        infofacaulty=teacherusercontrol.showRecords();
        showTable();
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(StudentInquiryForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    private void showTable(){
        for(int i=commonuserinquirytable.getRowCount()-1;i>-1;i--){
                ((DefaultTableModel)commonuserinquirytable.getModel()).removeRow(i);
            }
        for(StudentRegisterEntity facultyinfo : infofacaulty){
                ((DefaultTableModel)commonuserinquirytable.getModel()).addRow(new Object[]{facultyinfo.getId(),facultyinfo.getName(),facultyinfo.getDepartment(),
                    facultyinfo.getTelephonenumber(),facultyinfo.getAddress(),facultyinfo.getDateofbirth()});
            }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDateofbirth = new javax.swing.JTextField();
        txtdepartment = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        department1 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        txttelephonenumber = new javax.swing.JTextField();
        name1 = new javax.swing.JLabel();
        dateofbirth = new javax.swing.JLabel();
        cmdsearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        telephonenumber = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commonuserinquirytable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Student Inquiry Form");
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

        txtDateofbirth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtdepartment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        department1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        department1.setText("Department");

        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address.setText("Address");

        txttelephonenumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        name1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name1.setText("Name");

        dateofbirth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dateofbirth.setText("Date Of Birth");

        cmdsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsearch.setText("Search");
        cmdsearch.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        telephonenumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telephonenumber.setText("Telephone No.");

        txtid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        id1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id1.setText("ID");

        commonuserinquirytable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        commonuserinquirytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Department", "Date of Birth", "Telephone Number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        commonuserinquirytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commonuserinquirytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(commonuserinquirytable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateofbirth)
                            .addComponent(id1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid)
                                    .addComponent(txtDateofbirth, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name1)
                                    .addComponent(telephonenumber))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtname)
                                    .addComponent(txttelephonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(department1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(address)
                                        .addGap(21, 21, 21)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(txtdepartment))
                                .addGap(84, 84, 84)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(department1)
                            .addComponent(txtdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id1))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dateofbirth)
                                .addComponent(txtDateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telephonenumber)
                                .addComponent(txttelephonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(address)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed

        try{
            String us =txtSearch.getText();
            Connection conn=administratorcontrol.getConnection();
            PreparedStatement preparedStmt = conn.prepareStatement("select * from facultyinformationtable where  name like '%"+us+"' or telephonenumber like '%"+us+"'");
            preparedStmt.execute();
            ResultSet rs=preparedStmt.executeQuery();
            if(rs.next()){
                String s = rs.getString(1);  
                String s1 = rs.getString(2);  
                String s2 = rs.getString(3);  
                String s3 = rs.getString(4);
                String s4 = rs.getString(5); 
                String s5 = rs.getString(6);  
                txtid.setText(s);
                txtname.setText(s1);
                txtdepartment.setText(s2);
                txtDateofbirth.setText(s3);
                txttelephonenumber.setText(s4);
                txtAddress.setText(s5); 
            }else{
                JOptionPane.showMessageDialog(rootPane, "Data not found");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void commonuserinquirytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commonuserinquirytableMouseClicked
        // TODO add your handling code here:
        int row = commonuserinquirytable.getSelectedRow();
        if(row==-1)
        return;
        txtid.setText(commonuserinquirytable.getValueAt(row, 0).toString());
        txtname.setText(commonuserinquirytable.getValueAt(row, 1).toString());
        txtdepartment.setText(commonuserinquirytable.getValueAt(row, 2).toString());
        txtDateofbirth.setText(commonuserinquirytable.getValueAt(row, 3).toString());
        txttelephonenumber.setText(commonuserinquirytable.getValueAt(row, 4).toString());
        txtAddress.setText(commonuserinquirytable.getValueAt(row, 5).toString());
    }//GEN-LAST:event_commonuserinquirytableMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(checkEmpty()==true){
            JOptionPane.showMessageDialog(rootPane, "Fill the all blanks");
        }else{
            try{
                String us =txtSearch.getText();
                Connection conn=administratorcontrol.getConnection();
                PreparedStatement preparedStmt = conn.prepareStatement("select * from facultyinformationtable where  name like '%"+us+"' or telephonenumber like '%"+us+"'");
                preparedStmt.execute();
                ResultSet rs=preparedStmt.executeQuery();
                if(rs.next()){
                    String s = rs.getString(1);  
                    String s1 = rs.getString(2);  
                    String s2 = rs.getString(3);  
                    String s3 = rs.getString(4);
                    String s4 = rs.getString(5); 
                    String s5 = rs.getString(6);  
                    txtid.setText(s);
                    txtname.setText(s1);
                    txtdepartment.setText(s2);
                    txtDateofbirth.setText(s3);
                    txttelephonenumber.setText(s4);
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

    private boolean checkEmpty(){
        boolean returnVal=false;
        if(("".equals(txtSearch.getText()))){
            returnVal=true;
        }
        return returnVal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JTable commonuserinquirytable;
    private javax.swing.JLabel dateofbirth;
    private javax.swing.JLabel department1;
    private javax.swing.JLabel id1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel telephonenumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDateofbirth;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtdepartment;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttelephonenumber;
    // End of variables declaration//GEN-END:variables
}
