package tutoring_Polymorphism;

public class Human {
    /*
    -Suppose if you are in class room that time you behave like a student,
    when you are in market at that time you behave like a customer, when
    you at your home at that time you behave like a son or daughter,
    Here one person present in different-different behaviors.
     */

    public void behavior(String behave){
        System.out.println(behave );
    }
    public void behavior(String behave, String location){
        System.out.println(behave);
        System.out.println(location);
    }
    public void behavior(String behave, String location, boolean isDaughter){
        System.out.println(behave);
        System.out.println(location);
        System.out.println(isDaughter);
    }
    public void behavior(String behave, String location, boolean isDaughter, int age){
        System.out.print(behave);
        System.out.print(location);
        System.out.print(isDaughter);
        System.out.print(age);
    }


}
