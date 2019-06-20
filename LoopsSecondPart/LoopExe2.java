import java.util.*;

public class LoopExe2{
  public static void main(String[] args) {

      System.out.println(getEvenDigitSum(682125));
      System.out.println("********* Second Challenge Below **********");
            System.out.println(hasSharedDigit(16, 53));
  }

    public static int getEvenDigitSum(int number){
      if (number <0) {
        return -1;
      }
      int sum=0;
      while (number > 0) {
        int lastDigit = number % 10;
        int even = lastDigit % 2;
        if (even == 0) {
          sum+=lastDigit;
        }
        number/= 10;
      }
      return sum;
    }
                    /*** Return true if numbers share same digit, false if not or negative ***/

            public static boolean hasSharedDigit(int num, int num2){
              boolean value = false;

              if (num < 10 || num2 <10 || num >99 || num2 >99) {
                return false;
              }
              int x = num2;

              while (num > 0 ) {
                int lastDigit1 = num % 10;
                num2 = x;                   //value always initialized to num2(never-changing)

                while (num2 > 0) {
                  int lastDigit2 = num2 % 10;
                  if (lastDigit1 == lastDigit2) {
                    value = true;
                  }
                  num2/=10;
                }
                num/=10;
              }
              return value;
            }
}

// Write a method named hasSharedDigit with two parameters of type int.
// Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
// The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
// EXAMPLE INPUT/OUTPUT:
// * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
// * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
// * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
// NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
// NOTE: Do not add a main method to the solution code.
