package tutoring_RemoveJunk;

public class TestRemoveJunk {
    //how to remove unwanted character or junk from a String??
    //-by regular expression [^a-zA-Z0-9]
    // '^'=not,

    public static void main(String[] args) {
        String s= "!@#$&*!#% hulululuUniversityAAA878 %^&(!@#";
        s=s.replaceAll("[^a-zA-Z0-9]" , "");
        System.out.println(s);
    }
}
