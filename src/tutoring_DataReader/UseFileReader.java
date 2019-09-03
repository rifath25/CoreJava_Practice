package tutoring_DataReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class UseFileReader {
    public static void main(String[] args) {
        FileReader fileReader= null;
        BufferedReader bufferedReader= null;
        String fileName= "C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataReader\\FileText";
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data = "";
            while ((data=bufferedReader.readLine() )!= null) {
                System.out.println(data);
            }
        }catch (Exception e1){
            System.out.println("SORRY! File not found");
            e1.printStackTrace();
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }


        }
    }
}
