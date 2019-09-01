package tutoring_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> guestList = new LinkedList<String>();
        guestList.add("Safia");
        guestList.add("John");
        guestList.add("Christian");
        guestList.add("Anthony");

        Iterator it1 = guestList.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println(guestList.size());
        System.out.println("After Removing the node");
        guestList.remove(2);
        Iterator it2 = guestList.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());


        }
    }
}
