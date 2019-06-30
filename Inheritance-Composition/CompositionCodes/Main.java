import java.io.*;

public class Main{
  public static void main(String[] args) {

    Motherboard intel = new Motherboard("Core I7", "Latest BIOS", "Intel");
    //
    // System.out.print(intel.getManufacture());

    Case disney = new Case("Infant", "OFF", new Dimentions(6, 12, 2));

    disney.OnOffButton();

    PC myPc = new PC(disney, new Monitor("LG", 27, new Resolution(1080, 720)), intel);

    myPc.getMonitor().drawPixel(12, 2, "Blue");
    myPc.getMotherboard().loadProgram("Windows 10");
    //myPc.getTheCase();  // figured how to call the objects created in other classes
    //PC.getTheCase().getPowerSupply();

    myPc.pressPower();
    //System.out.println(myPc.getMotherboard().getModel());

  }
}
