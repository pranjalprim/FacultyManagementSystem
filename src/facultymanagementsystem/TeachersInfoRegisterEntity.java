package facultymanagementsystem;
public class TeachersInfoRegisterEntity {
    private String teacherid;
    private String teachername;
    private String department;
    private String phonenumber;
    private String email;
    private String address;
    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TeachersInfoRegisterEntity() {
    }

    public TeachersInfoRegisterEntity(String teacherid, String teachername, String department, String phonenumber, String email, String address) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.department = department;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TeachersInfoRegisterEntity{");
        sb.append("teacherid=").append(teacherid);
        sb.append(", teachername=").append(teachername);
        sb.append(", department=").append(department);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    
    
}
