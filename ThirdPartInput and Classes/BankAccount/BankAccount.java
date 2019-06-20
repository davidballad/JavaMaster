import java.io.*;

public class BankAccount{

  private String customerName;
  private double accountBalance;
  private String customerEmail;
  private int accountNumber;
  private String phoneNumber;

  public void deposit(double depositAmmount){
    this.accountBalance += depositAmmount;
    System.out.println("Depositing " + depositAmmount + "$" + "  New Balance " + this.accountBalance + "$");
  }
  public void withdraw(double withdrawAmmount){
    if (this.accountBalance - withdrawAmmount < 0) {
      System.out.println("Innsuficeint balance " + this.accountBalance + "$");
    }
    accountBalance -= withdrawAmmount;
    System.out.println("Withdrawing " + withdrawAmmount + "$" + "  New Balance " + this.accountBalance + "$");
  }

  public void setCustomerName(String customerName){
    this.customerName = customerName;
  }
  public void setCustomerEmail(String customerEmail){
    this.customerEmail = customerEmail;
  }
  public void setAccountBalance(double accountBalance){
    this.accountBalance = accountBalance;
  }
  public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
  }
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  public String getCustomerName(){
    return this.customerName;
  }
  public String getCustomerEmail(){
    return this.customerEmail;
  }
  public double getAccountBalance(){
    return this.accountBalance;
  }
  public int getAccountNumber(){
    return this.accountNumber;
  }
  public String getPhoneNumber(){
    return this.phoneNumber;
  }

}
