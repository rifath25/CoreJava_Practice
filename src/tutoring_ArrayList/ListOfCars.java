package tutoring_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ListOfCars {
    public static void main(String[] args) {
        ArrayList<String>listOfCars= new ArrayList<String>();
        listOfCars.add("Honda");
        listOfCars.add("Toyota");
        listOfCars.add("BMW");
        listOfCars.add("Lamborghini");
        listOfCars.add("Mercedes");

        System.out.println(listOfCars);

        Collections.sort(listOfCars);
        Iterator iterator= listOfCars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String s: listOfCars){
            System.out.println(s);
        }

        listOfCars.set(2, "Nissan");
        listOfCars.remove(3);

        for (int i=0; i<5; i++){
            System.out.println(listOfCars);
        }




    }
}
