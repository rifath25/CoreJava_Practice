package tutoring_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class RunMovieList {
    public static void main(String[] args) {
        Connection connection =null;
        Statement statement= null;

        MovieList vivah = new MovieList(8,"Vivah",2006,"Family","PG");
        MovieList sathi = new MovieList(9,"Sathi",2000,"Musical","PG");
        MovieList jabwemet = new MovieList(10,"Jab We Met",2007,"Rom-Com","PG");


        ArrayList<MovieList>movieLists=new ArrayList<>();
        movieLists.add(vivah);
        movieLists.add(sathi);
        movieLists.add(jabwemet);

        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                    "root","");
            statement=connection.createStatement();
         for (MovieList mv: movieLists){
            String query="INSERT INTO MOVIE(id,title,release_year,genre,mpaa_rating)" +
                    "VALUES("+mv.getId() +" ,'"+mv.getTitle()+"', "+ mv.getRelease_year()+
                    " ,'"+ mv.getGenre() +"' , '" + mv.getMpaa_rating() + "');";
            statement.execute(query);
         }
        }catch (Exception e){
            e.printStackTrace();
        }}
    }

