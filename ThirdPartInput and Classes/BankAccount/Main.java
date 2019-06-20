import java.io.*;

public class Main{
  public static void main(String[] args) {

    BankAccount account = new BankAccount();
    account.setPhoneNumber("9089925727");
    account.setCustomerName("David");
    account.setAccountNumber(12345);
    account.setCustomerEmail("davidballa@hotmail.com");
    account.setAccountBalance(500);

    System.out.println("Hi " + account.getCustomerName() + "\nPhone: " + account.getPhoneNumber() + "\nEmail: " + account.getCustomerEmail());
    System.out.println("Your current balance for the account " + account.getAccountNumber() + " is " + account.getAccountBalance() + "$");

    account.deposit(100);
    account.withdraw(50);

    System.out.println("Good-Bye");
  }
}
