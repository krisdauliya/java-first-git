package day2;

import java.util.Scanner;

public class bankActivity {
    static double balance = 100.00;
    //Behaviour
        //Deposit
        //Withdraw
        //Interest
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much you what to deposit? ");
        double deposit = input.nextDouble();
        Deposit(deposit);
        System.out.println(balance);

    }
    static void  Deposit(double amount){
        balance = balance+amount;
        //return(balance);
    }
}
