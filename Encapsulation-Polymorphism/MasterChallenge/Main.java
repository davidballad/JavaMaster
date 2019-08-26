import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    Burger optionOne = new Burger(new Bread("white"), new Meat("chicken"), true, true, true, true);


    System.out.println("\t** BURGER SHOPPING TEST STORE **");

    System.out.println("MENU:\nChoose the bread:\t Pick a Meat:\t Extras:");
    System.out.println("White = 1\t\t Chicken = 1\t Lettuce");
    System.out.println("Brown = 2\t\t Beef = 2\t Tomato");
    System.out.println("Grain = 3\t\t Pork = 3\t Salt\n\t\t\t\t\t Onions");
    System.out.println("Your order:\t ");

    Bread test = anotherBread();
    //test.userBreadChoice();
    //System.out.println(test.getBreadCost());

  }


  public static Bread anotherBread(){

    Scanner scan = new Scanner(System.in);
    System.out.println("Would you like to order? Y or N");

    int input = scan.nextInt();
    if(input == 1) {
      return new Bread("white");
    }
    return null;
  }


}
