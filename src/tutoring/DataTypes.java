package tutoring;

public class DataTypes {
    public static void main(String[] args) {

        /*
         Access Modifier:                 Non Access Modifier:
         default                          static
         public                           final-is a constant modifier.it doesn't let you
                                                change the value of a variable in future.
         private                          abstract
         protected                        synchronized
                                          volatile


           DataTypes:
           There are 2 types of data types:
           1.Primitive DataType               2.Non- Primitive DataType
           -byte                              -String
           -short                             -Class
           -int                               -Interface
           -long                              -Arrays
           -float
           -double
           -boolean
           -char
         */
        String name="Rifath";
        byte extension= 126;
        short id=1783;
        int age=24;
        long number=897265757;
        float height=5.3f;
        double salary=12808.09;
        boolean isFemale= true;
        char initial='J';

        // print all the variable values with concatenation
        System.out.println("Name: " + name);
        System.out.println("Extension: " + extension);
        System.out.println("ID: " + id );
        System.out.println("Age: " + age );
        System.out.println("Number: " + number );
        System.out.println("Height: " + height );
        System.out.println("Salary: " + salary );
        System.out.println("Female: " + isFemale );
        System.out.println("Initial: " + initial );

        //show the works of length, uppercase, lowercase, indexOF, charAt, trim
        //string method

        String msg1="The TutORIng is Going well";
        String msg2="WelcoME to clASs";
        String msg3="This topic Is about Java String";
        String msg4= "     Read 5 chapters of java book   ";

        int length= msg1.length();
        System.out.println("find the Length of msg1: " + length );

        int indexChar= msg1.indexOf('G');
        System.out.println("find the number of a character in msg1: " + indexChar );

        int indexString=msg1.indexOf("TutORIng");
        System.out.println("find the number of a String in msg1: " + indexString );

        char charAt= msg1.charAt(9);
        System.out.println("find the character of an index in msg1: " + charAt  );

        String upperCase=msg2.toUpperCase();
        System.out.println("make it all Uppercase in msg2: " + upperCase );

        String lowerCase=msg3.toLowerCase();
        System.out.println("make it all lowercase in msg3: " + lowerCase );

        String trim= msg4.trim();
        System.out.println("cut any unnecessary gaps in msg4: " + trim );
    }
}
