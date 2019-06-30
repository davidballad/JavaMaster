import java.io.*;

public class Main{
  public static void main(String[] args) {

    Room one = new Room("Developers", new Seats(10), new Available(true));


    one.seatCall();
    //one.getSeat().chairNumber();
    one.chooseRoom();
    System.out.println(one.getName());


  }

}


// int x = 1;
// do {
//   x+=10;
// } while (false);
