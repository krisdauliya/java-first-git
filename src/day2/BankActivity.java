package day2;
import day1.BankAccount;
public class BankActivity {
   // BankAccount activityAmount = new BankAccount();
    private double accountBalance = 0.00;
    private static int flag;                       // flag == 1 for deposit, flag == 0 for withdraw


    //Behaviour
        //Deposit
        //Withdraw
        //Interest
        //Transaction
    public double  Withdraw(double amount){
        double accountBalance = this.accountBalance - amount;
        return(accountBalance);
    }
    public double  Deposit(double amount){
        double accountBalance = this.accountBalance + amount;
        return(accountBalance);
    }
    public double  Transaction(double amount, int flag){
        if ( flag == 1){
            return Deposit(amount);
        }else {
            return Withdraw(amount);
        }
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
