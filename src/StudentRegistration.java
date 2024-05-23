import java.util.ArrayList;

public class StudentRegistration {
    Address address;
    ArrayList<CourseInformation> courseInformation = new ArrayList<>();
    String studentName, gender, fathersName, mothersName, mobileNo, email;
    int id;

    StudentRegistration() {
    }

    ;

    StudentRegistration(String studentName, int id, String gender, String fathersName, String mothersName, String mobileNo, String email) {
        this.studentName = studentName;
        this.id = id;
        this.gender = gender;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    //setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //getter methods
    public String getStudentName() {
        return studentName;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }
}
