import java.io.*;
import java.util.Scanner;

public class Arr2{

  private static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {

    int[] myIntegers = getIntegers(6);
    for (int i =0 ;i<myIntegers.length ; i++ ) {
      System.out.println("Element " + i + " value is " + myIntegers[i]);
    }

  }

  public static int[] getIntegers(int number){
    System.out.println("Enter " + number + " value\r");
    int[] value = new int[number];

    for (int i= 0;i<value.length ; i++ ) {
      value[i] = scan.nextInt();
    }
    return value;
  }


}
