import java.io.*;

public class VipCustomer{

  private String name;
  private double creditLimit;
  private String email;


	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}



	public VipCustomer() {
    this("Default Name", 0, "Default Email");
	}
  public VipCustomer(String name, double creditLimit){
    this(name, creditLimit, "david@hotmail.com");
  }
	public VipCustomer(String name, double creditLimit, String email) {
    this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

}
