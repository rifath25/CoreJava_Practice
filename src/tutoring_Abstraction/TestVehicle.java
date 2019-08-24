package tutoring_Abstraction;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("BRAND: 1");
        System.out.println("**************************************");

        Vehicle brand1 = new Vehicle1("CHEVROLET", "CRUZE",2019);
        brand1.engine("1.4L Turbo Engine ");
        brand1.transmission("6 & 9- Speed Automatic");
        brand1.soundSystem("6-Speaker Audio System");
        brand1.navigation("True");

        System.out.println("BRAND: 2");
        System.out.println("**************************************");

        Vehicle2 brand2 = new Vehicle2("MASTANG", "GT");
        brand2.year(2018);
        brand2.engine("2.3L 4-Cylinder, 5.0L V8 ");
        brand2.transmission("6 & 9- Speed Automatic");
        brand2.soundSystem("4-Speaker Audio System");
        brand2.navigation("false");
    }
}
