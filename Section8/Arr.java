

public class Arr{

  public static void main(String[] args) {
    int[] myArray = new int[10];
    myArray[8]= 50;

    double[] darr = {1, 2, 22, 23, 35, 56, 68, 15};

    int[] otharr = new int[10];
    for (int i=0; i <otharr.length ; i++ ) {
      otharr[i] = i+1 ;
    }

    System.out.println("double array is " + darr[5]);
    System.out.println("my array is " + myArray[8]);
    System.out.println("other array is " + otharr[2]);

    printArray(darr);

    System.out.println("Average is" + getAverage(darr));

  }


  public static void printArray(double[] array){
    for (int i = 0; i < array.length ; i++ ) {
      System.out.println("Element " + i + ", Value " + array[i]);
    }
  }

  public static double getAverage(double[] array){
    double sum = 0;
    for (int i = 0; i< array.length ; i++ ) {
      sum+=array[i];
    }
    return sum/array.length;
  }
}
