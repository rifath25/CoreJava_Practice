package tutoring_ReverseInteger;

public class TestReverseInteger {
    public static void main(String[] args) {

        //using while loop
        int num= 123456;
        int rev= 0;

        while (num !=0){
            rev= rev * 10 + num % 10;
            num= num/10;
        }
        System.out.println(rev);


        //using StringBuffer
        int num2= 78905;
        StringBuffer sb= new StringBuffer(String.valueOf(num2)).reverse();{
            System.out.println(sb);
        }
    }
}
