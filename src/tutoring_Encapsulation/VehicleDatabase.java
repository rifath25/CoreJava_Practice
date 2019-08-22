package tutoring_Encapsulation;

public class VehicleDatabase {
    public static void main(String[] args) {
        Vehicle vehicle1Info = new Vehicle("Honda", "Accord", 2019, "Blue");
        System.out.println("Vehicle name is: "+ vehicle1Info.getBrandName());
        System.out.println("Model of the vehicle is: "+ vehicle1Info.getModelName());
        System.out.println("Year it released: " + vehicle1Info.getYear() );
        System.out.println("Color of the vehicle is: " + vehicle1Info.getColor() );


        System.out.println("-----------------------------------------------------------------");

        Vehicle vehicle2Info = new Vehicle("Honda", "Accord", 2019, "Blue");
        vehicle2Info.setModelName("CRV");
        vehicle2Info.setColor("Grey");
        System.out.println("Vehicle name is: "+ vehicle2Info.getBrandName());
        System.out.println("Model of the vehicle is: "+ vehicle2Info.getModelName());
        System.out.println("Year it released: " + vehicle2Info.getYear() );
        System.out.println("Color of the vehicle is: " + vehicle2Info.getColor() );
    }


}

