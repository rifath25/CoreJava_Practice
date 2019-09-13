package tutoring_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Country {
    public static void main(String[] args) {
        List<String> countryUSA= new ArrayList<String>();
        countryUSA.add("Washigton");
        countryUSA.add("Florida");
        countryUSA.add("New York");
        countryUSA.add("Albany");
        countryUSA.add("California");

        List<String> countryBangladesh= new ArrayList<String>();
        countryBangladesh.add("Chittagong");
        countryBangladesh.add("Dhaka");
        countryBangladesh.add("Sylhet");
        countryBangladesh.add("Barisal");
        countryBangladesh.add("Joshore");

        List<String> countryUK= new ArrayList<String>();
        countryUK.add("London");
        countryUK.add("Ilford");
        countryUK.add("Westerham");
        countryUK.add("Barking");
        countryUK.add("Barnet");

        Map<String,List>countryName= new HashMap<>();
        countryName.put("Bangladesh",countryBangladesh);
        countryName.put("USA",countryUSA);
        countryName.put("UK",countryUK);

        for (Map.Entry<String,List>map:countryName.entrySet()) {
            System.out.println(map.getKey() +" " + map.getValue());
        }



    }
}
