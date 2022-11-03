package day2;

public class BankActivity {
    private static double balance = 100.00;
    private static int flag;                       // flag == 1 for deposit, flag == 0 for withdraw

    //Behaviour
        //Deposit
        //Withdraw
        //Interest
        //Transaction
    static void  Withdraw(double amount){
        balance = balance - amount;
        //return(balance);
    }
    static void  Deposit(double amount){
        balance = balance+amount;
        //return(balance);
    }
    static void  Transaction(double amount, int flag){
        if ( flag == 1){
            Deposit(amount);
        }else {
            Withdraw(amount);
        }
     }

    public static void setBalance(double balance) {
        BankActivity.balance = balance;
    }

    public static void setFlag(int flag) {
        BankActivity.flag = flag;
    }
}
