package tutoring_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie_2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement= null;

        connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                "root",
                "rinika1527");
        statement= connection.createStatement();
        String query= "INSERT INTO movie(id, title, release_year, genre, mpaa_rating)" +
                "VALUES(10, 'Jumanji: Welcome to the Jungle', 2017, 'Action/Comedy', 'PG-13');";
        statement.execute(query);

    }
}
