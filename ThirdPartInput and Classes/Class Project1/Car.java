import java.util.*;

public class Car{

  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String color;

  public void setModel(String model){
    String validModel = model.toLowerCase();
    if (validModel.equals("carrera") || validModel.equals("spider")) {
      this.model = model;                // second "model" is parameter from line 7
    }
    else {
      this.model = "Unknown";
    }

  }

  public String getModel(){
    return this.model;
  }

}
