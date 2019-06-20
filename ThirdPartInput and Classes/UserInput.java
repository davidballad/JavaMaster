import java.util.*;

public class UserInput {

  public static void main(String[] args) {

    // String name = "20";                       /* Parsing values,converting a String into a number so it can be added.*/
    // System.out.println(name+1);
    // int num = Integer.parseInt(name);
    // System.out.println(num+1);

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the year you were born: ");
    int dob = scan.nextInt();
    scan.nextLine();

    System.out.println("Enter you name: ");
    String name = scan.nextLine();



    System.out.println("Hi " + name + ", you were born in " + dob);

    int age = 2019 - dob;
    System.out.println("You are " + age + " years old.");

    scan.close();   //closes the scanner so it doesnt use the internal memory

  }

}
