import java.util.*;

public class FloatAndDouble
{
  public static void main(String[] args)
  {
    double pounds = 200;
    double conversion = pounds * 0.4539237;

    System.out.println(pounds + " pounds, is " + conversion + " in kilograms.");

    //char symbol "copyright"
    char myChar = '\u00A9';
    System.out.println(myChar);

                       /* Operators */

            boolean isCar = false;
            if (isCar==true){
            System.out.println("Not suppossed to happen");
          }

             isCar = true;
             boolean wasCar = isCar ? true : false;
             //if (isCar == true){ return wasCar true} else {wasCar false}
             if (wasCar)
             System.out.println("wasCar is true");


             //Challenge Question
             double variable, variable2, result;
             variable = 20;
             variable2 = 80;

             result = variable + variable2;
             result *= 25;
             System.out.println(result);

             double rem = result % 40;
             System.out.println(rem);

             if (rem <= 20){
               System.out.println("Total was over the limit");
             }






  }
}
