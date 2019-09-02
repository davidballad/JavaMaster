import java.util.Arrays;

public class Dereference{
  public static void main(String[] args) {

    int[] myArray = new int[3];
    int[] yourArray = myArray;

    System.out.println("myArray values: " + Arrays.toString(myArray));
    System.out.println("yourArray values: " + Arrays.toString(yourArray));

    yourArray = new int[] {6, 6, 6};      //basically creating a new array because we cannot dereference an array
    dereference(yourArray);
    System.out.println("deref myArray values: " + Arrays.toString(myArray));
    System.out.println("deref yourArray values: " + Arrays.toString(dereference(yourArray)));


          int a = 16;
          int b = a;
          System.out.println("A is: " + a);
          System.out.println("B is: " + b);



          System.out.println("A in deref is: " + a);
          System.out.println("B in deref is: " + derefNum(b));
  }

  private static int[] dereference(int[] array){     //you can NOT deferentiate an array. CHANGE TO VOID

    array[0] = 3;
    return array;
  }

          private static int derefNum(int num){      // Not fully understood
            num += 8;
            return num;
          }

}
