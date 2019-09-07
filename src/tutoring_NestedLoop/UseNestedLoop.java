package tutoring_NestedLoop;

public class UseNestedLoop {
    public static void main(String[] args) throws InterruptedException {
        int numberOfRow = 10;
//     int i=1;
//     while(i <= numberOfRow){                  //while loop inside for loop
//         for (int j=1; j<=i;++j){
//             System.out.print("*" + " ");
//         }
//         System.out.println();
//         i++;
//     }


        for (int i=1;i< numberOfRow; i ++){     //for loop inside for loop
            for (int j= 1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

//        for (int i= 1; i<=numberOfRow; i++){
//            for (int j=7; j>=i; j--){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

//
//        for(int i=1; i<=numberOfRow;i++){
//            Thread.sleep(250);
//            for(int j=1; j<=numberOfRow-i; j++ ){
//                System.out.print(" ");
//            }for(int k=1; k<=i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=numberOfRow -1; i>=1 ;i--){
//            Thread.sleep(250);
//            for(int j=1 ; j<=numberOfRow -i ; j++ ){
//                System.out.print(" ");
//            }for(int k=1; k<=i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int x= 12;
//        while (x>=numberOfRow){
//        for(int i=1; i<=numberOfRow;i++){
//            Thread.sleep(250);
//            for(int j=1; j<=numberOfRow-i; j++ ){
//                System.out.print(" ");
//            }for(int k=1; k<=i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=numberOfRow -1; i>=1 ;i--){
//            Thread.sleep(250);
//            for(int j=1 ; j<=numberOfRow -i ; j++ ){
//                System.out.print(" ");
//            }for(int k=1; k<=i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }for(int y= 1; y<=2; y++){
//                System.out.println('\r');
//            }
//         x--;
//        }

    }
}

