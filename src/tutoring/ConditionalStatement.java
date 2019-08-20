package tutoring;

public class ConditionalStatement {
    public static void main(String[] args) {
        //if else statement
        String name1="sultana";
        if (name1 == "rifath"){
            System.out.println(name1);
        }else {
            System.out.println("Wrong input");
        }

        String name2= "rifath";
        if (name2.equalsIgnoreCase("kabir")){   //equalsIgnoreCase means "==" only used for string
            System.out.println("my name is "+ name2);
        }else if (name2.equalsIgnoreCase("rifath") ){
            System.out.println("And i am " + name2);
        }else {
            System.out.println("invalid");
        }


        int employeeId= 178;
        if (employeeId == 124){
            System.out.println("raihan's employee ID is " + employeeId );
        }else if(employeeId == 178){
            System.out.println("rifath's employee ID is " + employeeId );
        }else {
            System.out.println(" Invalid employee ID");
        }

        /*
         write a condition that shows if the person name rifath didn't pay the bill on time she should
         get charge penalty of $35.79 from her current balance and if she pay the bill on time she should receive
         a thank you message with their name and current balance.
         */
        String personName= "rifath";
        boolean payedBillOnTime = true;
        double currentBalance= 500.70;
        double penalty= 35.79;

        String message= "Thank you for paying the bill on time";

        if (personName == "rifath" || payedBillOnTime == false ){
            double balanceAfterPenalty= currentBalance - penalty;
            System.out.println("due to late payment you have charged " + penalty);
            System.out.println("your account balance is now after penalty is " + balanceAfterPenalty);
        }else {
            System.out.println(personName + "," + message + " and your current balance is " + currentBalance );

        }

        // Switch case
        String day= "Wednesday";
        switch (day){
            case "Tuesday":
                day= "Tuesday";
            break;

            case "Wednesday":
                day= "Wednesday";
            break;

            case "Monday":
                day= "Monday";
            break;
            default :
                day= "invalid";

        }
        System.out.println(day);


    }
}
