import java.util.*;

public class DoWhileCodes{
  public static void main(String[] args) {

  int num2 = 1;
  int count = 0;

  while (num2 <= 16) {
     if (isEven(num2)) {
       System.out.println("Even number " + num2);
       num2++;
       count++;
       if (count ==5) {
         break;
       }
     }
     else{
     System.out.println("Odd " + num2);
     num2++;
   }

  }
    System.out.println("sum of even number = " + count);


          System.out.println(sumDigits(911));

  }


  public static boolean isEven(int num){
    while (num % 2 ==0) {
      return true;
    }
    return false;
  }
          /******** DigitSumChallenge ********/

        public static int sumDigits(int number){
          if (number <10) {
            return -1;
          }
          int sum =0;
          while (number > 0) {
            int digit = number %10;
            sum += digit;
            number/= 10;
          }
          return sum;


        }
}
