package tutoring_Polymorphism;

public class Home extends Human{
    @Override
    public void behavior(String behave, String location, boolean isDaughter) {
        System.out.println("she acts like " + behave + " when she is " + location );
        System.out.println("she is a decent girl infront of her parents: " + isDaughter );
    }
}
