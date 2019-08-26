import java.io.*;
import java.util.Scanner;

public class Bread{
  private String breadType;
  private double breadCost;

	public Bread(String breadType) {
		this.breadType = breadType;
    breadCost = 0;
	}

	public String getBreadType() {
      return breadType;
	}
  public double getBreadCost(){
    return breadCost;
  }

  // public void breadSelection(){
  //   System.out.println("Bread: " + breadType + " selected.");
  // }

  public void userBreadChoice(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Bread Choice: ");
    int user = scan.nextInt();
    if (user < 0 || user > 3) {
      System.out.println("Not a valid option");
    }
    else if (user == 1) {
      breadType = "White";
      breadCost = 1.50;
    }
    else if (user == 2) {
      breadType = "Brown";
      breadCost = 2.50;
    }
    else if (user == 3) {
      breadType = "Grain";
      breadCost = 3.50;
    }
  }


  // public double breadCost(){
  //   if (breadType == "white") {
  //     return 1;
  //   }
  //     else if (breadType == "brown") {
  //       return 2;
  //     }
  //       else if(breadType == "grain"){
  //         return 3;
  //       }
  //       else {
  //         return 0;
  //       }
  // }



}
