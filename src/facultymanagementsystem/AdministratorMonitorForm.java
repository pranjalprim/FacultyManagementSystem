package facultymanagementsystem;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
public class AdministratorMonitorForm extends javax.swing.JFrame {
    StudentRegisterForm  fif = new StudentRegisterForm();
    public AdministratorMonitorForm() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        curDateTime();
    }
    
    public AdministratorMonitorForm(String userType) {
       initComponents();
       curDateTime();
       this.setExtendedState(MAXIMIZED_BOTH);
       lblUser.setText(userType);
       if(userType.equals("User")){
           registerinfo.setVisible(false);
           postannouncement.setVisible(false);
           adminisChanPass.setVisible(false);
       }
       if(userType.equals("Teacher")){
           teacherregisterinfo.setVisible(false);
           adminisChanPass.setVisible(false);
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        ImageIcon icon=new ImageIcon(getClass().getResource("/images/download.png"));
        Image img=icon.getImage();
        DesktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g) {
                {
                    g.drawImage(img,0,0,this.getSize().width,this.getSize().height,null);
                }
            }
        };
        lblUser = new javax.swing.JLabel();
        dateTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        list = new javax.swing.JMenu();
        teachersinfo = new javax.swing.JMenuItem();
        studentinfo = new javax.swing.JMenuItem();
        showcourse = new javax.swing.JMenuItem();
        mnuExit1 = new javax.swing.JMenuItem();
        registerinfo = new javax.swing.JMenu();
        teacherregisterinfo = new javax.swing.JMenuItem();
        studentregisterinfo = new javax.swing.JMenuItem();
        coursesform = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        postannouncement = new javax.swing.JMenuItem();
        showannouncement = new javax.swing.JMenuItem();
        utility = new javax.swing.JMenu();
        changepassword = new javax.swing.JMenuItem();
        adminisChanPass = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenuItem2.setText("jMenuItem2");

        jMenu4.setText("jMenu4");

        jMenu1.setText("File");
        jMenuBar3.add(jMenu1);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopPane.setBackground(new java.awt.Color(0, 0, 0));
        DesktopPane.setAutoscrolls(true);
        DesktopPane.setDoubleBuffered(true);
        DesktopPane.setFocusTraversalPolicyProvider(true);
        DesktopPane.setInheritsPopupMenu(true);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        lblUser.setText("jLabel1");

        dateTime.setText("jLabel2");

        jMenuBar1.setBackground(new java.awt.Color(242, 242, 242));
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setDoubleBuffered(true);
        jMenuBar1.setFocusCycleRoot(true);
        jMenuBar1.setFocusTraversalPolicyProvider(true);
        jMenuBar1.setInheritsPopupMenu(true);

        list.setBackground(new java.awt.Color(242, 242, 242));
        list.setText("List of Information           ");
        list.setDoubleBuffered(true);
        list.setFocusCycleRoot(true);
        list.setFocusPainted(true);
        list.setFocusTraversalPolicyProvider(true);
        list.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        list.setHideActionText(true);
        list.setInheritsPopupMenu(true);
        list.setOpaque(true);

        teachersinfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        teachersinfo.setText("Teachers Information");
        teachersinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersinfoActionPerformed(evt);
            }
        });
        list.add(teachersinfo);

        studentinfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        studentinfo.setText("Student Information");
        studentinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentinfoActionPerformed(evt);
            }
        });
        list.add(studentinfo);

        showcourse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showcourse.setText("Show Course");
        showcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcourseActionPerformed(evt);
            }
        });
        list.add(showcourse);

        mnuExit1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnuExit1.setText("Exit");
        mnuExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExit1ActionPerformed(evt);
            }
        });
        list.add(mnuExit1);

        jMenuBar1.add(list);

        registerinfo.setBackground(new java.awt.Color(242, 242, 242));
        registerinfo.setText("Register Of Information             ");
        registerinfo.setAutoscrolls(true);
        registerinfo.setDoubleBuffered(true);
        registerinfo.setFocusCycleRoot(true);
        registerinfo.setFocusPainted(true);
        registerinfo.setFocusTraversalPolicyProvider(true);
        registerinfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        registerinfo.setHideActionText(true);
        registerinfo.setInheritsPopupMenu(true);
        registerinfo.setOpaque(true);

        teacherregisterinfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        teacherregisterinfo.setText("Teachers Information Register");
        teacherregisterinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherregisterinfoActionPerformed(evt);
            }
        });
        registerinfo.add(teacherregisterinfo);

        studentregisterinfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        studentregisterinfo.setText("Student Information Register");
        studentregisterinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentregisterinfoActionPerformed(evt);
            }
        });
        registerinfo.add(studentregisterinfo);

        coursesform.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coursesform.setText("Courses  Setup");
        coursesform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesformActionPerformed(evt);
            }
        });
        registerinfo.add(coursesform);

        jMenuBar1.add(registerinfo);

        jMenu8.setBackground(new java.awt.Color(242, 242, 242));
        jMenu8.setText("Announcement              ");
        jMenu8.setAutoscrolls(true);
        jMenu8.setDoubleBuffered(true);
        jMenu8.setFocusCycleRoot(true);
        jMenu8.setFocusPainted(true);
        jMenu8.setFocusTraversalPolicyProvider(true);
        jMenu8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu8.setInheritsPopupMenu(true);
        jMenu8.setOpaque(true);

        postannouncement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        postannouncement.setText("Post announcement");
        postannouncement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postannouncementActionPerformed(evt);
            }
        });
        jMenu8.add(postannouncement);

        showannouncement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        showannouncement.setText("Announcement");
        showannouncement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showannouncementActionPerformed(evt);
            }
        });
        jMenu8.add(showannouncement);

        jMenuBar1.add(jMenu8);

        utility.setBackground(new java.awt.Color(242, 242, 242));
        utility.setText("Utility                ");
        utility.setAutoscrolls(true);
        utility.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        utility.setDoubleBuffered(true);
        utility.setFocusCycleRoot(true);
        utility.setFocusPainted(true);
        utility.setFocusTraversalPolicyProvider(true);
        utility.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        utility.setHideActionText(true);
        utility.setInheritsPopupMenu(true);
        utility.setOpaque(true);
        utility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilityActionPerformed(evt);
            }
        });

        changepassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        changepassword.setText("Change Password");
        changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordActionPerformed(evt);
            }
        });
        utility.add(changepassword);

        adminisChanPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adminisChanPass.setText("Administrator Set Password");
        adminisChanPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminisChanPassActionPerformed(evt);
            }
        });
        utility.add(adminisChanPass);

        jMenuBar1.add(utility);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTime)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentinfoActionPerformed
        // TODO add your handling code here:
        StudentInquiryForm infocommon=new StudentInquiryForm();
        infocommon.setVisible(true);
        DesktopPane.add(infocommon);
        Dimension desktopSize = DesktopPane.getSize();
        Dimension internalFrameSize = infocommon.getSize();
        infocommon.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            infocommon.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_studentinfoActionPerformed

    private void teacherregisterinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherregisterinfoActionPerformed
        // TODO add your handling code here:
        TeachersInfoRegister teacherregister = new TeachersInfoRegister();
        teacherregister.setVisible(true);
        DesktopPane.add(teacherregister );
        Dimension desktopSize = DesktopPane.getSize();
        Dimension internalFrameSize = teacherregister.getSize();
        teacherregister.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            teacherregister.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_teacherregisterinfoActionPerformed

    private void teachersinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersinfoActionPerformed
        // TODO add your handling code here:
        TeachersInfo infoteacher = new TeachersInfo();
        infoteacher.setVisible(true);
        DesktopPane.add(infoteacher);
        Dimension desktopSize = DesktopPane.getSize();
        Dimension internalFrameSize = infoteacher.getSize();
        infoteacher.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            infoteacher.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_teachersinfoActionPerformed

    private void studentregisterinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentregisterinfoActionPerformed
        // TODO add your handling code here:
        StudentRegisterForm facultyinfo=new StudentRegisterForm();
        facultyinfo.setVisible(true);
        DesktopPane.add(facultyinfo);
        Dimension desktopSize = DesktopPane.getSize();
        Dimension internalFrameSize = facultyinfo.getSize();
        facultyinfo.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            facultyinfo.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_studentregisterinfoActionPerformed

    private void showannouncementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showannouncementActionPerformed
        // TODO add your handling code here:
        ShowAnnouncement showAnnouncement = new ShowAnnouncement ();
        showAnnouncement.setVisible(true);
        Dimension desktopSize=DesktopPane.getSize();
        DesktopPane.add(showAnnouncement);
        Dimension internalFrameSize = showAnnouncement.getSize();
        showAnnouncement.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            showAnnouncement.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_showannouncementActionPerformed

    private void postannouncementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postannouncementActionPerformed
        // TODO add your handling code here:
        PostAnnouncement postAnnouncement = new PostAnnouncement();
        postAnnouncement.setVisible(true);
        Dimension desktopSize=DesktopPane.getSize();
        DesktopPane.add(postAnnouncement);
        Dimension internalFrameSize = postAnnouncement.getSize();
        postAnnouncement.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            postAnnouncement.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_postannouncementActionPerformed

    private void coursesformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesformActionPerformed
        // TODO add your handling code here:
        CoursesForm courseForm = new CoursesForm();
        courseForm.setVisible(true);
        DesktopPane.add(courseForm );
        Dimension desktopSize = DesktopPane.getSize();
        Dimension internalFrameSize = courseForm.getSize();
        courseForm.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            courseForm.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_coursesformActionPerformed

    private void changepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordActionPerformed
        // TODO add your handling code here:
        ChangePassword changPass = new ChangePassword();
        changPass.setVisible(true);
        DesktopPane.add(changPass);
        Dimension desktopSize = DesktopPane.getSize();
        Dimension internalFrameSize = changPass.getSize();
        changPass.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            changPass.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_changepasswordActionPerformed

    private void adminisChanPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminisChanPassActionPerformed
        // TODO add your handling code here:
        AdministratorSetPassword adminSetpassword = new AdministratorSetPassword();
        adminSetpassword.setVisible(true);
        DesktopPane.add(adminSetpassword);
        Dimension desktopSize = DesktopPane.getSize();
        Dimension internalFrameSize = adminSetpassword.getSize();
        adminSetpassword.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            adminSetpassword.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_adminisChanPassActionPerformed

    private void mnuExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExit1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuExit1ActionPerformed

    private void showcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcourseActionPerformed
        // TODO add your handling code here:\
        ShowCourse show = new ShowCourse();
        show.setVisible(true);
        DesktopPane.add(show);
        Dimension desktopSize = DesktopPane.getSize();
        Dimension internalFrameSize = show.getSize();
        show.setLocation((desktopSize.width-internalFrameSize.width)/2,(desktopSize.height-internalFrameSize.height)/2);
        try{
            show.setSelected(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_showcourseActionPerformed

    public void curDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dateTime.setText(dtf.format(now));
    }
    private void utilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utilityActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministratorMonitorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorMonitorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorMonitorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorMonitorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
//        SwingUtilities.invokeLater(() -> {
//                    AdministratorMonitorForm frame=new AdministratorMonitorForm();
//                    frame.pack();
//                    frame.setVisible(true);
//                    frame.setExtendedState(frame.MAXIMIZED_BOTH);
//                });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuItem adminisChanPass;
    private javax.swing.JMenuItem changepassword;
    private javax.swing.JMenuItem coursesform;
    private javax.swing.JLabel dateTime;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenu list;
    private javax.swing.JMenuItem mnuExit1;
    private javax.swing.JMenuItem postannouncement;
    private javax.swing.JMenu registerinfo;
    private javax.swing.JMenuItem showannouncement;
    private javax.swing.JMenuItem showcourse;
    private javax.swing.JMenuItem studentinfo;
    private javax.swing.JMenuItem studentregisterinfo;
    private javax.swing.JMenuItem teacherregisterinfo;
    private javax.swing.JMenuItem teachersinfo;
    private javax.swing.JMenu utility;
    // End of variables declaration//GEN-END:variables
}
