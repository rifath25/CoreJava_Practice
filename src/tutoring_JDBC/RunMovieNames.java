package tutoring_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RunMovieNames {


    public static void main(String[] args) throws SQLException {
        Connection connect = null;
        Statement statement = null;


        MovieNames sanju = new MovieNames (22, "Sanju", 2018, "Drama", "R");
        MovieNames harrypotter = new MovieNames (23, "Harry Potter", 2001, "Fantasy", "PG");
        MovieNames padmavaat = new MovieNames (24, "Padmaavaat", 2019, "Historical", "PG");

        ArrayList<MovieNames> ar = new ArrayList<>();
         ar.add(sanju);
         ar.add(harrypotter);
         ar.add(padmavaat);

         try {

             connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                     "root","rinika1527");
             statement = connect.createStatement();

             for ( MovieNames mv : ar) {
                 String query = " insert into movie ( id, title, release_year, genre, mpaa_rating ) " +
                         "values (" + mv.getId() + ",'" + mv.getTitle() + "', " + mv.getRelease_year()
                         + " ,'" + mv.getGenre() + "','" + mv.getMpaa_rating() + " ');";
                 statement.execute(query);
             }
         }catch (Exception e){
             e.printStackTrace();
         } finally {
             connect.close();
             statement.close();
         }



    }
}
