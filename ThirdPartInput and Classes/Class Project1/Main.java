import java.util.*;

public class Main{

  public static void main(String[] args) {
        Car porche = new Car();
        Car ferrari = new Car();

    //System.out.println("Model is " + porche.getModel()); //calling get before setModel, prints null

    porche.setModel("Carrera");       //define the type

    System.out.println("Model is " + porche.getModel());
  }
}
