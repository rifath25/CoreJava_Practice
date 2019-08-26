package tutoring_Scanner;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.print("Name: " );
        scan1.nextLine();
        System.out.print("Age: ");
        scan1.nextInt();
        System.out.print("Location: ");
        scan2.nextLine();


    }
}
