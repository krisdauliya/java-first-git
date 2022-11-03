import day1.BankAccount;
import day2.BankActivity;
import day2.CustomerInfo;

public class BankingApplication {

    public static void main(String[] args) {

        //Updating Bank account info.
        BankAccount krisAccount = new BankAccount();
        krisAccount.setAccountNumber("A12056");
        String account_number = krisAccount.getAccountNumber();
        krisAccount.setAccountType("SAVING");
        krisAccount.setAccountBalance(45000.00);
        krisAccount.setAccountHolderName("Krishna Dauliya");

        //Updating Customer information
        CustomerInfo CustomerKris   = new CustomerInfo();
        CustomerKris.setFirstName("krishna");
        CustomerKris.setMiddleName("P");
        CustomerKris.setLastName("Poudel");
        CustomerKris.setFirstAddress("123 East st.");
        CustomerKris.setSecondAddress("Apt #2");
        CustomerKris.setCity("Abc");
        CustomerKris.setState("BA");
        CustomerKris.setPhoneNo("123-3456-789");
        CustomerKris.seteMail("abc@gmail.com");

        System.out.println("Customer is");
        System.out.println(CustomerKris.getFirstName() +" "+ CustomerKris.getMiddleName()+" "+ CustomerKris.getLastName());
        System.out.println("Account_number is: " +krisAccount.getAccountNumber());



        //bankActivity krisbankActivity = new bankActivity();
        BankActivity.setBalance(2456.00);
        BankActivity.setFlag(1);



    }
}
