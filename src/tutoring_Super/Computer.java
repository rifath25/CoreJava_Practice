package tutoring_Super;

public class Computer {
    int ramSize;
    final int CPU= 0;
    public Computer (){};
    public Computer (int ramSize){
        this.ramSize= ramSize;
    }
    public void assembleComputer(){
        System.out.println("Computer is assembled in America");
    }
    public void assembleMonitor(){
        System.out.println("The monitor has retina display");
    }

}
