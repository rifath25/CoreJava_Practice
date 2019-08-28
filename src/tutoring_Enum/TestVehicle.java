package tutoring_Enum;

import java.util.Scanner;

public class TestVehicle {

    public static void main(String[] args) throws InterruptedException {

        String welcome = "--WELCOME TO THE AUTO SHOW CENTER--";

        String msg1 = "As mentioned in our range options above, Please enter your price range here to find your vehicles: ";

        String declined = "Invalid Entry!! There are no vehicles in the database within that price range";

        String msg2 = "Starting price: $";

        String msg3 = "Ending price: $";

        Thread.sleep(1000);

        System.out.println(welcome);

        Thread.sleep(4000);

        System.out.println(msg1);

        Thread.sleep(7000);

        System.out.print(msg2);



        Scanner startingRange = new Scanner(System.in);

        Scanner endingRange = new Scanner(System.in);



        double startingPrice = startingRange.nextDouble();

        System.out.print(msg3);

        double endingPrice = endingRange.nextDouble();

        if(startingPrice >=20000 && endingPrice<=40000){
            Thread.sleep(1000);

            System.out.print("Vehicle_1:"+"\nMake: "+Vehicle.TOYOTA.getVehicleMake()+" || ");

            System.out.print("Model: "+Vehicle.TOYOTA.getVehicleModel()+" || ");

            System.out.print("Year: "+Vehicle.TOYOTA.getVehicleYear()+" || ");

            System.out.print("Color: "+Vehicle.TOYOTA.getColor()+" || ");

            System.out.println("Price: "+'$'+Vehicle.TOYOTA.getVehiclePrice());

            Thread.sleep(1000);
            System.out.print("Vehicle_1:"+"\nMake: "+Vehicle.HONDA.getVehicleMake()+" || ");

            System.out.print("Model: "+Vehicle.HONDA.getVehicleModel()+" || ");

            System.out.print("Year: "+Vehicle.HONDA.getVehicleYear()+" || ");

            System.out.print("Color: "+Vehicle.HONDA.getColor()+" || ");

            System.out.println("Price: "+'$'+Vehicle.HONDA.getVehiclePrice());

        }else if(startingPrice >=41000 && endingPrice<=60000){

            Thread.sleep(1000);

            System.out.print("\nVehicle_2:"+"\nMake: "+Vehicle.BMW.getVehicleMake()+" || ");

            System.out.print("Model: "+Vehicle.BMW.getVehicleModel()+" || ");

            System.out.print("Year: "+Vehicle.BMW.getVehicleYear()+" || ");

            System.out.print("Color: "+Vehicle.BMW.getColor()+" || ");

            System.out.println("Price: "+'$'+Vehicle.BMW.getVehiclePrice());

            Thread.sleep(1000);

            System.out.print("\nVehicle_2:"+"\nMake: "+Vehicle.MERCEDES.getVehicleMake()+" || ");

            System.out.print("Model: "+Vehicle.MERCEDES.getVehicleModel()+" || ");

            System.out.print("Year: "+Vehicle.MERCEDES.getVehicleYear()+" || ");

            System.out.print("Color: "+Vehicle.MERCEDES.getColor()+" || ");

            System.out.println("Price: "+'$'+Vehicle.MERCEDES.getVehiclePrice());
        }else {
            Thread.sleep(1000);

            System.out.println(declined);
        }
    }
}
