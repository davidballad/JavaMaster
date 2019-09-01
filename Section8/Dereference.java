import java.util.Arrays;

public class Dereference{
  public static void main(String[] args) {

    int[] myArray = new int[3];
    int[] yourArray = myArray;

    System.out.println("myArray values: " + Arrays.toString(myArray));
    System.out.println("yourArray values: " + Arrays.toString(yourArray));

    yourArray = new int[] {6, 6, 6};      //basically creating a new array
    dereference(yourArray);
    System.out.println("deref myArray values: " + Arrays.toString(myArray));
    System.out.println("deref yourArray values: " + Arrays.toString(yourArray));

  }

  private static void dereference(int[] array){     //you can deferentiate an array

    array[0] = 3;
  }

}
