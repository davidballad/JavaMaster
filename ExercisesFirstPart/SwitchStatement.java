import java.util.*;

public class SwitchStatement {
public static void main(String[] args) {
        printDayOfTheWeek(7);
        printNumberInWord(2);

        String value = "Aa";
        switch (value.toLowerCase()) {

        case "aa":
                System.out.println("Is --A--");
                break;

        case "B":
                System.out.println("Is --B--");
                break;

        default:
                System.out.println("Neither one");
        }
}
public static void printDayOfTheWeek(int day){
        switch (day) {
        case 0:
                System.out.println("Sunday");
                break;

        case 1:
                System.out.println("Monday");
                break;
        case 2:
                System.out.println("Tuesday");
                break;
        case 3:
                System.out.println("Wednesday");
                break;
        case 4:
                System.out.println("Thursday");
                break;
        case 5:
                System.out.println("Friday");
                break;
        case 6:
                System.out.println("Saturday");
                break;
        default:
                System.out.println("Invalid Value");
        }

        // if (day ==0) {
        //         System.out.println("Sunday");
        // }
        // else if (day ==1) {
        //         System.out.println("Monday");
        // }
        // else if (day ==2) {
        //         System.out.println("Tuesday");
        // }else if (day ==3) {
        //         System.out.println("Wednesday");
        // }else if (day ==4) {
        //         System.out.println("Thursday");
        // }
        // else if (day ==5) {
        //         System.out.println("Friday");
        // }else if (day ==6) {
        //         System.out.println("Saturday");
        // }
        // else {
        //         System.out.println("Invalid Value");
        // }
}


/** Question **/

public static void printNumberInWord(int number){
        switch (number) {
        case 0:
                System.out.println("ZERO");
                break;
        case 1:
                System.out.println("ONE");
                break;
        case 2:
                System.out.println("TWO");
                break;
        case 3:
                System.out.println("THREE");
                break;
        case 4:
                System.out.println("FOUR");
                break;
        case 5:
                System.out.println("FIVE");
                break;
        case 6:
                System.out.println("SIX");
                break;
        case 7:
                System.out.println("SEVEN");
                break;
        case 8:
                System.out.println("EIGHT");
                break;
        case 9:
                System.out.println("NINE");
                break;
        default:
                System.out.println("OTHER");
        }
}


}
