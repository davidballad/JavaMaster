import java.util.*;

public class Overload{

  private static final String INVALID_MESSAGE = "Invalid Value";

  public static void main(String[] args) {
    double solution = calcFeetAndInchesToCentimeters(6, 7);
    System.out.println(solution);

    calcFeetAndInchesToCentimeters(158);


          String clock = getDurationString(65, 45);
          System.out.println(clock);

          String clock2 = getDurationString(-3945);
          System.out.println(clock2);

  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches){
    if (feet <0 || inches <0 || inches >12) {
      return -1;
    }
    else {
      return ((feet *12)* 2.54) + (inches * 2.54);
    }
  }

          public static double calcFeetAndInchesToCentimeters(double inches){
            if (inches <0 ) {
              return -1;
            }
            double feet = (int)(inches / 12);
            double remaining = (int)(inches % 12);
            System.out.println(inches + " in = " + feet + "'" + remaining + "''" );
            return calcFeetAndInchesToCentimeters(feet, remaining);
          }



                /***** Seconds and Minutes Challenge *****/

              private static String getDurationString(int mins, int sec){
                if (mins < 0 || sec < 0 || sec > 59) {
                 return INVALID_MESSAGE;

                }
                int hours = mins/60;
                int minutes = mins % 60;
                int seconds = sec;
                String myString = hours +"h "+minutes+"m "+seconds+"s";
                return myString;



              }
              private static String getDurationString(int sec){
                if (sec < 0) {
                  return INVALID_MESSAGE;

                }
                int calcMins = (sec / 60);
                int calSec = sec % 60;
                return getDurationString(calcMins, calSec);
              }


}
