package tutoring_Stack;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Stack;

public class HospitalPatients {
    public static void main(String[] args) {
        Stack<String> patientName= new Stack<String>();
        patientName.push("Chistian ");
        patientName.push("Lucan");
        patientName.push("Anny");
        patientName.push("Marsha");
        patientName.push("Brandan");
        HospitalPatients hospitalPatients= new HospitalPatients();
        hospitalPatients.patientID();

//        System.out.println(patientName.firstElement());
//        System.out.println(patientName.lastElement());
//
//        System.out.println(patientName.peek());
//        System.out.println(patientName.search("Lucan"));
//        System.out.println(patientName.peek());
//        patientName.pop();
//        System.out.println(patientName.peek());
//        System.out.println(patientName.capacity());
//

    }


    public Stack<Integer>patientID(){
        Stack<Integer>id= new Stack<>();
      id.push(101);
      id.push(102);
      id.push(103);

        System.out.println(id.peek());
        id.pop();
        System.out.println(id.peek());

      return id;

    }


}
