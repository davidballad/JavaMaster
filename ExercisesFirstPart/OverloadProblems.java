import java.util.*;

public class OverloadProblems {

  private static final String EROOR_1 = "Invalid Value";


  public static void main(String[] args) {

    System.out.println(area(100.25));
    System.out.println(area(5, 4));

    printYearsAndDays(1440);

    printEqual(1, 2, 1);

    System.out.println(isCatPlaying(false, 45));
  }


  public static double area(double radius){
    if (radius < 0) {
      return -1;
    }
    double radValue = radius*radius * Math.PI;
    return radValue;
  }

  public static double area(double x, double y){
    if (x < 0 || y < 0) {
      return -1;
    }
    double area = x*y;
    return area;

}
              /**** Minutes to days and years ****/

              public static void printYearsAndDays(long minutes){
                if (minutes < 0) {
                  System.out.println(EROOR_1);
                }
                else{
                long days = ((minutes /60) / 24) %365;
                long years = ((minutes/60)/24) / 365;
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
              }
              }

                /*** Equality Printer ***/

                public static void printEqual(int x, int y, int z){
                  if (x < 0 || y < 0 || z < 0) {
                    System.out.println("Invalid Value");
                  }
                  else if (x == y && y == z) {
                    System.out.println("All numbers are equal");
                  }
                  else if (x != y && x != z && y !=z) {
                    System.out.println("All numbers are different");
                  }
                  else{
                    System.out.println("Neither all are equal or different");
                  }

                }


                /*** Playing Cat  ***/

                public static boolean isCatPlaying(boolean summer, int temperature){
                  if (summer == true && temperature >= 25 && temperature <= 45) {
                    return true;
                  }
                  else if (summer == false && temperature >= 25 && temperature <= 35) {
                    return true;
                  }
                  else {
                    return false;
                  }

                }
}
