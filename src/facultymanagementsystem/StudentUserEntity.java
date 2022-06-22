package facultymanagementsystem;
public class StudentUserEntity {
    private String commonid;
    private String commonname;
    private String commonpassword;
    public String getCommonid() {
        return commonid;
    }

    public void setCommonid(String commonid) {
        this.commonid = commonid;
    }

    public String getCommonname() {
        return commonname;
    }

    public void setCommonname(String commonname) {
        this.commonname = commonname;
    }

    public String getCommonpassword() {
        return commonpassword;
    }

    public void setCommonpassword(String commonpassword) {
        this.commonpassword = commonpassword;
    }

    public StudentUserEntity(String commonid, String commonname, String commonpassword) {
        this.commonid = commonid;
        this.commonname = commonname;
        this.commonpassword = commonpassword;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommonUserEntity{");
        sb.append("commonid=").append(commonid);
        sb.append(", commonname=").append(commonname);
        sb.append(", commonpassword=").append(commonpassword);
        sb.append('}');
        return sb.toString();
    }
}
