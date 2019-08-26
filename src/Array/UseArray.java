package Array;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UseArray {
    private static Object Random;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        int [] studentID= new int [10];
        System.out.println("Please enter your number: ");
        for(int i=0; i<studentID.length; i++){
           studentID [i]= sc.nextInt();
        }
        for(int i=0; i<studentID.length;i++){
            System.out.println(studentID[i]);
        }
        ArrayList<Integer>arrayList =new ArrayList<>();
        Random rand= new Random();
       //this for loop is assigning random integer values to the array list



    }
}
