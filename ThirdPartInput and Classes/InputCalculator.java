import java.util.*;


public class InputCalculator {
  public static void main(String[] args) {



    System.out.println(getBucketCount(0.0, 2.1,1.5,7));
    inputThenPrintSumAndAverage();
  }

    public static void inputThenPrintSumAndAverage(){

      Scanner scan = new Scanner(System.in);
      int sum = 0;
      int average = 0;
      int count = 1;

      while (true) {

        System.out.println("Please enter a number: ");
        boolean hasNextInt = scan.hasNextInt();
        if (hasNextInt) {
          int number = scan.nextInt();
          sum += number;
          average = (int)(Math.round((double)sum/(double)count));
          count++;
          scan.nextLine();
        }
        else {
          System.out.println("SUM = " + sum + " AVG = " + average);
          break;
        }
      }
    }



    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
      if (width < 0 || height < 0 || areaPerBucket < 0 || extraBuckets < 0) {
        return -1;
      }
      double areaOfTheWall = width*height;
      double bucketsNeeded = Math.round(areaOfTheWall/areaPerBucket);
      int buy = (int)(bucketsNeeded)-extraBuckets;
      return buy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
      if (width < 0 || height < 0 || areaPerBucket < 0) {
        return -1;
      }
      double areaOfTheWall = width*height;
      double bucketsNeeded = Math.ceil(areaOfTheWall/areaPerBucket);
      return (int)bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket){
      if (area < 0 || areaPerBucket < 0) {
        return -1;
      }
      double calculation = Math.ceil(area/areaPerBucket);
      return (int)calculation;
    }

}
