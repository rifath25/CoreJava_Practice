package tutoring_Stack;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String>item= new Stack<String>();    //first in last out, last in first out
        item.push("table");    //push is to add
        item.push("chair");
        item.push("light");
        item.push("cloths");
        item.push("mouse");
        item.push("keyboard");

        System.out.println(item.search("light"));  //search is to find out the current position
        // of the node.
//        System.out.println(item.peek());
        item.pop();                          //pop is to remove
        System.out.println(item.peek());
//        System.out.println(item.search("chair"));
//        item.pop();
//        System.out.println(item.peek());     //peek is to verify which has last input

    }
}
