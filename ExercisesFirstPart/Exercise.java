import java.util.*;

public class Exercise {
public static void main(String[] args) {

        boolean test = areEqualByThreeDecimalPlaces(6.9089,6.908);
        System.out.println(test);

        boolean sum = hasEqualSum(1,5,3);
        System.out.println(sum);

        boolean isWith = includesATeen(3, 119, 25);
        System.out.println(isWith);

        boolean teen = isTeen(13);
        System.out.print(teen);

}


public static boolean areEqualByThreeDecimalPlaces(double num, double num1){
        num *= 1000;
        num1 *= 1000;
        if ((int)num == (int)num1) {
                return true;
        }
        else {
                return false;
        }
}


                public static boolean hasEqualSum(int a, int b, int c){
                  a += b;
                  if ( a == c) {
                    return true;
                  }
                  return false;
                }


                          public static boolean includesATeen(int age, int age1, int age2){
                            if (age >=13 && age <= 19 || age1 >=13 && age1 <= 19 || age2 >=13 && age2 <= 19) {
                              return true;
                            }
                            else
                              return false;
                          }

                          public static boolean isTeen(int range){
                            if (range >=13 && range <= 19) {
                              return true;
                            }
                            return false;
                          }
}

// Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
// The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
