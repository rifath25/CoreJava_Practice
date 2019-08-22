package tutoring_Encapsulation;

public class StudentDatabase {
    public static void main(String[] args) {
        Student student1Information = new Student("Rifath", 19, "Feb 10,2000");

        System.out.println("Student name is: " + student1Information.getStudentName() );
        System.out.println("Student age is: " + student1Information.getStudentAge() );
        System.out.println("Student DOB is: " + student1Information.getStudentDOB() );

        System.out.println("--------------------------------------------------------------------------");

        Student student2Information = new Student("Subah", 10, "Jan 1, 2009");

        student2Information.setStudentName("Samia");
        System.out.println("Student name is: " + student2Information.getStudentName() );
        System.out.println("Student age is: " + student2Information.getStudentAge() );
        System.out.println("Student DOB is: " + student2Information.getStudentDOB() );


    }

}
