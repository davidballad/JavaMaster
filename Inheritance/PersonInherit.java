import java.io.*;

public class PersonInherit{

  private String name;
  private int age;
  private double income;

  public PersonInherit(String name, int age, double income){
    this.name = name;
    this.age = age;
    this.income = income;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public double getIncome(){
    return income;
  }
}
