package day1;

public class BankAccount {

    //State
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private String bankBranchName;
    private String branchCode;
    private String accountType;
    private float interestRate;

    //getter and setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }


}
