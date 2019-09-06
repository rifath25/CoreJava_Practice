package tutoring_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Movie_3 {
    public static void main(String[] args) {
        Connection connection= null;
        Statement statement= null;
try {

        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                "root", "rinika1527");
        statement=connection.createStatement();
        String query="Insert into movie(id,title,release_year,genre,mpaa_rating)" +
                "values(17, 'How to Train Your Dragon: The Hidden World',2019,'Animated','PG-13');";
        statement.execute(query);

    }catch (Exception ex){
    ex.printStackTrace();
    }
    }
}
