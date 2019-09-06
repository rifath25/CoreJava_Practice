package tutoring_Map;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {
    public static void main(String[] args) {

        //Map = new HashMap    [raw type: you can put any wrapper class or any class]
        Map<String,Integer>people= new HashMap<String, Integer>();
        people.put("JOHN DOE",26);
        people.put("CHRISTIAN CALLY",28);
        people.put("ALISHA ALI",23);

        for(Map.Entry<String, Integer>entry: people.entrySet()){
            System.out.println("NAME: " + entry.getKey() + " AGE: " + entry.getValue());

        }
    }
}
