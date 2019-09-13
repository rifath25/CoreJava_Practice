package tutoring_ReverseInteger;

public class ReverseInteger {
    public static void main(String[] args) {
       int num=929349;
       int rev=0;

       while (num!=0){
           rev= rev * 10 + num %10;
           num=num/10;
       }
        System.out.println(rev);


       int num2=8776;
       StringBuffer sb= new StringBuffer(String.valueOf(num2)).reverse();
        System.out.println(sb);
    }
}
