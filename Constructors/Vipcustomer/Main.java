import java.io.*;

public class Main{
  public static void main(String[] args) {

    VipCustomer empty = new VipCustomer();
    System.out.println(empty.getName());
    System.out.println(empty.getEmail());
    System.out.println(empty.getCreditLimit());

    VipCustomer david = new VipCustomer("David", 2000);
    System.out.println(david.getName());
    System.out.println(david.getEmail());
    System.out.println(david.getCreditLimit());
  }
}
