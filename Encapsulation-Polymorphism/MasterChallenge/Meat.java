import java.io.*;

public class Meat{
  private String meatType = "No meat selected";

	public Meat(String meatType) {
		this.meatType = meatType;
	}

	public String getMeatType() {
		return meatType;
	}

  public void meatSelection(){
    System.out.println("Meat: " + meatType + " selected.");
  }

  public double meatCost(){
    if (meatType == "chicken") {
      return 2;
    }
      else if (meatType == "pork") {
        return 4;
      }
        else if(meatType == "beef"){
          return 3.5;
        }
        else {
          return 1;
        }
  }




}
