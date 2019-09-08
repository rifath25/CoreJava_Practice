package class_fibonaccoSeries;

public class FibonacciNumber {
    public static void main(String[] args) {
        int prev=0;
        int next=1;
        for (int i=0;i<9;i++){
            System.out.println(prev); //0,1
            prev=prev+next; //0+1=1,1+0=1,
            next=prev-next; //1-1=0,1-0=1,
        }
    }
}
