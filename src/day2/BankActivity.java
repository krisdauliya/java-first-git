package day2;
import day1.BankAccount;
public class BankActivity {
    BankAccount activityAmount = new BankAccount();
    private static int flag;                       // flag == 1 for deposit, flag == 0 for withdraw


    //Behaviour
        //Deposit
        //Withdraw
        //Interest
        //Transaction
    public double  Withdraw(double amount){
        double balance = activityAmount.getAccountBalance() - amount;
        return(balance);
    }
    public double  Deposit(double amount){
        double balance = activityAmount.getAccountBalance() + amount;
        return(balance);
    }
    public double  Transaction(double amount, int flag){
        if ( flag == 1){
            return Deposit(amount);
        }else {
            return Withdraw(amount);
        }
    }


}
