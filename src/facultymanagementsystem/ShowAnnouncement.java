package facultymanagementsystem;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class ShowAnnouncement extends javax.swing.JInternalFrame {
    AdministratorControl administratorcontrol = new AdministratorControl();
    public ShowAnnouncement() {
        initComponents();
        showTable();
//        this.setSize(1150,610);
//        this.setClosable(true);
//        this.setMaximizable(true);
//        try {
//            this.setMaximum(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(ShowAnnouncement.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    private void showTable(){
        try{
            Connection conn=administratorcontrol.getConnection();
            String sql = "select * from tableannouncement";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel)announcementtable.getModel();
            model.setNumRows(0);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),rs.getString(2)
                });
            }
            conn.close();  
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        announcementtable = new javax.swing.JTable();
        cmdDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Show  Announcement");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/facultymanagementsystem/FourAL.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 500));

        announcementtable.setBackground(new java.awt.Color(242, 242, 242));
        announcementtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        announcementtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerialNo", "Announcement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        announcementtable.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(announcementtable);
        if (announcementtable.getColumnModel().getColumnCount() > 0) {
            announcementtable.getColumnModel().getColumn(0).setMinWidth(70);
            announcementtable.getColumnModel().getColumn(0).setPreferredWidth(70);
            announcementtable.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        cmdDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDelete.setText("Delete");
        cmdDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        int row = announcementtable.getSelectedRow();
        if(row>-1){
            String serialNo=announcementtable.getValueAt(row, 0).toString();
            try{
                Connection conn=administratorcontrol.getConnection();
                String sql = "delete from tableannouncement where serialNo="+serialNo;
                Statement stmt = conn.createStatement();
                stmt.execute(sql);                
                conn.close();  
                showTable();
            }catch(Exception e){
                e.printStackTrace();
            } 
        }
        
    }//GEN-LAST:event_cmdDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable announcementtable;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
