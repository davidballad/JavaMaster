import java.util.*;

public class LoopExercise{
   public static void main(String[] args) {

      System.out.println(isPalindrome(210012));
      System.out.println("--------------------------");
            System.out.println(sumFirstAndLastDigit(5011));

   }
        /*** palindrome number challenge ***/
   public static boolean isPalindrome(int number){

      int num = number;
      int reverse = 0;
      while (num!=0) {

         int lastDigit = num % 10;
         reverse *= 10;
         reverse += lastDigit;
          num /= 10;
      }

      if (number == reverse) {
            return true;
         }
         return false;

   }

            /**** Challenge Two ****/
            public static int sumFirstAndLastDigit(int number){

              if (number < 0) {
                return -1;
              }
              int lastDigit = number % 10;
              int firstDigit = 0;
              int sum = 0;
              while (number >= 10) {
                firstDigit = number /= 10;
                sum = firstDigit + lastDigit;
              }
              return sum;
            }
}
