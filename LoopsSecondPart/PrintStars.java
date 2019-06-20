import java.util.*;

public class PrintStars{

  public static void main(String[] args) {

    printSquareStar(8);
  }

  public static void printSquareStar(int num){
    if (num < 5) {
      System.out.println("Invalid Value");
    }
      else{

        for (int i = 1; i<=num ; i++) {
          for (int j = 1; j<=num ;j++) {
            if (i == 1 || i == num || j == 1 || j ==num || (i==j) || j==(num-i)+1) {
              System.out.print("*");
            }
            else
              System.out.print(" ");
          }
              System.out.println();
        }
      }
  }
}


// The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).

// Explanation:
// *****   5 stars
// ** **   2 stars space 2 stars
// * * *   1 star space 1 star space 1 star
// ** **   2 stars space 2 stars
// *****   5 stars

// The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):
// * In the first or last row
// * In the first or last column
// * When the row number equals the column number
// * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
// HINT: Use a nested loop (a loop inside of a loop).
// HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints a space and does not "move" to another line.
// HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .
// NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.
// NOTE: Do not add a main method to the solution code.
