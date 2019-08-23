package tutoring_Abstraction;

public class PixelPhone implements PhoneFeatures  {
    public void display(String display){
        System.out.println("Display: " + display );
    }
    public void camera(String camera) {
        if (camera.equalsIgnoreCase("dual camera")){
            System.out.println("It has dual front camera with 8-megapixel sensors each");
        } else {
            System.out.println("It has a front camera with 8-megapixel sensor");
        }
    }
    public void multitasking (boolean isMultitasking){
        System.out.println("Multitasking Feature: " +isMultitasking );
    }
    public void remoteControl(boolean isRemoteControl) {
        if (isRemoteControl == true) {
            System.out.println("It has infrared remote control feature which will allow to control your Smart TV ");
        } else {
            System.out.println("SORRY! You do not have the remote control feature in your device ");
        }
    }
}
