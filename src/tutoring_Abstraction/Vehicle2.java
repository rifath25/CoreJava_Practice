package tutoring_Abstraction;

public class Vehicle2 extends Vehicle{

    public Vehicle2(String brandName, String modelName){
        this.brandName= brandName;
        this.modelName= modelName;
        System.out.println("BRAND: " + brandName);
        System.out.println("MODEL: " + modelName);
    }


    public void year(int year){
        this.year = year;
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
