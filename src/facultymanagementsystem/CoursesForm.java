package facultymanagementsystem;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

public class CoursesForm extends javax.swing.JInternalFrame {
    AdministratorControl administratorcontrol = new AdministratorControl();
    List<CoursesEntityClass> courseinfo=new ArrayList<>();
    
    public CoursesForm() {
        initComponents();
        showRecords();
        showTable();
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(CoursesForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCoursepreq = new javax.swing.JTextField();
        coursedec = new javax.swing.JLabel();
        cmdDelete = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCoursedescription = new javax.swing.JTextArea();
        coursename = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        coursetab = new javax.swing.JTable();
        coursepreq = new javax.swing.JLabel();
        cmdPost = new javax.swing.JButton();
        txtCourseid = new javax.swing.JTextField();
        txtCoursename = new javax.swing.JTextField();
        courseid = new javax.swing.JLabel();
        cmdShow = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CoursesForm");
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

        jPanel1.setAutoscrolls(true);
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setInheritsPopupMenu(true);

        txtCoursepreq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCoursepreq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCoursepreqKeyPressed(evt);
            }
        });

        coursedec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coursedec.setText("Course Description");

        cmdDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDelete.setText("Delete ");
        cmdDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdUpdate.setText("Update");
        cmdUpdate.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        txtCoursedescription.setColumns(20);
        txtCoursedescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCoursedescription.setRows(5);
        txtCoursedescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCoursedescriptionKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtCoursedescription);

        coursename.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coursename.setText("Course Name");

        coursetab.setBackground(new java.awt.Color(242, 242, 242));
        coursetab.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        coursetab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coursetab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Name", "Course Id", "Course Description", "Course Prequisites"
            }
        ));
        coursetab.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        coursetab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursetabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(coursetab);
        if (coursetab.getColumnModel().getColumnCount() > 0) {
            coursetab.getColumnModel().getColumn(0).setPreferredWidth(140);
            coursetab.getColumnModel().getColumn(2).setPreferredWidth(140);
            coursetab.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        coursepreq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coursepreq.setText("Course Prerequisites");

        cmdPost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdPost.setText("Post");
        cmdPost.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPostActionPerformed(evt);
            }
        });

        txtCourseid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCourseid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCourseidKeyPressed(evt);
            }
        });

        txtCoursename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCoursename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCoursenameKeyPressed(evt);
            }
        });

        courseid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        courseid.setText("Course Id");

        cmdShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdShow.setText("Show");
        cmdShow.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(courseid)
                    .addComponent(coursename)
                    .addComponent(coursedec)
                    .addComponent(coursepreq))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmdPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCourseid)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(txtCoursepreq)
                                .addComponent(txtCoursename)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCoursename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursename))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseid)
                    .addComponent(txtCourseid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(coursedec)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCoursepreq, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursepreq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
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

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = administratorcontrol.getConnection();
            String sql = "update courseformtable set courseid=?,coursedec=?,coursepreq=? where coursename=?";
            PreparedStatement preparedStmt=conn.prepareStatement(sql);
            preparedStmt.setString(1, txtCourseid.getText());
            preparedStmt.setString(2, txtCoursedescription.getText());
            preparedStmt.setString(3, txtCoursepreq.getText());
            preparedStmt.setString(4, txtCoursename.getText());
            preparedStmt.execute();
            conn.close();
            showTable();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        try{
            Connection conn = administratorcontrol.getConnection();
            String sql="delete from courseformtable where coursename=?";
            PreparedStatement preparedStmt= conn.prepareStatement(sql);
            preparedStmt.setString(1, txtCoursename.getText());
            preparedStmt.execute();
            conn.close();
            showTable();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

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

    private void cmdPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPostActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn=administratorcontrol.getConnection();
            String sql="insert into courseformtable values(?,?,?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setString(1, txtCoursename.getText());
            preparedStmt.setString(2, txtCourseid.getText());
            preparedStmt.setString(3, txtCoursedescription.getText());
            preparedStmt.setString(4, txtCoursepreq.getText());
            preparedStmt.execute();
            conn.close();
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(CoursesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdPostActionPerformed

    private void cmdShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdShowActionPerformed
        // TODO add your handling code here:
        ShowCourse course = new ShowCourse();
        JDesktopPane desktopPane = this.getDesktopPane();
        desktopPane.add(course);
        course.setVisible(true);
        try{
            course.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdShowActionPerformed

    private void txtCoursenameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoursenameKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtCourseid.requestFocus();
        }
    }//GEN-LAST:event_txtCoursenameKeyPressed

    private void txtCourseidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCourseidKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtCoursedescription.requestFocus();
        }
    }//GEN-LAST:event_txtCourseidKeyPressed

    private void txtCoursedescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoursedescriptionKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(key==10){
            txtCoursepreq.requestFocus();
        }
    }//GEN-LAST:event_txtCoursedescriptionKeyPressed

    private void txtCoursepreqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoursepreqKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCoursepreqKeyPressed

    private List<CoursesEntityClass> showRecords(){  
        try{
            Connection conn=administratorcontrol.getConnection();
            String sql = "select * from courseformtable order by coursename asc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);            
            while(rs.next()){
                CoursesEntityClass  infoentity = new CoursesEntityClass (rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));                
                courseinfo.add(infoentity);                
            }
            conn.close();  
        }catch(Exception e){
            e.printStackTrace();
        }   
        return courseinfo;
    }
    private void showTable(){
        for(int i=coursetab.getRowCount()-1;i>-1;i--){
                ((DefaultTableModel)coursetab.getModel()).removeRow(i);
            }
        for(CoursesEntityClass  infocourse : courseinfo){
                ((DefaultTableModel)coursetab.getModel()).addRow(new Object[]{infocourse.getCoursename(),infocourse.getCourseid(),infocourse.getCoursedesc(),infocourse.getCoursepreq()});
            }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdPost;
    private javax.swing.JButton cmdShow;
    private javax.swing.JButton cmdUpdate;
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
    // End of variables declaration//GEN-END:variables
}
