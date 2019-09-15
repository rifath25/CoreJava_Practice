package tutoring_LargestWord;

import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {


        String str= "Human brain is a biological learning machine";
        String [] arrayOfString= str.split(" ");
        String shortest= arrayOfString[0];
        String longest= " ";

        for(String s:arrayOfString){
            if(s.length()<shortest.length()){
                shortest=s;
            }else if (s.length()>longest.length()){
                longest=s;
            }
        }
        System.out.println("longest word is: " + longest);
        System.out.println("shortest word is: " + shortest);




        //using scanner
       Scanner scanner=new Scanner(System.in);
        System.out.print("Enter The Sentence Here: ");
        String st= scanner.nextLine();
        String []aString= st.split(" ");
        String smallestW=aString[0];
        String largestW=" ";

        for(String s:aString){
            if(s.length()<smallestW.length()){
                smallestW=s;
            }else if(s.length()>largestW.length()){
                largestW=s;
            }
        }
        System.out.println("Longest Word: " + largestW);
        System.out.println("Smallest Word: " + smallestW);























    }
}
