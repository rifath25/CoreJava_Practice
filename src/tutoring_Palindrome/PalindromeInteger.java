package tutoring_Palindrome;

public class PalindromeInteger {

    public static void main(String[] args) {
        int num=151;
        int rev = 0;
        int temp = num;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("This Number Is Palindrome");
        } else {
            System.out.println("This Number Is Not Palindrome");
        }
    }


}

