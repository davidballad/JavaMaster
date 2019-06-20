import java.util.*;

public class Exercise20{
  public static final String ERROR_FOUND = "Invalid value";

  public static void main(String[] args) {

    printFactors(32);

          System.out.println(isPerfectNumber(7));
          //
          //
          //
          numberToWords(55055);
  }

  public static void printFactors(int a){
    if (a<0) {
      System.out.println(ERROR_FOUND);
    }
    int i = 1;
    while (i <= a) {
      if (a%i == 0) {
        System.out.print(i + " ");
      }
      i++;
    }
  }

        /** Perfect Number Exercise **/

        public static boolean isPerfectNumber(int x){
          if (x < 1) {
            return false;
          }
          // int perfect = 0;
          // for (int i = 1; i < x ; i++ ) {
          //   if(x%i == 0) {
          //     perfect+=i;
          //   }
          //   if (x == perfect) {
          //     return true;
          //   }
          // }
          // return false;      // same method using for loop instead
          int perfect = 0;
          int i = 1;
          while (i < x) {
            if (x%i == 0) {
              perfect+=i;
            }
            i++;
          }
            if (x == perfect) {
              return true;
            }
            return false;
        }

            /**** Print a number as a word ****/

            public static void numberToWords(int num){
              int y = reverse(num);

              if (y < 0) {
                System.out.println("Invalid Value");
              }
              else if (y==0) {
                System.out.print("Zero");
              }
              while (y>0) {
                int last = y%10;
                switch (last) {
                case 0: System.out.print(" " + "Zero" + " ");
                break;
                case 1: System.out.print(" " + "One" + " ");
                break;
                case 2: System.out.print(" " + "Two" + " ");
                break;
                case 3: System.out.print(" " + "Three" + " ");
                break;
                case 4: System.out.print(" " + "Four" + " ");
                break;
                case 5: System.out.print(" " + "Five" + " ");
                break;
                case 6: System.out.print(" " + "Six" + " ");
                break;
                case 7: System.out.print(" " + "Seven" + " ");
                break;
                case 8: System.out.print(" " + "Eight" + " ");
                break;
                case 9: System.out.print(" " + "Nine" + " ");
                break;
                }
                y/=10;
              }

              int compare = getDigitCount(reverse(num));
              int wordCount = getDigitCount(num);
              if (compare != wordCount) {
                int missing = wordCount - compare;
                while (missing >= 1) {
                  System.out.print(" " + "Zero" + " ");
                  missing--;
                }
              }
            }

            public static int reverse(int a){
              int rev = 0;
              while (a!=0) {
                int first = a%10;
                rev*=10;
                rev+=first;
                a/=10;
              }
              return rev;

              }


            public static int getDigitCount(int x){
              if (x<0) {
                return -1;
              }
              int digits = 1;
              while (x > 9) {
                  digits++;
                  x/=10;
              }
              return digits;
              }
}
