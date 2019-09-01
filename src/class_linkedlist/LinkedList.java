package class_linkedlist;

import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String>list= new java.util.LinkedList<String>();
        list.add("NY");
        list.add("NJ");
        list.add("FL");

        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        list.remove("FL");
        System.out.println("AFTER REMOVING........");
        Iterator iterator2= list.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
