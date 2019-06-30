import java.io.*;

public class Seats{
  private int seatNumber;

  public Seats(int seatNumber){
    this.seatNumber = seatNumber;
  }

  public int getSeatNumber(){
    return seatNumber;
  }

  public void chairNumber(){
    System.out.println("Number of seats is " + seatNumber);
  }

}
