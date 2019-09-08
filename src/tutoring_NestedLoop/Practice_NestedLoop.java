package tutoring_NestedLoop;

import org.junit.Assert;

public class Practice_NestedLoop {
    public static void main(String[] args) {
        int numberOfRows= 7;
//        for(int i=1; i<=numberOfRows; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        for (int i=numberOfRows;i>=0;i--){
//            for (int j=i; j>=0; j--){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        for (int i=1; i<=numberOfRows;i++){
            for (int j=numberOfRows-1; j>=i;j--){
                System.out.print(" ");
            }for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=numberOfRows-1;i>=1;i--){
            for (int j=1; j<=numberOfRows-i; j++){
                System.out.print(" ");
            }for (int k=1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
