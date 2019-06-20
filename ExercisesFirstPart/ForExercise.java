import java.util.*;

public class ForExercise{
  public static void main(String[] args) {
    int i;
    System.out.println(interestCalc(10000, 2));

    for (i=8 ; i>1 ; i-- ) {
      System.out.println(String.format("%.2f",interestCalc(10000, i)));
    }

    System.out.println("*********************************");

    int count =0;

    for (i = 10;i<20 ;i++ ) {
      if (primeNumber(i)) {
        count ++;              // increment "count" for every prime number found
       System.out.println(i);
      }
       if (count==4) {     // when 4 numbers are found, break //
      break;
    }
    }
  }

  public static double interestCalc(double amount, double interest){
    return (amount*(interest/100));
  }


  /************* prime number exercise FOR LOOP ******************/

  public static boolean primeNumber(int n){
    int i;
  if (n==1) {
    return false;
  }
  for (i=2; i<= n/2 ; i++ ) {
    if (n%i==0) {
      return false;
    }

  }
    return true;
  }
}
