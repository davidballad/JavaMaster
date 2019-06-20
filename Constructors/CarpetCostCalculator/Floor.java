import java.io.*;

public class Floor{
  private double width;
  private double length;

	public Floor(double width, double length) {
    if (this.width < 0) {
      this.width = 0;
    }
		this.width = width;

    if (this.length < 0) {
      this.length = 0;
    }
		this.length = length;
  }
    public double getArea(){
      return (this.width*this.length);
	}
}
