package facultymanagementsystem;
import java.util.Date;

public class StudentRegisterEntity {
    private double id;
    private String name;
    private String department;    
    private String telephonenumber;
    private String address;
    private Date dateofbirth;   
    

    public StudentRegisterEntity() {
    }

    public StudentRegisterEntity(double id, String name, String department, String telephonenumber, String address, Date dateofbirth) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.telephonenumber = telephonenumber;
        this.address = address;
        this.dateofbirth = dateofbirth;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    
}
