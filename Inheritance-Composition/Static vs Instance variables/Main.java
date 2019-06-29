import java.io.*;

public class Main{
  public static void main(String[] args) {

    Dog rex = new Dog("REX");
    Dog amy = new Dog("AMY");
    rex.printName();
    amy.printName();      //the variable is static therefore the name chsnge for both.

  }
}
