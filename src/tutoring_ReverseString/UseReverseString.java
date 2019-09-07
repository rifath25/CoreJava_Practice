package tutoring_ReverseString;

public class UseReverseString {
    public static void main(String[] args) {
        String s= "Bristy";

        //using for loop

        /*String class is a immutable class which means it is unchangeable. it doesn't
        have reverse function. We need to use for loop or String buffer class to reverse a
        String.
        and StringBuffer class is a mutable class and it has reverse function.
         */


        int length= s.length(); //length=6
        String reverse = "";
        for (int i=length-1; i>=0;i--){   //length=6-1=5 i refers to index number
        reverse= reverse + s.charAt(i);
        }
        System.out.println(reverse);



        String name="Rush Hour";
        int nLength = name.length();

        String nReverse="";
        for(int i =nLength-1; i>=0; i--){
            nReverse= nReverse + name.charAt(i);
        }

        System.out.println(nReverse);
        //using string buffer class
        StringBuffer sf= new StringBuffer(s);
        System.out.println(sf.reverse());

    }


}
