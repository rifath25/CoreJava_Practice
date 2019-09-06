package tutoring_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> patientList = new LinkedList<String>();
        patientList.add("John");
        patientList.add("Ebube");
        patientList.add("Maria");
        patientList.add("Danny");

//        System.out.println(patientList.peek());
//        patientList.poll();
//        patientList.remove();
//        System.out.println(patientList.peek());
//
//        System.out.println(patientList.peek());
//        patientList.poll();
//        System.out.println(patientList.peek());
//        patientList.poll();

        System.out.println(patientList.size());
        Iterator it= patientList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}

