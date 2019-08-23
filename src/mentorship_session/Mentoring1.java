package mentorship_session;

public class Mentoring1 {

    //data types
    //primitives -byte, long, short, int, float, double, boolean, char
    //non-primitive- String, Enum, Class, Interface,volatile
    //variable [access modifer] [data type][variable name]=[value];
    public static void main(String[] args) {

        //if/else
    /*if(condition){
        code execution
        }else {
        code
     */
//        if (x > 0 || y < 19) {
//            System.out.println("today is a nice weather");
//        } else {
//            System.out.println("invalid");
//        }
        int x = 0;
        int y = 10;

        if (x > 0 && y < 9) {
            System.out.println("today is a nice weather");
        } else if (x > 1 && y < 19) {
            System.out.println("The weather is nice");
        } else {
            System.out.println("Invalid");

        }
        //for (value; condition;i++){

        for(int i= 0; i<12; i++){
            System.out.println(i);

    }
        int k= 4;
//        System.out.println(++k);
//        System.out.println(k++);

        ++k;
        System.out.println(k);

        //while(condition){
        //}
        //++;

        System.out.println("_________________________________");
//        int z=0;
//        while (z%2 !=0){
//
//            System.out.println(z);
//            z++;
//        }

        //2/2=0 2/3=1

        for(int i=1; i<=7; i++){
            if(i%2 ==0){
                System.out.println(i + " odd");
            }
        }

    } //2/2=0 2%2=0,3%2=1

}
