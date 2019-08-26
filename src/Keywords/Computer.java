package Keywords;

public class Computer {
    int ramSize;
    public Computer (){}
    public Computer (int ramSize){
        this.ramSize= ramSize;
    }
    public void displaySize(int display){
        System.out.println("Display: " + display + "inches");
    }
}
