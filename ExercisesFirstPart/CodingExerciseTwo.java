import java.util.*;

public class CodingExerciseTwo{

  public static void main(String[] args) {

    printMegaBytesAndKiloBytes(0);

    boolean wake = shouldWakeUp(true, 22);
    System.out.println(wake);

    boolean year = isLeapYear(1855);
    System.out.println(year);
  }


      public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
          System.out.println("Invalid Value");
        }
        else {
          int remainder = kiloBytes % 1024;
          int integer = kiloBytes / 1024;
          System.out.println(kiloBytes + " KB = " + integer + " MB and " + remainder + " KB");
        }

      }



// We have a dog that likes to bark.  We need to wake up if the dog is barking at night! Exercise


      public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay > 23 || hourOfDay <0) {
        return false;
        }
        else if ((barking == true) && (hourOfDay < 8 || hourOfDay > 22)) {
          return true;
        }
        else {
          return false;
        }

      }



          // leapYear exercise//

          public static boolean isLeapYear(int year){

            if (year < 1 || year > 9999) {
              return false;
            }
            else if (year % 4 == 0 && year % 100 ==0 && year % 400 ==0) {
              return true;
            }
            else if (year % 4 ==0 && year % 100 !=0) {
              return true;
            }
            else {
              return false;
            }

          }
}
