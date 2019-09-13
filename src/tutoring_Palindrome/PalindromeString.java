package tutoring_Palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the word here: ");
        String string= scanner.nextLine();
        String rev="";
        int length= string.length();
        for(int i=length-1;i>=0;i--) {
            rev = rev + string.charAt(i);

        }if(rev.equalsIgnoreCase(string)){
                System.out.println("The String Is Palindrome");
            }else{
                System.out.println("The String Is Not Palindrome");

        }

    }
}
