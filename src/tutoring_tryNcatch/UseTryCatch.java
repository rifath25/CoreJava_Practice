package tutoring_tryNcatch;

public class UseTryCatch {
    public static void main(String[] args) {
        try {
            //[data type] [] [variable name]= new [data type] [num of array]
            String[] location = new String[3];      //Array
            location[0] = "NY";
            location[1] = "NJ";
            location[2] = "PA";
            System.out.println(20 / 2);
            System.out.println("Location: " + location[2]);
            int[] i = {12, 22, 32};
            System.out.println("Number: " + i[1]);

        } catch (ArrayIndexOutOfBoundsException ex) {        //catch (ArithmeticException | ArrayIndexOutOfBoundsException ex)
            System.out.println("SORRY! COULDN'T FIND LOCATION");
        }   //catch (ArithmeticException ex){
        //System.out.println("INVALID NUMBER ");
        //}
          /*
          Exception type: [custom errors]
          -ArithmeticException
          -ArrayIndexOutOfBoundsException etc

           */

        try {
            String[] location = new String[3];      //Array
            location[0] = "NY";
            location[1] = "NJ";
            location[2] = "PA";
            System.out.println(20 / 0);
            System.out.println("Location: " + location[5]);

        } catch (Exception ex) {
            ex.getStackTrace();     //stack trace- position at which an exception takes place.
        }finally {
            System.out.println("YOU MADE IT !");
        }

    }
}
