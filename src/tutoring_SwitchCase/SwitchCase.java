package tutoring_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        int x=6;
        switch (x){
            case 1:
                System.out.println("Soha");
                break;
            case 2:
                System.out.println("Saira");
                break;
            case 3:
                System.out.println("Cristian");
                break;
            case 4:
                System.out.println("Ahmed");
                break;
            case 5:
                System.out.println("Felepe");
                break;
            default:
                System.out.println("There are no student fits in this number.");
                break;
        }


        String name= "Soha";
        double salary;

        switch (name){
            case "Soha":
                 salary = 122690.00;
                break;
            case "Saira":
                 salary = 135260.00;
                break;
            case "Cristian":
                 salary = 146460.00;
                break;
            case "Ahmed":
                 salary = 164250.00;
                break;
            case "Felepe":
                 salary = 114673.00;
                break;
            default:
                salary = 0.00;
//                System.out.println("NO DATA OF THE REQUESTED NAME WAS FOUND");

        }
        System.out.println("Salary: " + salary );
    }
}
