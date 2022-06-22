package facultymanagementsystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
public class StudentRegisterForm extends javax.swing.JInternalFrame {
    AdministratorControl administratorcontrol = new AdministratorControl();
    TeacherUserControl  teacherusercontrol = new TeacherUserControl();
    List<StudentRegisterEntity> infofacaulty=new ArrayList<>();
    
    private SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
    public StudentRegisterForm() {
        initComponents();
        infofacaulty=teacherusercontrol.showRecords();
        showTable();
        dtDOB.setDate(new Date());
        TableColumn c1 = facultyinformationtable.getColumnModel().getColumn(6);
        c1.setCellRenderer(new ButtonRenderer());
        c1.setCellEditor(new ButtonEditor(new JCheckBox()));
        AutoCompletion.enable(txtdepartment);
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(StudentRegisterForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtdepartment = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        dateofbirth = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        facultyinformationtable = new javax.swing.JTable();
        txtname = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        txttelephonenumber = new javax.swing.JTextField();
        cmdDelete = new javax.swing.JButton();
        cmdAdd = new javax.swing.JButton();
        telephonenumber = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        cmdChange = new javax.swing.JButton();
        address = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        cmdPrint = new javax.swing.JButton();
        cmdShow = new javax.swing.JButton();
        dtDOB = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Student Information Register Form");
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtdepartment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtdepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "ECE", "CE", "Macanical", "Arch" }));
        txtdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepartmentActionPerformed(evt);
            }
        });
        txtdepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdepartmentKeyPressed(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
        });

        dateofbirth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dateofbirth.setText("Date Of Birth");

        facultyinformationtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        facultyinformationtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Department", "Date of Birth", "Telephone No.", "Address", "View"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        facultyinformationtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        facultyinformationtable.setRowHeight(36);
        facultyinformationtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyinformationtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(facultyinformationtable);
        if (facultyinformationtable.getColumnModel().getColumnCount() > 0) {
            facultyinformationtable.getColumnModel().getColumn(0).setMinWidth(80);
            facultyinformationtable.getColumnModel().getColumn(0).setPreferredWidth(80);
            facultyinformationtable.getColumnModel().getColumn(1).setMinWidth(150);
            facultyinformationtable.getColumnModel().getColumn(1).setPreferredWidth(150);
            facultyinformationtable.getColumnModel().getColumn(2).setMinWidth(150);
            facultyinformationtable.getColumnModel().getColumn(2).setPreferredWidth(150);
            facultyinformationtable.getColumnModel().getColumn(3).setMinWidth(80);
            facultyinformationtable.getColumnModel().getColumn(3).setPreferredWidth(80);
            facultyinformationtable.getColumnModel().getColumn(4).setMinWidth(100);
            facultyinformationtable.getColumnModel().getColumn(4).setPreferredWidth(100);
            facultyinformationtable.getColumnModel().getColumn(5).setMinWidth(300);
            facultyinformationtable.getColumnModel().getColumn(5).setPreferredWidth(300);
            facultyinformationtable.getColumnModel().getColumn(6).setMinWidth(80);
            facultyinformationtable.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        txtname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setText("ID");

        txttelephonenumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttelephonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelephonenumberKeyPressed(evt);
            }
        });

        cmdDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdAdd.setText("Add");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        telephonenumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telephonenumber.setText("Telephone No.");

        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setText("Name");

        cmdChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdChange.setText("Change");
        cmdChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdChangeActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address.setText("Address");

        department.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        department.setText("Department");

        txtid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidKeyPressed(evt);
            }
        });

        cmdPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdPrint.setText("Print");
        cmdPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrintActionPerformed(evt);
            }
        });

        cmdShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdShow.setText("Show");
        cmdShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdShowActionPerformed(evt);
            }
        });

        dtDOB.setDateFormatString("dd/MM/yyyy");
        dtDOB.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        dtDOB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dtDOB.setMinSelectableDate(new java.util.Date(-62135787513000L));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id)
                    .addComponent(dateofbirth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(name)
                                .addGap(185, 185, 185)
                                .addComponent(department)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmdAdd)
                                .addGap(18, 18, 18)
                                .addComponent(cmdChange)
                                .addGap(18, 18, 18)
                                .addComponent(cmdDelete)
                                .addGap(18, 18, 18)
                                .addComponent(cmdPrint)
                                .addGap(18, 18, 18)
                                .addComponent(cmdShow)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(telephonenumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttelephonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addComponent(address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmdAdd, cmdChange, cmdDelete, cmdPrint, cmdShow});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(department)
                    .addComponent(txtdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dateofbirth)
                    .addComponent(dtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephonenumber)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(address)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttelephonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdChange)
                    .addComponent(cmdDelete)
                    .addComponent(cmdPrint)
                    .addComponent(cmdShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmdAdd, cmdChange, cmdDelete, cmdPrint, cmdShow});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // TODO add your handling code here:
        if(checkEmpty()==true){
            JOptionPane.showMessageDialog(null, "Fill the all blanks");
        }
        else if(checkValidity()==true){
            JOptionPane.showMessageDialog(rootPane, "Enter the invalid number"); 
        }else{
            StudentRegisterEntity infoentity=new StudentRegisterEntity(Double.parseDouble(txtid.getText()),
                    txtname.getText(),txtdepartment.getSelectedItem().toString(),txttelephonenumber.getText(),
                    txtAddress.getText(), dtDOB.getDate());
            teacherusercontrol.addFunction(infoentity);
            infofacaulty=teacherusercontrol.showRecords();
            showTable();
        }
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdChangeActionPerformed
        // TODO add your handling code here:
        if(checkEmpty()==true){
            JOptionPane.showMessageDialog(null, "Fill the all blanks");
        }
        else if(checkDuplicay(Double.parseDouble(txtid.getText()),txtname.getText())==true){
            JOptionPane.showMessageDialog(rootPane, "Name Has duplicacy"); 
        }else{
            StudentRegisterEntity infoentity=new StudentRegisterEntity(Double.parseDouble(txtid.getText()),txtname.getText(),txtdepartment.getSelectedItem().toString(),txttelephonenumber.getText(),txtAddress.getText(),dtDOB.getDate());
            teacherusercontrol.changeFunction(infoentity);
            infofacaulty=teacherusercontrol.showRecords();
            showTable();
        }
    }//GEN-LAST:event_cmdChangeActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null, "Do you want to Delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(p==0){
             StudentRegisterEntity infoentity=new StudentRegisterEntity(Double.parseDouble(txtid.getText()),txtname.getText(),
                txtdepartment.getSelectedItem().toString(),txttelephonenumber.getText(),txtAddress.getText(),dtDOB.getDate());
        teacherusercontrol.deleteFunction(infoentity);
        infofacaulty=teacherusercontrol.showRecords();
        showTable();
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void facultyinformationtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyinformationtableMouseClicked
        // TODO add your handling code here:
        int row = facultyinformationtable.getSelectedRow();
        int coloum=facultyinformationtable.getSelectedColumn();
        try{
        if(row==-1){
             return;
        }
            if(coloum==6){
                   StudentRegisterEntity infoentity=new StudentRegisterEntity(Double.parseDouble(facultyinformationtable.getValueAt(row, 0).toString()),
                           facultyinformationtable.getValueAt(row, 1).toString(),
                           facultyinformationtable.getValueAt(row, 2).toString(),
                           facultyinformationtable.getValueAt(row, 4).toString(),
                           facultyinformationtable.getValueAt(row, 5).toString(),
                           dt.parse(facultyinformationtable.getValueAt(row, 3).toString()));
                   teacherusercontrol.deleteFunction(infoentity);  
                   infofacaulty=teacherusercontrol.showRecords();
                   showTable();
            }else{        

                    txtid.setText(facultyinformationtable.getValueAt(row, 0).toString());
                    txtname.setText(facultyinformationtable.getValueAt(row, 1).toString());
                    txtdepartment.setSelectedItem(facultyinformationtable.getValueAt(row, 2).toString());
                    dtDOB.setDate(dt.parse(facultyinformationtable.getValueAt(row, 3).toString()));
                    txttelephonenumber.setText(facultyinformationtable.getValueAt(row, 4).toString());
                    txtAddress.setText(facultyinformationtable.getValueAt(row, 5).toString());

            } 
        }catch(ParseException ex){
                System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_facultyinformationtableMouseClicked

    private void txtdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartmentActionPerformed

    private void cmdPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrintActionPerformed
        // TODO add your handling code here:
        try{
            Map<String,Object> param = new HashMap<>();
            param.put("studentreporthead1","Student Information");
            JasperPrint jasperPrint;
            jasperPrint=JasperFillManager.fillReport("./report/StudentInformation.jasper",param,new JRBeanCollectionDataSource(infofacaulty));
            JInternalFrame cframe = new JInternalFrame("Reports Viewer");
            cframe.getContentPane().add(new JRViewer(jasperPrint));
            cframe.setSize(1150,610);
            cframe.setClosable(true);
            cframe.setMaximizable(true);
            cframe.setMaximum(true);
            JDesktopPane addPane = this.getDesktopPane();
            addPane.add(cframe);
            cframe.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdPrintActionPerformed

    private void cmdShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdShowActionPerformed
        // TODO add your handling code here:
        StudentInquiryForm inquir = new StudentInquiryForm();
        JDesktopPane desktopPane = this.getDesktopPane();
        desktopPane.add(inquir);
        inquir.setVisible(true);
        try{
            inquir.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdShowActionPerformed

    private void txtidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtname.requestFocus();
        }
    }//GEN-LAST:event_txtidKeyPressed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtdepartment.requestFocus();
        }
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtdepartmentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdepartmentKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            dtDOB.requestFocus();
        }
    }//GEN-LAST:event_txtdepartmentKeyPressed

    private void txttelephonenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelephonenumberKeyPressed
        int key=evt.getKeyCode();
        if(key==10){
            txtAddress.requestFocus();
        }
    }//GEN-LAST:event_txttelephonenumberKeyPressed

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtid.requestFocus();
        }
    }//GEN-LAST:event_txtAddressKeyPressed

    private boolean checkEmpty(){
        boolean returnVal=false;
        if((txtid.getText().trim().length()==0)||("".equals(txtname.getText()))||("".equals(dtDOB.getDate())) || ("".equals(txttelephonenumber.getText())) ){
            returnVal=true;
        }
        return returnVal;
    }
    private void showTable(){
        for(int i=facultyinformationtable.getRowCount()-1;i>-1;i--){
                ((DefaultTableModel)facultyinformationtable.getModel()).removeRow(i);
            }
        for(StudentRegisterEntity facultyinfo : infofacaulty){
                ((DefaultTableModel)facultyinformationtable.getModel()).addRow(new Object[]{facultyinfo.getId(),
                    facultyinfo.getName(),facultyinfo.getDepartment(),dt.format(facultyinfo.getDateofbirth()),
                    facultyinfo.getTelephonenumber(),facultyinfo.getAddress(),"Remove"});
            }        
    }

    public boolean checkDuplicay(double id,String name){
        boolean returnVal=false;
        try{
            java.sql.Connection conn=administratorcontrol.getConnection();            
            String query = "select count(*) name from facultyinformationtable where name=? and id!=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, name);
            preparedStmt.setDouble(2, id);
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
            Integer.parseInt(txttelephonenumber.getText());
        }catch (NumberFormatException e){
            return true;
        }
        return false; 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdChange;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdPrint;
    private javax.swing.JButton cmdShow;
    private javax.swing.JLabel dateofbirth;
    private javax.swing.JLabel department;
    private com.toedter.calendar.JDateChooser dtDOB;
    private javax.swing.JTable facultyinformationtable;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel telephonenumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JComboBox<String> txtdepartment;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttelephonenumber;
    // End of variables declaration//GEN-END:variables
}
