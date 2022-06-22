package facultymanagementsystem;
public class DepartementEntityClass {
    private String deptname;
    private String deptid;

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public DepartementEntityClass(String deptname, String deptid) {
        this.deptname = deptname;
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepartementEntityClass{");
        sb.append("deptname=").append(deptname);
        sb.append(", deptid=").append(deptid);
        sb.append('}');
        return sb.toString();
    }
}
