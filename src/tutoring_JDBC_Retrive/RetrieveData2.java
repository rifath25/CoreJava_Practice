package tutoring_JDBC_Retrive;

import java.sql.*;
import java.util.ArrayList;


public class RetrieveData2 {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement= null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC",
                    "root",
                    "");

            preparedStatement =connection.prepareStatement("SELECT * FROM movie");
            resultSet=preparedStatement.executeQuery();

            ArrayList<String>array=new ArrayList<>();
            while (resultSet.next()){
               array.add(resultSet.getString("title"));

//                String value1= resultSet.getString("id");
//                String value2= resultSet.getString("title");
//                String value3=resultSet.getString("release_year");
//                String value4=resultSet.getString("genre");
//                String value5=resultSet.getString("mpaa_rating");
//                System.out.println(value1+"----> "+value2+"----> "+value3+"----> "+value4+"----> "+value5);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                preparedStatement.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }


    }
}
