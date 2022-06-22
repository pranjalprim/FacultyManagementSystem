package facultymanagementsystem;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class TeacherUserControl {
    AdministratorControl administratorcontrol = new AdministratorControl();
    public void addFunction(StudentRegisterEntity facultyinfo){
        try{
            Connection conn=administratorcontrol.getConnection();
            String sql1="select count(*) as num from facultyinformationtable where id=?";
            PreparedStatement preparedStmt = conn.prepareStatement(sql1);
            preparedStmt.setDouble(1, facultyinfo.getId());
            ResultSet rs=preparedStmt.executeQuery();
            int count=0;
            if(rs.next()){
                count=rs.getInt(1);
            }
            if(count==0){
              String sql="insert into facultyinformationtable values (?,?,?,?,?,?)";
              preparedStmt=conn.prepareStatement(sql);
              preparedStmt.setDouble(1, facultyinfo.getId());
              preparedStmt.setString(2, facultyinfo.getName());
              preparedStmt.setString(3, facultyinfo.getDepartment());
              preparedStmt.setDate(4, new java.sql.Date(facultyinfo.getDateofbirth().getTime()));              
              preparedStmt.setString(5, facultyinfo.getTelephonenumber());
              preparedStmt.setString(6, facultyinfo.getAddress());
              preparedStmt.execute();
              conn.close();
            }else{
                  JOptionPane.showMessageDialog(null, "ID already exist");
            }
        }catch(HeadlessException | SQLException e){
            e.printStackTrace();
        }
    }
    public void changeFunction(StudentRegisterEntity facultyinfo){
        try{
            Connection conn=administratorcontrol.getConnection();
            String sql="update facultyinformationtable  set name=?,department=?,dateofbirth=?,telephonenumber=?,address=? where id=?";
            PreparedStatement preparedStmt=conn.prepareStatement(sql);
            preparedStmt.setString(1, facultyinfo.getName());
            preparedStmt.setString(2, facultyinfo.getDepartment());
            preparedStmt.setDate(3, new java.sql.Date(facultyinfo.getDateofbirth().getTime()));
            preparedStmt.setString(4, facultyinfo.getTelephonenumber());
            preparedStmt.setString(5, facultyinfo.getAddress());
            preparedStmt.setDouble(6, facultyinfo.getId());
            preparedStmt.execute();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void deleteFunction(StudentRegisterEntity facultyinfo){
         try{
             Connection conn=administratorcontrol.getConnection();
             String sql="delete from facultyinformationtable where name=?";
             PreparedStatement preparedStmt=conn.prepareStatement(sql);
             preparedStmt.setString(1, facultyinfo.getName());
             preparedStmt.execute();
             conn.close();
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    public List<StudentRegisterEntity> showRecords(){  
        List<StudentRegisterEntity> allRec = new ArrayList<>();
        try{
            Connection conn=administratorcontrol.getConnection();
            String sql = "select * from facultyinformationtable order by id asc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);            
            while(rs.next()){
                StudentRegisterEntity infoentity = new StudentRegisterEntity(rs.getDouble(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(6),rs.getDate(4));                
                allRec.add(infoentity);                
            }
            conn.close();  
        }catch(Exception e){
            e.printStackTrace();
        }   
        return allRec;
    }
}
