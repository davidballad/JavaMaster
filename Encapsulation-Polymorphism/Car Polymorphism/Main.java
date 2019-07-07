import java.io.*;

class Car{
  private String name;
  private boolean FWD;
  private int cylinders;
  private int doors;


	public Car(String name, boolean FWD, int cylinders, int doors) {
    this.name = name;
		this.FWD = FWD;
		this.cylinders = cylinders;
		this.doors = doors;
	}
    public String getName(){
      return name;
    }

  	public boolean isFWD() {
  		return FWD;
  	}

  	public int getCylinders() {
  		return cylinders;
  	}

  	public int getDoors() {
  		return doors;
  	}

  	public String maker() {
  		return " Not Maker**DEFAULT** ";
  	}

    public String owner(){
      return " No Owner**DEFAULT** ";
    }

}

class Mazda extends Car{
  public Mazda(){
    super("Mazda",true, 4, 5);
  }

    @Override
    public String owner(){
      return "David";
    }

    @Override
    public String maker(){
      return "Japan";
    }
}


class Honda extends Car{
  public Honda(){
    super("Honda",true, 6, 8);
  }

    @Override
    public String owner(){
      return "Mateo";
    }

    @Override
    public String maker(){
      return "Korea";
    }
}

class Unknown extends Car{
  public Unknown(){
    super("No car", false, 1, 1);
  }
}



public class Main{
  public static void main(String[] args) {
  //  Car test = new Car("DEFAULT", true, 7, 8);

  for (int i= 1; i < 4 ;i++ ) {
    Car test = randomCar();
    System.out.println("Car #" + i + test.getName()  + " car made in " + test.maker() + ". Owned by " + test.owner());
    System.out.println("cylinders " + test.getCylinders());
    System.out.println("FWD? " + test.isFWD());
  }

  }

  public static Car randomCar(){
    int raNum = (int)(Math.random() * 3)+1;

    switch (raNum) {
      case 1:
        return new Mazda();

        case 2:
          return new Honda();

          case 3:
            return new Unknown();

            default:
              return null;





    }
  }


}
