import java.util.*;

public class ReadingUserInput{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int counter = 1;
    int sum = 0;

    while (counter <=10) {
      System.out.println("Enter number #" + counter + ":");
      boolean hasNextInt = scan.hasNextInt();

      if (hasNextInt) {
        int userNum =  scan.nextInt();
        
        System.out.println("You entered " + userNum);  // just adding line, not necessary
        counter++;
        sum += userNum;
      }
      else {
        System.out.println("Invalid Value");
        
      }
      scan.nextLine();
    }
    System.out.println("The sum of the numbers entered is " + sum);
    scan.close();
  }
}
