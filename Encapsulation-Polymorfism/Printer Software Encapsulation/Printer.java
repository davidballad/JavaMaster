import java.io.*;

public class Printer{

  private double inkLevel;
  private int numberOfPagesPrinted;
  private boolean isDuplex;

	public Printer(int numberOfPagesPrinted, boolean isDuplex) {
    if (inkLevel > 0 && inkLevel < 100) {
      this.inkLevel = 0;
    }

		this.numberOfPagesPrinted = numberOfPagesPrinted;
		this.isDuplex = isDuplex;
	}


  public void refill(double part){
    if (inkLevel < 10) {
      System.out.println("Please Replace toner ASAP");
    }
    if (part > 0 && part <= 100 && inkLevel <=100) {
    inkLevel +=part;
    System.out.println("Toner Filled, Ink Level: " + inkLevel + "%");
    }
    else if (part > 100 || inkLevel > 100) {
      System.out.println("Invalid toner");
    }
  }

  public void duplex(){
    if (isDuplex) {
      System.out.println("Duplex mode available");
    } else {
    System.out.println("Duplex mode not available");
      }
  }

  public void printPage(int pages){
    if (inkLevel < 1) {
      System.out.println("NOT ENOUGH INK TO PRINT");
    }
      if (isDuplex && inkLevel > 1) {
      System.out.println("Printing " + pages + " pages in duplex mode");
      numberOfPagesPrinted += (pages/2) + (pages%2);
      }
      else if(inkLevel > 1){
        System.out.println("Printing " + pages + " pages");
        numberOfPagesPrinted += pages;
      }
  }




	public double getInkLevel() {
		return inkLevel;
	}

	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	public boolean getIsDuplex() {
		return isDuplex;
	}
}
