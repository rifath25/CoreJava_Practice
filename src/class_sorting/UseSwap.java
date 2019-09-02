package class_sorting;

public class UseSwap {
    public static void main(String[] args) {
        String name1= "zaisha"; //need to declare new variable in case of swapping
        String name2= "ebube";
        String temp;
        temp= name1;
        name1= name2;
        name2= temp;
        System.out.println("Name1: " + name1);
        System.out.println("Name2: " + name2);
    }
}
