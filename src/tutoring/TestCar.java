package tutoring;

public class TestCar {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.brand("Honda");
        Car carModel= new Car("Accord");
        car1.engine();
        String gas= car1.gas();
        System.out.println(gas);
        Car.turnOnCar();
        String off= Car.turnOffCar("turning off");
        System.out.println(off);


    }
}
