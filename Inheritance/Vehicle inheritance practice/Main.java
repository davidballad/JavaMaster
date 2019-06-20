import java.io.*;

public class Main{
  public static void main(String[] args) {

    Vehicle one = new Vehicle(1, 30);
    System.out.println("At " + one.getSpeed() + "Kmh, the gear is "+one.getGear());

    Car old = new Car(1, 10, "Maranello");
    System.out.println(old.getManufacture());
    System.out.println(old.getSpeed());

    Ferrari enzo = new Ferrari(1, 40, "Italia", "V12");
    System.out.println(enzo.getGear());

  }
}
