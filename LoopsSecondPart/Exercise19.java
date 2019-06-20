import java.util.*;

public class Exercise19 {
  public static void main(String[] args) {
      System.out.println(hasSameLastDigit(99,19,10));
      System.out.println(isValid(10));

      System.out.println(getGreatestCommonDivisor(126, 36));
      //
      //
      // //
           System.out.println(canPack(0,5,4));
           //
           //
           ////
              System.out.println(getLargestPrime(15));
  }

  public static boolean hasSameLastDigit(int a, int b, int c) {
      if (isValid(a) && isValid(b) && isValid(c)) {
          int di = a % 10;
          int di1= b % 10;
          int di2 = c % 10;
          return (di == di1 || di == di2 || di1 == di2);
      }
      return false;
  }
  public static boolean isValid(int num) {
      return (num > 10 || num < 1000);
  }


  /** Second Exercise **/
      public static int getGreatestCommonDivisor(int a, int b){
        if (a < 0 && b < 0) {
          return -1;
        }
        if (a == 0){

                return b;
        }
            return getGreatestCommonDivisor(b%a, a);
      }


      /** Get right amount of flour Exercise **/
      public static boolean canPack(int bigCount, int smallCount, int goal){
        int count = bigCount*5;

        if (bigCount < 0 || smallCount < 0) {
          return false;
        }
        if ((count + smallCount)>= goal && (goal%5)<=smallCount) {
          return true;
        }
        return false;
        // int amount = goal;
        // while (smallCount>=0) {
        //   while (count !=0 && goal >= 5) {
        //   int left = goal-5;
        //   goal-=5;
        //   amount = left;
        //   if (amount == 0) {
        //     return true;
        //   }
        //   count-=5;
        //   continue;
        // }
        //   if (smallCount==0) {
        //     return false;
        //   }
        //   amount-=1;
        //   if (amount==0) {
        //     return true;
        //   }
        //   smallCount--;
        //   continue;
        // }
        //   return false;
      }


            /* Get larges prime Challege */
            public static int getLargestPrime(int x){
              if (x<2) {
                return -1;
              }
              int store = 0;
              while (x%2==0) {
                store = 2;
                x/=2;
              }
              for (int i =3; i<=Math.sqrt(x) ;i+=2 ) {
                while (x%i==0) {
                store=i;
                x/=i;
                }
              }
              if (x > 2) {
                store = x;
              }

              return store;
          }
}
