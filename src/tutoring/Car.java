package tutoring;

public class Car {
    //method

    public void engine(){    //void method
        System.out.println("This car has V8 engine");
    }


    public String gas(){    //return method
        String type= "Type: ";         // local variable
        return type + "The car takes 93 grade gasoline";
    }


    String brandName;
    public void brand(String brandName){      //void method with parameter
        this.brandName= brandName;   // initialized instance variable "brandName" with parameter "brandName"
        /*
        "this" is used when you have instance variable name same as parameters.
         */
        System.out.println("brand name is " + brandName);
    }


    public static void turnOnCar(){             // you don't need to make an object for static
        System.out.println("turing on");
    }

    static String button;                                     //static variable
    public  static String turnOffCar(String button){          //static method with variable
        Car.button= button;  //initialized instance type static variable "button" with parameter "button"

        return button;
    }

    //constructor
    public Car (){         //default constructor
        System.out.println("Car building is in progress");
    }
    // constructor= [access modifier] [class name] (){}



    public Car (String modelName){         //constructor with parameter
        System.out.println("model name is "+ modelName);
    }





}
