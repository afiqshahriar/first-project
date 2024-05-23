public class CourseInformation {

    Marks marks;
    String courseCode, CourseTitle;
    int courseCredit;

    CourseInformation(){};

    CourseInformation (String courseCode, String courseTitle, int courseCredit){
        this.courseCode = courseCode;
        this.CourseTitle = courseTitle;
        this.courseCredit = courseCredit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }
}
