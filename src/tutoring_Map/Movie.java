package tutoring_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Movie {
    public static void main(String[] args) {
        List<String> listOfHorrorMovies= new ArrayList<>();
        listOfHorrorMovies.add("Bird Box");
        listOfHorrorMovies.add("Chucky");
        listOfHorrorMovies.add("Lights Out");
        listOfHorrorMovies.add("Sinister");

        List<String>listOfActionMovies=new ArrayList<>();
        listOfActionMovies.add("Mission Impossible");
        listOfActionMovies.add("X-Men");
        listOfActionMovies.add("Fast & Furious");
        listOfActionMovies.add("Avengers");

        Map<String,List>movies= new HashMap<>();
        movies.put("Horror Movies",listOfHorrorMovies);
        movies.put("Action Movies",listOfActionMovies);

        for (Map.Entry<String,List>movieNames:movies.entrySet()) {
            System.out.println(movieNames.getKey() + " " + movieNames.getValue());
        }
    }
}
