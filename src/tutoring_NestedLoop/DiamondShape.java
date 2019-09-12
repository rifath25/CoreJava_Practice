package tutoring_NestedLoop;

public class DiamondShape {
    public static void main(String[] args) {
        int numOfRow=6;

        for(int i=1;i<=numOfRow;i++){
            for(int j=1;j<=numOfRow-i;j++){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=numOfRow-1;i>=1;i--){
            for(int j=1;j<=numOfRow-i;j++){
                System.out.print(" ");
            }for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
