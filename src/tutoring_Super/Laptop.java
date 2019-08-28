package tutoring_Super;

/*
super is a keyword. It is used inside a sub-class method definition to
call a method defined in the super class. Private methods of the super-class
cannot be called. Only public and protected methods can be called by the super
keyword. It is also used by class constructors to invoke constructors of its parent class.
 */

public class Laptop extends Computer {
    public Laptop (){
        super(8);
        System.out.println(ramSize);
    }
    public void displaySize(){
        super.assembleMonitor();
        System.out.println("15 inch");
    }
    public void assembleMonitor(){

    }
}