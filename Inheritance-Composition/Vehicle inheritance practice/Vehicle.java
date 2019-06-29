import java.io.*;

public class Vehicle{

  //private boolean steering;
  private int gears;
  private int speed;

  public Vehicle(int gears, int speed){
    //his.steering = steering;
    this.gears = gears;
    this.speed = speed;
  }

  public int getSpeed(){
    if (speed < 0) {
      return 0;
    }
    return speed;
  }

  public int getGear(){
    if (speed > 0 && speed <= 15) {
      return gears = 1;
    }
    else if (speed > 15 && speed < 25) {
      gears = 2;
      return gears;
    }
    else {
      return gears = 3;
    }
  }




}
