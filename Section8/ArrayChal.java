import java.util.Arrays;
import java.util.Scanner;

public class ArrayChal{

  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    int[] array = getValues(4);
    

    int[] order = sortArray(array);
    printArray(order); 

    reverseArray(array);
    System.out.println("Reverse array is: " + Arrays.toString(array));

  }

  public static int[] getValues(int num){
    System.out.println("Enter " + num + " numbers: \r" );
    int[] values = new int[num];

    for (int i = 0; i<values.length ; i++ ) {
      values[i] = scan.nextInt();
    }
    return values;
  }

  public static void printArray(int[] arr){
    for (int i = 0; i<arr.length ; i++ ) {
      System.out.println("Value " + i + " contains " + arr[i]);
    }
  }

  public static int[] sortArray(int[] array) {
    int temp;
    boolean flag = true;        // will make sure we always eneter the array

    // int[] sortArr = new int[array.length];
    // for (int i = 0; i < array.length; i++) {
    //   sortArr[i] = array[i];          //we are duplicating the arrays
    // }

    /* Different way to copy an array below */
    int [] sortArr = Arrays.copyOf(array, array.length);
    
      while (flag) {
        flag = false;     //it will stop an infinite loop
        for (int i = 0; i < sortArr.length - 1; i++) {
          if (sortArr[i] < sortArr[i+1]) {
            temp = sortArr[i];
            sortArr[i] = sortArr[i+1];
            sortArr[i+1] = temp;
            flag = true;              //make sure we enter the loop at least one more time
          }
        }
      }
      return sortArr;

  }

      private static void reverseArray(int[] array){
        int temp;
        int half = array.length /2;
        int mirror = array.length-1;
          for (int i = 0; i < half; i++) {
            temp = array[mirror-i];
            array[mirror-i] = array[i];
            array[i] = temp;
          }

      }
}
