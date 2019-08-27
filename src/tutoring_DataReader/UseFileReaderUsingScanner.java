package tutoring_DataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UseFileReaderUsingScanner {
    public static void main(String[] args) throws IOException {
        FileReader fr= null;
        BufferedReader br= null;
        String fileName= "C:\\Users\\19293\\develop\\project1\\July2019\\src\\tutoring_DataReader\\practiceFileReader";
//        fr = new FileReader(fileName);
//        br= new BufferedReader(fr);
//        Scanner scan = new Scanner(br);
//        String data= "";
//        while ((data=scan.nextLine())!= null){
//            System.out.println(data);

        Scanner scan= new Scanner(System.in);
        fr= new FileReader(scan.nextLine());
        br= new BufferedReader(fr);
        String data= "";
        while ((data=br.readLine())!= null){
            System.out.println(data);

        }


    }

}


