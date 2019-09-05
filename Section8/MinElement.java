import java.util.Arrays;
import java.util.Scanner;

public class MinElement{
   
   private static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      int[] myArray = readNums(3);

      System.out.println("Your values are " + Arrays.toString(myArray));

      System.out.println("The minimum value in your array is: " + findMin(myArray)); 
   }

   private static int[] readNums(int count){
      System.out.println("Please enter " + count + " values\r");
      int[] array = new int[count];

      for (int i = 0; i < array.length; i++) {
         array[i] = scan.nextInt();
      }
      return array;
   }

   public static int findMin(int[] array){
      //System.out.println("The copy of the array is: " + Arrays.toString(min));     // this line is not neccesary, i was just testing.
      int min = Integer.MAX_VALUE;
         for (int i = 0; i < array.length-1; i++) {
            if (array[i]<array[i+1]) {
               min = array[i];
            } else{
               min = array[i+1];
            } 
         }
      return min;
   }
}