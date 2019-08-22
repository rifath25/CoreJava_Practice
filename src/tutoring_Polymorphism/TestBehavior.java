package tutoring_Polymorphism;

public class TestBehavior {
    public static void main(String[] args) {
        Human  behavior1= new Classroom() ;
        behavior1.behavior(" student");
        System.out.println("**************");
        Human  behavior2= new Market();
        behavior2.behavior("Crazy", "Shopping Mall ");
        Human  behavior3= new Home();
        behavior3.behavior("normal", "at Home" , true );
    }
}
