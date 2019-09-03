package tutoring_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PracticeArrayList {
    public static void main(String[] args) {
        List<String> location = new ArrayList<String>();
        location.add("NY");
        location.add("NJ");
        location.add("FL");
        location.add("TX");

        Collections.sort(location);
//        for (String s: location){
//            System.out.println(s);

        for (int i = 0; i < location.size(); i++) {
            System.out.println(location.get(i));
        }

//        Iterator iterator= location.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        }
    }
}

