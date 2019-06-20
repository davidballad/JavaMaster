import java.io.*;

public class Car extends Vehicle{

  private String manufacture;

  public Car(int gears, int speed, String manufacture){
    super(gears, speed);
    this. manufacture = manufacture;
  }
  public String getManufacture(){
    return manufacture;
  }
}
