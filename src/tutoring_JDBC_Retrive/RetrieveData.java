package tutoring_JDBC_Retrive;

import java.io.InputStream;
import java.sql.*;

public class RetrieveData {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        try {connection=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                "root",
                "");

            statement=connection.createStatement();
            String query1="Select title from movie";
            String query2="Select release_year from movie";
            String query3="Select genre from movie";


            resultSet=statement.executeQuery(query1);
//            resultSet=statement.executeQuery(query2);
//            resultSet=statement.executeQuery(query3);

            while (resultSet.next()){
                System.out.println(resultSet.getString("title"));
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
