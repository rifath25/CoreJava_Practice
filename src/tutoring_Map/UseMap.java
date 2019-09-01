package tutoring_Map;

import java.util.HashMap;
import java.util.Map;

public class UseMap {    //it is a key value pair data structure
    public static void main(String[] args) {
        Map<String, String>earth= new HashMap<String, String>();
        earth.put("USA", "NY");        //PUT is used for add key & values
        earth.put("CANADA", "Toronto");
        earth.put("BANGLADESH", "Dhaka");
        earth.put("Japan", "Tokyo");
        earth.put("Russia", "Moscow");
        System.out.println(earth.get("Japan"));


        
       for (Map.Entry<String,String>entry: earth.entrySet()){
           System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }

}
