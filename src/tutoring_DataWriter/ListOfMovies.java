package tutoring_DataWriter;

import java.io.FileWriter;
import java.io.IOException;

public class ListOfMovies {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter= null;
        String fileName="C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataWriter\\movies.txt";

        fileWriter= new FileWriter(fileName);
        fileWriter.write("-Inception" + "\n-BirdBox" + " \n-3 idiots");

        fileWriter.close();


    }
}
