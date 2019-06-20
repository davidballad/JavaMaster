import java.io.*;

public class Main{
  public static void main(String[] args) {
//     ComplexNumber one = new ComplexNumber(1.0, 1.0);
// ComplexNumber number = new ComplexNumber(2.5, -1.5);
// one.add(1,1);
// System.out.println("one.real= " + one.getReal());
// System.out.println("one.imaginary= " + one.getImaginary());
// one.subtract(number);
// System.out.println("one.real= " + one.getReal());
// System.out.println("one.imaginary= " + one.getImaginary());
// number.subtract(one);
// System.out.println("number.real= " + number.getReal());
// System.out.println("number.imaginary= " + number.getImaginary());
  ComplexNumber one = new ComplexNumber(15, 9);

  System.out.println("A complex number " + one.getReal());
  one.add(5, 1);
  System.out.println(one.getReal());
  one.subtract(1,1);
  System.out.println(one.getImaginary());


  }
}
