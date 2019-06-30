import java.io.*;
import java.util.Scanner;

public class Available{
  private boolean isReserved;
    //private Room nameTag;      /* TODO i dont know how to call the default set value from other classes. research TODO */
  Scanner scan = new Scanner(System.in);


  public Available(boolean isReserved){
    this.isReserved = isReserved;
  }

  // public void getNameTag(){
  //   System.out.println(nameTag.getName());
  // }

  public boolean getIsReserved(){
    return isReserved;
  }

  public void roomReservation(){
    if (isReserved == true) {
      System.out.println("Room not available ");

    } else {
      System.out.println("Room available, would you like to reserve?" + "\n1 for YES, 2 for NO");
      int selection = scan.nextInt();
        if (selection == 1) {
          System.out.println("*** Reserving this room for your team...");
          System.out.println("Great! Your Reservation Number is ####");
        }
    }
  }
}
