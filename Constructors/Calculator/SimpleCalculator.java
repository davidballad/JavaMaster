import java.io.*;

public class SimpleCalculator{
  private double firstNumber;
  private double secondNumber;

  public void setFirstNumber(double firstNumber){
    this.firstNumber = firstNumber;
  }
  public double getFirstNumber(){
    return firstNumber;
  }

  public void setSecondNumber(double secondNumber){
    this.secondNumber = secondNumber;
  }
  public double getSecondNumber(){
    return secondNumber;
  }

  public double getAddition(){
    return firstNumber + secondNumber;
  }
  public double getSubtraction(){
    return this.firstNumber - this.secondNumber;
  }
  public double getMultiplication(){
    return this.firstNumber*this.secondNumber;
  }
  public double getDivision(){
    if (secondNumber == 0) {
      return -1;
    }
    return firstNumber/secondNumber;
  }

}
