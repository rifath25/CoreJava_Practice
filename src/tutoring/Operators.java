package tutoring;

public class Operators {
    public static void main(String[] args) {

       //arithmetic operator
       int x1= 2;
       int x2= 10;
       int add= x1 + x2;
        System.out.println(add);

        double y1= 20.56;
        int y2= 17;
        double subtract= y1-y2;
         System.out.println(subtract );

        int z1= 100;
        int z2= 50;
        int multiply= z1 * z2;
         System.out.println(multiply);

        int d1= 200;
        int d2= 10;
        int division= d1/d2;
        System.out.println(division);

        int m1= 300;
        int m2= 21;
        int modulus= m1 % m2;
        System.out.println(modulus);

        int i= 3;
        System.out.println(++i);
        System.out.println(--i);
        System.out.println(--i);

        //Assignment operators

        int age= 25;
        int a1= 5;
        a1 +=2; //a1= 5+2
        System.out.println(a1);
        int a2= 50;
        a2 -=5;
        System.out.println(a2);
        int b1 = 4;
        b1 *= 2;
        System.out.println(b1);
        int b2 = 6;
        b2 /= 3;
        System.out.println(b2);
        int c1= 20;
        c1 %= 3;
        System.out.println(c1);

        //comparision operator

        boolean l1= 100 ==20*5;   // == is equal
        System.out.println(l1);
        boolean l2= 50 != 30;     // != is not equal
        System.out.println(l2);
        boolean r1= 1000>2000;
        System.out.println(r1);
        boolean r2= 20<20;
        System.out.println(r2);
        boolean o1= 45<=45;
        System.out.println(o1);
        boolean o2= 80>=180;
        System.out.println(o2);

        //logical operator

        System.out.println(20>5 && 30<2);
        System.out.println(23<35 || 80>90);
        System.out.println(!(200>150 && 79<100));

    }
}
