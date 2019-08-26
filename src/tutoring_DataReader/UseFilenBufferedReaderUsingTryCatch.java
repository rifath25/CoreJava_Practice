package tutoring_DataReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class UseFilenBufferedReaderUsingTryCatch {
    public static void main(String[] args) {

            FileReader fr = null;
            BufferedReader br= null;
            String fileName="C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataReader\\practiceFileReader";
        try{
            fr= new FileReader(fileName);
            br= new BufferedReader(fr);
            String data= "";
            while ((data=br.readLine())!=null){
                System.out.println(data);
            }
        }catch (Exception ex) {
            System.out.println("NOT FOUND");
        }finally {
            try {
                fr.close();
                fr.close();
            }catch (Exception ex2){
                System.out.println("        *******DONE*********");
            }

        }

    }
}
