package tutoring_Anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char [] c1= string1.toCharArray();
        Arrays.sort(c1);
        char [] c2= string2.toCharArray();
        Arrays.sort(c2);
        return true;
    }


    public static void main(String[] args) {
        String a= "LISTEN";
        String b= "SILENT";
        System.out.println(isAnagram(a,b));

    }
}
