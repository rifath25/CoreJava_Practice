package tutoring_Inheritance;

public class CheckingAccount {

   /*
   you have checking and saving account in your bank. in checking account, you can deposit
   & withdraw money. on the other hand, in saving account, you can only deposit money.
   make sure it shows the name of the account owner with the current balance of checking & saving account and
   it customizable from bank account when they make withdrawal or a deposit. Also,shows a message of low balance
   alert in both checking & saving account with their current balance if they have less than $50 in their account.

    */


   public void accountSummary(double currentBalance,double depositMoney,double withdrawMoney,String customerName){
       if (withdrawMoney > 0){
           System.out.println("Your Current Balance is: "+ (currentBalance - withdrawMoney ) );

       } else if (depositMoney > 0) {
           System.out.println("Your Current Balance is: " + (currentBalance + depositMoney));

       }else if (depositMoney + currentBalance <50.00){
           System.out.println(customerName + "You have less than 50.00.And your current balance is: " + (depositMoney +currentBalance));

       } else if (withdrawMoney - currentBalance <50.00) {
           System.out.println(customerName + "You have less than 50.00.And your current balance is: " + (withdrawMoney + currentBalance));

       } else {
           System.out.println("Your Current Balance is: " + currentBalance );
       }

   }

}


