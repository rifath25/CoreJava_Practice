package tutoring_Enum;

public enum Vehicle {
    /*
    list of vehicle names that we should delivered to the market. put their make, model , color
    year & price in the list where can't be changed in any circumstances. Then in market make a conditional
    statement people can search the vehicle by entering the price range between 20,000 to 500,000.

     */
    TOYOTA("TOYOTA", "CAMRY", 2018 ,"BLUE", 22907.18),
    HONDA("HONDA", "CRV", 2017, "GREY" , 28794.94),
    BMW("BMV","335", 2016 ,"WHITE", 43956.58),
    MERCEDES("MERCEDES","E300",2019,"RED",58904.90);

    private String vehicleMake;
    private String vehicleModel;
    private int vehicleYear;
    private String color;
    private double vehiclePrice;

    Vehicle(String vehicleMake, String vehicleModel, int vehicleYear, String color, double vehiclePrice){
        this.vehicleMake= vehicleMake;
        this.vehicleModel=vehicleModel;
        this.vehicleYear= vehicleYear;
        this.color= color;
        this.vehiclePrice= vehiclePrice;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public String getColor() {
        return color;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }
}
