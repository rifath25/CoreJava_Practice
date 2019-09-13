package tutoring_ReverseString;

public class ReverseString {

    public static void main(String[] args) {
        String s="Madam";
        String reverse="";
        int length=s.length();

        for(int i=length-1;i>=0;i--){
            reverse=reverse + s.charAt(i);
        }
        System.out.println(reverse);



        StringBuffer sb= new StringBuffer(s);
        System.out.println(sb.reverse());


    }


}
