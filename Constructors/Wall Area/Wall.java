import java.io.*;

public class Wall{

  private double height;
  private double width;

	public Wall() {
    this(0, 0);
	}
	public Wall(double width, double height) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
    if (height <= 0) {
      this.height = 0;
    }
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
    if (width <= 0) {
      this.width = 0;
    }
		return this.width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

  public double getArea(){
    return (this.height * this.width);
  }

}
