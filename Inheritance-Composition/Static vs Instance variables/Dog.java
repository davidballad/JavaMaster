import java.io.*;

public class Dog{

  private static String name;

  public Dog(String name){
    Dog.name = name;   // use the class name when calling static variables
  }
  //public Dog(String name){
  //  this.name =name;          /* regular this. when calling non-static(instance) variables */
  //}
  public void printName(){
    System.out.println("Name " + name);
  }
}
