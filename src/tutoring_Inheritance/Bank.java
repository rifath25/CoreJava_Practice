package tutoring_Inheritance;

public class Bank {
    public static void main(String[] args) {
        CheckingAccount bankAccount1 = new CheckingAccount() ;
        bankAccount1.accountSummary(30.0,0.00,0.00,"Rifath! ");
        SavingAccount bankAccount2 = new SavingAccount();
        bankAccount2.accountSummary(18.9,9.0, "Rifath! ");

    }
}
