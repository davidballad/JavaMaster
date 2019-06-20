import java.io.*;

public class Ferrari extends Car{

  private static String motor;

  public Ferrari(int gears, int speed, String manufacture, String motor){
    super(gears, speed, manufacture);
    Ferrari.motor = motor;
  }

  public String getMotor(){
    return motor;
  }

}
