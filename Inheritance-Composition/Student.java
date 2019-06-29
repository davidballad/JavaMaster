import java.io.*;

public class Student extends PersonInherit{

  private int gpa;
  private int grade;
  private String school;

  public Student(String name, int age, double income, int gpa, int grade, String school){
    super(name, age, income);
    this.gpa = gpa;
    this.grade = grade;
    this.school = school;
  }


}
