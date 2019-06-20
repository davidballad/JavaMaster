import java.util.*;

public class MinMaxInput{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int min = 0;
    int max = 0;
    boolean flag = true;

    while (true) {
      System.out.print("Please enter your number: ");

      boolean hasInput = scanner.hasNextInt();

      if (hasInput) {

        int userNum = scanner.nextInt();
        if (flag) {

          flag = false;
          min = userNum;
          max = userNum;
        }

        if (userNum > max) {
          max = userNum;
        }
        else if (userNum < min) {
          min = userNum;
        }
      }
        else {
          break;
        }
        scanner.nextLine();
    }
        System.out.println("The minimum value entered is " + min);
        System.out.println("The maximum value entered is " + max);
        scanner.close();

  }
}
