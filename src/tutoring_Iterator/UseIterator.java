package tutoring_Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseIterator {
    public static void main(String[] args) {
        ArrayList<String>location= new ArrayList<String>();
        location.add("NY");
        location.add("NJ");
        location.add("FL");
        Collections.sort(location);

        //Iterator: it allows us to traverse  the collection, add the
        // collection or remove the collection.

        Iterator iterator1= location.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("After Removing index #2 ");

        location.remove("NJ");
        Iterator iterator2= location.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
