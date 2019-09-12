package tutoring_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RunMovieShell {
    public static void main(String[] args) {
        String url= "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String userName= "root";
        String password= "";

        Connection connection= null;
        Statement statement= null;

        MovieShell deadpool = new MovieShell(14,"Deadpool",2016,"Sci-fi/Action","R");
        MovieShell ironMan = new MovieShell(15,"Iron Man",2008,"Sci-fi/Thriller","PG-13");
        MovieShell ted = new MovieShell(16,"Ted",2012,"Fantasy/Buddy","R");

        ArrayList<MovieShell>movieShells= new ArrayList<>();
        movieShells.add(deadpool);
        movieShells.add(ironMan);
        movieShells.add(ted);

        try {
            connection= DriverManager.getConnection(url,userName,password);
            statement=connection.createStatement();
            for (MovieShell ms: movieShells){
                String query="INSERT INTO movie(id, title, release_year, genre, mpaa_rating)" +
                        "VALUES(" + ms.getId() + " ,'" + ms.getTitle() + "', " + ms.getRelease_year()
                + " , '" + ms.getGenre() + "' , '" + ms.getMpaa_rating() +"');";
                statement.execute(query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
