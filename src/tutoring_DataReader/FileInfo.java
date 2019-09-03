package tutoring_DataReader;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file= null;
        String fileName="C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataReader\\practiceFileReader";

        file= new File(fileName);
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.canWrite());
    }
}
