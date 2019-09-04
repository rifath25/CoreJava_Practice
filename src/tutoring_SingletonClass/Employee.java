package tutoring_SingletonClass;

/*
the java class that allows us to create only one object per JVM
is called Singleton Java Class.
 */

public class Employee {
    private String eNum;
    private int eID;

    private Employee(){
        this.eNum= eNum;
        this.eID=eID;
    }
    private static Employee employee= new Employee();

    public static Employee getInstance(){
        return employee;
    }

    public void employeeDetail(){
        System.out.println("WELCOME TO THE EMPLOYEE APP");
    }
}

