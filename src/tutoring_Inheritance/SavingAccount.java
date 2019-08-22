package tutoring_Inheritance;

public class SavingAccount extends CheckingAccount {
     /*
   you have checking and saving account in your bank. in checking account, you can deposit
   & withdraw money. on the other hand, in saving account, you can only deposit money. Also,
  shows a message of low balance alert in both checking & saving account if they have less
  than $50 in their checking account.

    */
     public void accountSummary(double currentBalance,double depositMoney,String customerName){

         if (depositMoney > 0){
             System.out.println("Your Current Balance is: "+ (currentBalance + depositMoney ));

         } else if (depositMoney + currentBalance <50.00){
             System.out.println(customerName + "You have less than 50.00.And your current balance is: " + (depositMoney + currentBalance));

         } else {
             System.out.println("Your Current Balance is: " + currentBalance );
         }
     }
}
