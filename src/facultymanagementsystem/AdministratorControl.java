package facultymanagementsystem;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class AdministratorControl{
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://192.168.0.7:3306/facultyinformationdata","prim","4321");
            return conn;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public String checkPassword(String userID, String password){
        String returnValue="false";
        try{
            Connection conn=getConnection();            
            String query = "select userType from userinfo where userID=? and password=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, userID);
            preparedStmt.setString(2, password);
            ResultSet rs=preparedStmt.executeQuery();            
            if(rs.next()){
                returnValue=rs.getString(1);
            }            
        }catch(SQLException e){
            returnValue="false";
        }
        return returnValue;
    }

    public void addFunction(TeachersInfoRegisterEntity teacherinfo){
        try{
            Connection conn=getConnection();
            String sql1="select count(*) as num from teacherregistationtable where teacherid=?";
            PreparedStatement preparedStmt = conn.prepareStatement(sql1);
            preparedStmt.setString(1, teacherinfo.getTeacherid());
            ResultSet rs=preparedStmt.executeQuery();
            int count=0;
            if(rs.next()){
                count=rs.getInt(1);
            }
            if(count==0){
                String sql="insert into teacherregistationtable values (?,?,?,?,?,?)";
                preparedStmt=conn.prepareStatement(sql);
                preparedStmt.setString(1, teacherinfo.getTeacherid());
                preparedStmt.setString(2, teacherinfo.getTeachername());
                preparedStmt.setString(3, teacherinfo.getDepartment());
                preparedStmt.setString(4, teacherinfo.getPhonenumber());
                preparedStmt.setString(5, teacherinfo.getEmail());
                preparedStmt.setString(6, teacherinfo.getAddress());
                preparedStmt.execute();
                conn.close();
            }else{
                JOptionPane.showMessageDialog(null, "ID already exist");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void changeFunction(TeachersInfoRegisterEntity teacherinfo){
        try{
            Connection conn=getConnection();
            String sql="update teacherregistationtable  set teachername=?,department=?,phonenumber=?,email=?,address=? where teacherid=?";
            PreparedStatement preparedStmt=conn.prepareStatement(sql);
            preparedStmt.setString(1, teacherinfo.getTeachername());
            preparedStmt.setString(2, teacherinfo.getDepartment());
            preparedStmt.setString(3, teacherinfo.getPhonenumber());
            preparedStmt.setString(4, teacherinfo.getEmail());
            preparedStmt.setString(5, teacherinfo.getAddress());
            preparedStmt.setString(6, teacherinfo.getTeacherid());
            preparedStmt.execute();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void deleteFunction(TeachersInfoRegisterEntity teacherinfo){
         try{
             Connection conn=getConnection();
             String sql="delete from teacherregistationtable where teacherid=?";
             PreparedStatement preparedStmt=conn.prepareStatement(sql);
             preparedStmt.setString(1, teacherinfo.getTeacherid());
             preparedStmt.execute();
             conn.close();
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    public List<TeachersInfoRegisterEntity> showRecords(){  
        List<TeachersInfoRegisterEntity> allRec = new ArrayList<>();
        try{
            Connection conn=getConnection();
            String sql = "select * from teacherregistationtable order by teacherid asc";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);            
            while(rs.next()){
                TeachersInfoRegisterEntity teacherinfo = new TeachersInfoRegisterEntity(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));                
                allRec.add(teacherinfo);                
            }
            conn.close();  
        }catch(Exception e){
            e.printStackTrace();
        }   
        return allRec;
    }
}
