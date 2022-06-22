package facultymanagementsystem;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ShowCourse extends javax.swing.JInternalFrame {
    AdministratorControl administratorcontrol = new AdministratorControl();
    List<CoursesEntityClass> courseinfo=new ArrayList<>();

    public ShowCourse() {
        initComponents();
        showRecords();
        showTable();
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(ShowCourse.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCoursedescription = new javax.swing.JTextArea();
        coursename = new javax.swing.JLabel();
        cmdSearch = new javax.swing.JButton();
        coursedec = new javax.swing.JLabel();
        courseid = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        txtCoursepreq = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        coursetab = new javax.swing.JTable();
        coursepreq = new javax.swing.JLabel();
        txtCourseid = new javax.swing.JTextField();
        txtCoursename = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Course Details");
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

        txtCoursedescription.setColumns(20);
        txtCoursedescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCoursedescription.setRows(5);
        jScrollPane1.setViewportView(txtCoursedescription);

        coursename.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coursename.setText("Course Name");

        cmdSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdSearch.setText("Search");
        cmdSearch.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        coursedec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coursedec.setText("Course Description");

        courseid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        courseid.setText("Course Id");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        txtCoursepreq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        coursetab.setBackground(new java.awt.Color(242, 242, 242));
        coursetab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coursetab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Course Id", "Course Description", "Course Prequisites"
            }
        ));
        coursetab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursetabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(coursetab);

        coursepreq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coursepreq.setText("Course Prerequisites");

        txtCourseid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCoursename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursepreq)
                    .addComponent(coursedec)
                    .addComponent(courseid)
                    .addComponent(coursename))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCoursepreq, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(txtCourseid, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCoursename, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCoursename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursename))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseid)
                    .addComponent(txtCourseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCoursepreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coursepreq)))
                    .addComponent(coursedec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void coursetabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursetabMouseClicked
        // TODO add your handling code here:
        int row = coursetab.getSelectedRow();
        if(row==-1)
         return;
        txtCoursename.setText(coursetab.getValueAt(row, 0).toString());
        txtCourseid.setText(coursetab.getValueAt(row, 1).toString());
        txtCoursedescription.setText(coursetab.getValueAt(row, 2).toString());
        txtCoursepreq.setText(coursetab.getValueAt(row, 3).toString());
    }//GEN-LAST:event_coursetabMouseClicked

    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed
        // TODO add your handling code here:
        try{
            String us =txtSearch.getText();
            Connection conn=administratorcontrol.getConnection();
            PreparedStatement preparedStmt = conn.prepareStatement("select * from courseformtable where coursename like '%"+us+"' or courseid like '%"+us+"'");
            preparedStmt.execute();
            ResultSet rs=preparedStmt.executeQuery();
            if(rs.next()){
                String s = rs.getString(1);  
                String s1 = rs.getString(2);  
                String s2 = rs.getString(3);  
                String s3 = rs.getString(4);
                txtCoursename.setText(s);
                txtCourseid.setText(s1);
                txtCoursedescription.setText(s2);
                txtCoursepreq.setText(s3);
            }else{
                JOptionPane.showMessageDialog(null, "Course name not found");
            }
        }catch(HeadlessException | SQLException e){
        }
    }//GEN-LAST:event_cmdSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(checkEmpty()==true){
            JOptionPane.showMessageDialog(rootPane, "Fill the all blanks");
        }else{
           try{ 
            String us =txtSearch.getText();
            Connection conn=administratorcontrol.getConnection();
            PreparedStatement preparedStmt = conn.prepareStatement("select * from courseformtable where coursename like '%"+us+"' or courseid like '%"+us+"'");
            preparedStmt.execute();
            ResultSet rs=preparedStmt.executeQuery();
            if(rs.next()){
                String s = rs.getString(1);  
                String s1 = rs.getString(2);  
                String s2 = rs.getString(3);  
                String s3 = rs.getString(4);
                txtCoursename.setText(s);
                txtCourseid.setText(s1);
                txtCoursedescription.setText(s2);
                txtCoursepreq.setText(s3);
            }else{
                JOptionPane.showMessageDialog(null, "Course name not found");
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        }
        
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtSearchKeyReleased

    private void showTable(){
        for(int i=coursetab.getRowCount()-1;i>-1;i--){
                ((DefaultTableModel)coursetab.getModel()).removeRow(i);
            }
        for(CoursesEntityClass infocourse : courseinfo){
                ((DefaultTableModel)coursetab.getModel()).addRow(new Object[]{infocourse.getCoursename(),infocourse.getCourseid(),infocourse.getCoursedesc(),infocourse.getCoursepreq()});
            }        
    }

    private List<CoursesEntityClass> showRecords(){  
        try{
            Connection conn=administratorcontrol.getConnection();
            String sql = "select * from courseformtable order by coursename asc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);            
            while(rs.next()){
                CoursesEntityClass teacherinfo = new CoursesEntityClass(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));                
                courseinfo.add(teacherinfo);                
            }
            conn.close();  
        }catch(Exception e){
            e.printStackTrace();
        }   
        return null;
    }
     private boolean checkEmpty(){
        boolean returnVal=false;
        if(("".equals(txtSearch.getText()))){
            returnVal=true;
        }
        return returnVal;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdSearch;
    private javax.swing.JLabel coursedec;
    private javax.swing.JLabel courseid;
    private javax.swing.JLabel coursename;
    private javax.swing.JLabel coursepreq;
    private javax.swing.JTable coursetab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCoursedescription;
    private javax.swing.JTextField txtCourseid;
    private javax.swing.JTextField txtCoursename;
    private javax.swing.JTextField txtCoursepreq;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
