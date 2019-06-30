import java.io.*;

public class Case{

  private String model;
  private String powerSupply;
  private Dimentions dimentions;


	public Case(String model, String powerSupply, Dimentions dimentions) {
		this.model = model;
		this.powerSupply = powerSupply;
		this.dimentions = dimentions;
	}

  public void OnOffButton(){
    System.out.println("** Power button pressed **");
  }

  public String getPowerSupply(){
    return powerSupply;
  }
}
