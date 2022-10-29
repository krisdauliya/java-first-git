package day2;

import java.util.Scanner;

public class bankActivity {
    static double balance = 100.00;
    static int flag;                       // flag == 1 for deposit, flag == 0 for withdraw

    //Behaviour
        //Deposit
        //Withdraw
        //Interest
        //Transaction

    public static void main(String[] args) {
        System.out.println("Welcome to your Banking Portal");
        System.out.println("Please Enter 1 for Deposit or 2 for Withdraw: ");
        Scanner input = new Scanner(System.in);
        flag = input.nextInt();
        System.out.println("How much you what to deposit/Withdraw? ");
        double deposit = input.nextDouble();
        Transaction(deposit, flag);
        System.out.println("Your running balance is: " + balance);
    }
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
        //return(balance);
    }
}
