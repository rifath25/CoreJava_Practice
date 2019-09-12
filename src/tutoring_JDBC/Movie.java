package tutoring_JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie {
    public static void main(String[] args) throws SQLException {
        Connection connection= null;
        Statement statement= null;
        try {connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                "root",
                "");
            statement= connection.createStatement();
            String query="INSERT INTO movie(id, title, release_year, genre, mpaa_rating)" +
                    "values(1, 'Spider-Man: Far From Home', 2019, 'Fantasy/Sci-fi', 'PG-13');";

            statement.execute(query);

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
        }





}
