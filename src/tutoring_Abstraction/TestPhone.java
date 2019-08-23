package tutoring_Abstraction;

public class TestPhone {
    public static void main(String[] args) {
        PixelPhone phoneType1 = new PixelPhone();
        phoneType1.display("Touch Screen with high resolution");
        phoneType1.camera("dUAl camERa");
        phoneType1.multitasking(true );
        phoneType1.remoteControl(true );

        System.out.println("---------------------------------------------------------");


        Iphone phoneType2 = new Iphone();
        phoneType2.display("Touch Screen with high resolution");
        phoneType2.camera("duAL CAMera".toLowerCase() );
        phoneType2.multitasking(true );
        phoneType2.remoteControl(false );
    }
}
