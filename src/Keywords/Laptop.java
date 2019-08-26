package Keywords;

public class Laptop extends Computer {
    public Laptop (int ramSize){
        super(8);
        System.out.println("RAM Size: " +ramSize );
        super.displaySize(15);
    }

}
