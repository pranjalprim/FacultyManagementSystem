package facultymanagementsystem;
public class CoursesEntityClass {
    private String coursename;
    private String courseid;
    private String coursedesc;
    private String coursepreq;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursedesc() {
        return coursedesc;
    }

    public void setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc;
    }

    public String getCoursepreq() {
        return coursepreq;
    }

    public void setCoursepreq(String coursepreq) {
        this.coursepreq = coursepreq;
    }

    public CoursesEntityClass(String coursename, String courseid, String coursedesc, String coursepreq) {
        this.coursename = coursename;
        this.courseid = courseid;
        this.coursedesc = coursedesc;
        this.coursepreq = coursepreq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoursesEntityClass{");
        sb.append("coursename=").append(coursename);
        sb.append(", courseid=").append(courseid);
        sb.append(", coursedesc=").append(coursedesc);
        sb.append(", coursepreq=").append(coursepreq);
        sb.append('}');
        return sb.toString();
    }
}
