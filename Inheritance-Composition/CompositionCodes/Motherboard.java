import java.io.*;

public class Motherboard{

  private String model;
  private String bios;
  private String manufacture;

	public Motherboard(String model, String bios, String manufacture) {
		this.model = model;
		this.bios = bios;
    this.manufacture = manufacture;
	}

  public void loadProgram(String programName){
    System.out.println("Program "  + programName + " initialing.");
  }

  public String getModel(){
    return model;
  }
  public String getBios(){
    return bios;
  }
  public String getManufacture(){
  return manufacture;
  }
}
