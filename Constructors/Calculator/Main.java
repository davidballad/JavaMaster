import java.io.*;

public class Main{
  public static void main(String[] args) {

    SimpleCalculator test = new SimpleCalculator();
    test.setFirstNumber(100);
    test.setSecondNumber(10);


    System.out.println("Result= " + Math.round(test.getDivision()));
  }

}
