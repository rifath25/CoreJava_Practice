package tutoring_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie_4 {

    public static void main(String[] args) throws SQLException {


        Connection connect = null ;
        Statement statement = null;
try {


    connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
            "root", "rinika1527");

    statement = connect.createStatement();

    String query = "insert into movie (id , title, release_year, genre, mpaa_rating) " +
            "values (18, 'Captain Marvel', 2019, 'Sci-Fi','PG');";

    statement.execute(query);
    } catch ( Exception e ){

    e.printStackTrace();
            } finally {

            connect.close();
            statement.close();


        }











    }





}
