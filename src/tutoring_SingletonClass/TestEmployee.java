package tutoring_SingletonClass;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1= Employee.getInstance();
        employee1.employeeDetail();
    }
}
