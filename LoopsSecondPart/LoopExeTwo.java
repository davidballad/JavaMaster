import java.util.*;

public class LoopExeTwo{
  public static void main(String[] args) {

    int count = 0;
    int sum = 0;

    for (int i=1;i<=1000 ;i++ ) {
      if (i % 3==0 && i % 5==0) {
        count++;
        sum += i;
        System.out.println("Numbers divisible by 3 and 5 are: " + i);
      }
      if (count == 5) {
      System.out.println("Sum of first 5 numbers divisible by 3 and 5: " + sum );
        break;
    }
    }
System.out.println("********NEW CHALLEGE BELOW*********");
    System.out.println(sumOdd(10, 15));

  }
   /***** SumOdd Challenge Question *****/

   public static boolean isOdd(int number){
     if (number <= 0) {
       return false;
     }
     else if (number % 2 == 0) {
       return false;
     }
     return true;
   }

   public static int sumOdd(int start, int end){
     int sum = 0;
     if (start < 1 || end < 1 || start > end) {
       return -1;
     }
     for (start = start; start <= end ; start++ ) {
       if (isOdd(start)==true) {
         sum += start;
       }
     }
     return sum;
   }
}
