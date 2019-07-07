import java.io.*;

class Movie{
  private String name;

  public Movie(String name){
    this.name =name;
  }

  public String plot(){
    return "No plot here";
  }

  public String getName(){
    return name;
  }
}




class Jaws extends Movie{
  public Jaws(){
    super("Jaws");
  }
  @Override
  public String plot(){
    return "Ashark";
  }
}


  class Transformer extends Movie{
    public Transformer(){
      super("Transformer");
    }

    @Override
    public String plot(){
      return "A car robot transforms";
    }
  }


  class StarWars extends Movie{
    public StarWars(){
      super("StarWars");
    }
    @Override
    public String plot(){
      return "The Empire strikes back";
    }
  }


  class Forgettable extends Movie{
    public Forgettable(){
      super("Forgettable");
    }

    //no plot override method
  }



  public class Main{
    public static void main(String[] args) {

      for (int i=1; i<10 ;i++) {
        Movie test = randomMovie();
        System.out.println("Movie #" + i + " is: " + test.getName());
        System.out.println("Plot: " + test.plot() );
      }


    }

    public static Movie randomMovie(){
      int randomNum = (int) (Math.random() * 4)+1;        //Math.random() returns a int between 0-1
      System.out.println("Random number generated: " + randomNum);

      switch (randomNum) {
        case 1:
          return new Jaws();

        case 2:
          return new Transformer();

        case 3:
          return new StarWars();

        case 4:
          return new Forgettable();

          default:
            return null;
      }
    }


  }
