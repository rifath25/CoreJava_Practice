package tutoring_DataWriter;

import java.io.FileWriter;
import java.io.IOException;

public class UseFileWriterUsingTryCatch {
    public static void main(String[] args) {
        FileWriter fw= null;
        String fileName= "C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataWriter\\Practice_FileWriter2";
        try {
            fw= new FileWriter(fileName);
            fw.write("Many students find it hard to get motivated to study \n" + "But it doesn't have to be this way");
        }catch (Exception ex1){
            System.out.println("This file is not writable");
        }finally {
            try {
              fw.close();
            }catch (Exception ex2){
                System.out.println("You reached the maximum amount of words you can write");
            }
        }
    }
}
