package tutoring_DataWriter;

import java.io.FileWriter;
import java.io.IOException;

public class UseFileWriterUsingThrows {
    public static void main(String[] args) throws IOException {
        FileWriter fw;
        String fileName="C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataWriter\\PracticeFileWriter";
        fw= new FileWriter(fileName);
        fw.write("Today is a nice weather.\n" + "Its 85 degree outside.");
        fw.close();
    }
}
