import java.util.*;

public class Numbers
{
  public static void main(String[] args) {

    //create a byte
    byte myByte = 10;
    //create a short
    short myShort = 20;
    //create an int
    int myInt = 50;
    //create a long
    long myLong = 50000L + (10 * (myByte + myShort + myInt));

    short shortTotal = (short) (6000 + (10 * (myByte + myShort + myInt)));



    System.out.print(shortTotal);
  }
}
