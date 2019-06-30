import java.io.*;

public class Monitor{

  private String model;
  private int size;
  private Resolution resolution;


	public Monitor(String model, int size, Resolution resolution) {
		this.model = model;
		this.size = size;
		this.resolution = resolution;
	}
  
  public void drawPixel(int x, int y, String color){
    System.out.println(color + " pixel at " + x + ", " + y);
  }
}
