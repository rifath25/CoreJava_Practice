package tutoring_Abstraction;

public abstract class Vehicle {
    /* make two brands of vehicle "chevrolet", "mustang" that needs the features like engine, transmission and sound system.
    for each car the feature's type can be different. But one feature "navigation" has been implemented on the list
    that must have to be in all model vehicles. make sure to provide make, model, and year of the car that you worked on.
  */
    public abstract void brandName (String brandName);

    public abstract void modelName (String modelName);

    public abstract void year(int year);

    public abstract void engine (String engine);

    public abstract void transmission(String transmission);

    public abstract void soundSystem (String soundSystem);

    public String navigation (String navigation){
        return navigation;
    }


}
