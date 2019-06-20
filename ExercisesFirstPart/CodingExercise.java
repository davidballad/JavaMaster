import java.util.*;

public class CodingExercise {

  public static void main(String[] args) {

    long miles = toMilesPerHour(100);
    System.out.println(miles);


    printConversion(100);
    printConversion(0);
  }

public static long toMilesPerHour(double kilometersPerHour){
  if (kilometersPerHour >= 0) {
    return Math.round(kilometersPerHour/1.609);
  }
  else {
    return -1;
  }
}

      public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
          System.out.println("Invalid Value");
        }
        else {
          long milesPerHour = toMilesPerHour(kilometersPerHour);
          System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

      }

}
