package tutoring_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UseArrayList {
    public static void main(String[] args) {
        /*
        The ArrayList class is a resizable array.The difference between a built-in array
        and an ArrayList in Java, is that the size of an array cannot be modified
        (if you want to add or remove elements to/from an array, you have to create a new one).
        While elements can be added and removed from an ArrayList whenever you want.
         */
        ArrayList<String>cars= new ArrayList<String>();
        cars.add("Mercedes");
        cars.add("Lexus");
        cars.add("Corvette");
        cars.add("Acura");
        cars.add("Infiniti");
        cars.set(2, "BMW");
        // cars.remove(3);
        //   cars.clear();
        Collections.sort(cars);      //it arranges the data alphabetically & numerically
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
//        for(String s: cars){
//            System.out.println(s);
//        }

        ArrayList<Integer>myNumber= new ArrayList<Integer>();
        myNumber.add(29);
        myNumber.add(83);
        myNumber.add(17);
        myNumber.add(28);
        Collections.sort(myNumber);
        for (Integer i:myNumber) {
            System.out.println(i);
        }
        ArrayList<String>location= new ArrayList<String>();
        location.add("New York");
        location.add("New Jersey");
        location.add("California");
        location.add("Arizona");
        location.add("Washington");
        location.add("Florida");
        location.set(2,"Texas");
        Collections.sort(location);
        for (String s: location){
            System.out.println(s);
        }








    }
}
