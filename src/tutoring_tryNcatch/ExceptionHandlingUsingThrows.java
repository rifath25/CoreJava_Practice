package tutoring_tryNcatch;

public class ExceptionHandlingUsingThrows {

    //There are 2 types of exception-checked and unchecked exception (i.e RunTime Exception)

    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException,IllegalAccessException {
        String [] location = new String[3];      //Array
        location[0]= "NY";
        location[1]= "NJ";
        location[2]= "PA";
        System.out.println(20/1);
       // Thread.sleep(5000);       //It allows to pause the program amount of time chosen.
        System.out.println("Location: " + location[2]);
        ExceptionHandlingUsingThrows.fun();
    }
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");

    }
}
