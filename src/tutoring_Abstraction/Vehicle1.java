package tutoring_Abstraction;

public class Vehicle1 extends Vehicle {

    public Vehicle1(String brandName, String modelName, int year){
        this.brandName= brandName;
        this.modelName= modelName;
        this.year= year;
        System.out.println("BRAND: " + brandName);
        System.out.println("MODEL: " + modelName);
        System.out.println("YEAR: " + year);
    }

    @Override
    public void engine(String engine) {
        System.out.println("ENGINE: " + engine);
    }

    @Override
    public void transmission(String transmission) {
        System.out.println("TRANSMISSION: " + transmission);
    }

    @Override
    public void soundSystem(String soundSystem) {
        System.out.println("SOUND SYSTEM: " + soundSystem);
    }


}
