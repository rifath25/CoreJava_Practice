package tutoring_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RunMovieCollection {
    public static void main(String[] args) throws SQLException {

        String url= "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String userName="root";
        String password= "";

        Connection connection= null;
        Statement statement= null;

       MovieCollection rampage= new MovieCollection(
               5,"Rampage", 2018,"Sci-fi/Action","PG-13");
       MovieCollection jurassicWorld= new MovieCollection(
                6,"Jurassic World: Fallen Kingdom", 2018,"Sci-fi/Action","PG-13");
        MovieCollection missionImpossible= new MovieCollection(
                7,"Mission: Impossible – Fallout", 2018,"Thriller/Action","PG-13");


        ArrayList<MovieCollection>movieCollections= new ArrayList<>();
        movieCollections.add(rampage);
        movieCollections.add(jurassicWorld);
        movieCollections.add(missionImpossible);

        try {
            connection= DriverManager.getConnection(url,userName,password);
            statement= connection.createStatement();

            for (MovieCollection mv: movieCollections){
                String query= "INSERT INTO MOVIE( id, title, release_year, genre, mpaa_rating)" +
                        "VALUES(" + mv.getId()+ ", '" + mv.getTitle()+ "', " + mv.getRelease_year()+ ", '" + mv.getGenre() + "', '" +mv.getMpaa_rating()+
                        "');";

                statement.execute(query);
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            connection.close();
            statement.close();

        }

    }
}
