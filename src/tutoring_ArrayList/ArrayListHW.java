package tutoring_ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListHW {
    public static void main(String[] args) {


            Scanner userFirstName = new Scanner(System.in);
            Scanner userLastName = new Scanner(System.in);
            Scanner userAge = new Scanner(System.in);

             for (int i = 0; i <= 2; i++) {

                 List<String> userInfo = new ArrayList<String>();
            System.out.print("First Name: ");
            userInfo.add(userFirstName.nextLine());
            System.out.println(userInfo.get(0));

            System.out.print("Last Name: ");
            userInfo.add(userLastName.nextLine());
            System.out.println(userInfo.get(1));

            System.out.print("Age: ");
            userInfo.add(userAge.nextLine());
            System.out.println(userInfo.get(2));
            System.out.println();



        }
    }
}



