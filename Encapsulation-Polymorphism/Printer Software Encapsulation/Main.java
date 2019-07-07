import java.io.*;

public class Main{
  public static void main(String[] args) {

    Printer one = new Printer(500, true);
    one.duplex();
    System.out.println("Current Ink Level: " + one.getInkLevel() + "%");
    one.refill(100);

    System.out.println("TOTAL Pages printed: " + one.getNumberOfPagesPrinted());
    one.printPage(5);
    System.out.println("TOTAL Pages printed: " + one.getNumberOfPagesPrinted());
  }
}
