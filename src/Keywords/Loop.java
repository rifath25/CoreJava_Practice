package Keywords;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        String msg= "Hello World! ";
        for (int i=0;i<10; i++){      //for loop
            System.out.println(msg);
        }
        for(int i=1; i<=100;i++){  //nested for loop
            if(i%2==0){
                System.out.println(i + " is the even number");
            }else {
                System.out.println(i + " is the odd number");
            }
        }

    }
}
