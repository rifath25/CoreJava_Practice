package tutoring_Encapsulation;

public class Student {
    private String studentName;
    private int studentAge;
    private String studentDOB;

    public Student (){}

    public Student(String studentName, int studentAge, String studentDOB) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentDOB = studentDOB;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(String studentDOB) {
        this.studentDOB = studentDOB;
    }
/*
When you log into your email accounts such as Gmail, Yahoo mail, or Rediff mail,
there is a lot of internal processes taking place in the backend and you have no
control over it. When you enter the password for logging, they are retrieved in an
encrypted form and verified and then you are given the access to your account.
You do not have control over it that how the password has been verified. T
hus, it keeps our account safe from being misused.
 */


}