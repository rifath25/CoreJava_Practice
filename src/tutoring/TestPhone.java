package tutoring;

public class TestPhone {
    public static void main(String[] args) {
        Phone phoneFeature = new Phone();
        phoneFeature.feature1("bose model");
        phoneFeature.feature2("Touch Screen");
        phoneFeature.feature3(false );
        System.out.println("the phone has artificial intelligence feature like speaking: " + phoneFeature.feature4(true));
        phoneFeature.feature5("yes", "Rifath!");
        phoneFeature.features6(10, 2, "subtract");
    }
}



