package tutoring_DataReader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseFilenBufferedReaderUsingThrows {
    public static void main(String[] args) throws IOException {
        FileReader fileReader= null;
        BufferedReader bufferedReader= null;
        String fileName= "C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataReader\\practiceFileReader";
        fileReader= new FileReader(fileName);
        bufferedReader=new BufferedReader(fileReader);
        String data="";
        while ((data=bufferedReader.readLine())!=null){
            System.out.println(data);
        }
    }


        }
