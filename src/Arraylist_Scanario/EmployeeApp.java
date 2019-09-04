package Arraylist_Scanario;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {

    static ArrayList<Employee> list = new ArrayList<Employee>();

    static void pushElement(Employee obj) {
        list.add(obj);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many Employee's information to be stored?");
        int count = sc.nextInt();

        for (int i = 0; i <= count; i++) {
            System.out.println("Enter Employee ID: ");
            int eid = sc.nextInt();

            System.out.println("Enter Employee Name: ");
            String ename = sc.next();

            System.out.println("Enter Department ID: ");
            int did = sc.nextInt();

            System.out.println("Enter Department Name");
            String dname = sc.next();

            System.out.println("Enter Department designation: ");
            String designation = sc.next();

            Department d = new Department(did, dname, designation);
            Employee eobj = new Employee(eid, ename, d);
            pushElement(eobj);
        }

        System.out.println("--- Employee Information ---");

        for (Employee obj : list) {
            System.out.println("Employee ID: " + obj.eID);
            System.out.println("Employee Name: " + obj.eName);
            Department department = obj.department;
            System.out.println("Department ID: " + obj.department.dID);
            System.out.println("Department Name :" + obj.department.dName);
            System.out.println("Department designation " + obj.department.designation);
        }
    }
}

