package tutoring_DataReader;


import java.io.File;
import java.io.IOException;

public class GetFileInfo {
    public static void main(String[] args) throws IOException {
        File fr= null;
        String fileName= "C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataReader\\practiceFileReader";
        fr= new File(fileName);
        System.out.println(fr.exists());
        System.out.println(fr.getName());
        System.out.println(fr.getAbsolutePath());
        System.out.println(fr.length());
        System.out.println(fr.canWrite());
        System.out.println(fr.hashCode());
        System.out.println(fr.getUsableSpace());
        System.out.println(fr.lastModified());
        System.out.println(fr.createNewFile());



    }
}
