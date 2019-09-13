package tutoring_NestedLoop;

public class DiamondShape {
    public static void main(String[] args) {
        int numOfRows=8;

        for(int i=1;i<=numOfRows;i++){
            for (int j=1;j<=numOfRows-i;j++){
                System.out.print(" ");
            }for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=numOfRows-1;i>=1;i--){
            for (int j=1;j<=numOfRows-i;j++){
                System.out.print(" ");
            }for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
