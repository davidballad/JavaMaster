import java.io.*;

public class SimpleCalculator{
  private double firstNumber;
  private double secondNumber;

  public void setFirstNumber(double firstNumber){
    this.firstNumber = firstNumber;
  }

  public void setSecondNumber(double secondNumber){
    this.secondNumber = secondNumber;
  }

  public double getFirstNumber(){
    return this.firstNumber;
  }

  public double getSecondNumber(){
    return this.secondNumber;
  }

  public double getAdditionResult(){
    return (this.firstNumber + this.secondNumber);            /*apparently you can access them both ways, by using this or simple the name*/
  }

  public double getSubstractionResult(){
    return (firstNumber - secondNumber);
  }

  public double getMultiplicationResult(){
    return (firstNumber * secondNumber);
  }

  public double getDivisionResult(){
    if (secondNumber == 0) {
      return 0;
    }
    return (firstNumber/secondNumber);
  }
}
