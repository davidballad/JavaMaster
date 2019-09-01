import java.util.Scanner;

public class ArrPractice{

  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int[] myNum = getNum(6);
    printNum(myNum);
  }

  public static int[] getNum(int a){
    System.out.println("Please enter a value to fill the array\r");
    int[] get = new int[a];
    for (int i = 0;i<get.length ;i++ ) {
      get[i] = scan.nextInt();
    }
    return get;
  }

  public static void printNum(int[] getMyNum){
    for (int i = 0;i<getMyNum.length ;i++ ) {
      System.out.println("Position " + i + " value is " + getMyNum[i]);
    }
  }

}
