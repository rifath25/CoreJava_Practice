package tutoring_Anagram;

import java.util.Arrays;

public class AnagramDemo {
    //a word, phrase, or name formed by rearranging the letters

    public static boolean isAnagram(String st1, String st2){
        if(st1.length()!= st2.length()){
            return false;
        }
        char [] c1=st1.toCharArray();
        Arrays.sort(c1);
        char [] c2=st2.toCharArray();
        Arrays.sort(c2);
        return true;
    }
    public static void main(String[] args) {
        String a="RAIL SAFETY";
        String b="FAIRY TALES";

        String c="NEW DOOR";
        String d="ONE WORD";

        String e="NEWYORK TIMES";
        String f="MONKEYS WRITE";

        System.out.println(isAnagram(a,b));
        System.out.println(isAnagram(c,d));
        System.out.println(isAnagram(e,f));
    }
}
