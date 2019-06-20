import java.io.*;

public class ComplexNumber{
  private double real;
  private double imaginary;

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

  public double getReal(){
    return real;
  }
  public double getImaginary(){
    return imaginary;
  }

  public void add(double real, double imaginary){
    this.real += real;
    this.imaginary += imaginary;
  }
  public void add(ComplexNumber complexnumber){
    this.add(complexnumber.getReal(), complexnumber.getImaginary());   // one way to do it
  }
  public void subtract(double real, double imaginary){
    this.real -= real;
    this.imaginary -=imaginary;
  }
  public void subtract(ComplexNumber complexnumber){
    this.subtract(complexnumber.real, complexnumber.imaginary);  // this way works too
  }

}
