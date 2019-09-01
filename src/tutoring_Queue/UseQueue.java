package tutoring_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String>patientList= new LinkedList<String>();
        patientList.add("John");
        patientList.add("Ebube");
        patientList.add("Maria");
        patientList.add("Danny");

        System.out.println(patientList.peek());
        patientList.poll();
        System.out.println(patientList.peek());
    }
}
