package Arraylist_Scanario;

public class Employee {
    /*
    Write a java program that contains an Employee class with the following properties.
    eid (type is int), ename (type is String), Department (type is Department).
    Now create another class named Department which contains the properties
    did(type is int), dname(type is String) and designation (type is String).
    Now create another class named EmployeeApp which contains the main method.

    Now write code that prompts the user to enter the Employee details like id, name,
    and prompt Department details like department id, name and designation details in
    ArrayList<Employee> object. Enter at least 3 employees and department info print those
    details to the output by iterating through Department ArrayList. Another important thing
    is that the property Department in Employee class should be of type Department
    (which is a class).
    */

    int eID;
    String eName;
    Department department;


    public Employee(int eID, String eName, Department department) {
        this.eID = eID;
        this.eName = eName;
        this.department= department;

    }


}
