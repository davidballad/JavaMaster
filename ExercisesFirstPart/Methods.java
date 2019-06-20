import java.util.*;

public class Methods {

  // public static void main(String[] args) {
  //
  //   calculateScore(true, 800, 5, 100);
  //
  //   calculateScore(true, 10000, 8, 200);
  //
  // }
  //
  //
  // public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
  //
  //   if (gameOver) {
  //     int finalScore = score + (levelCompleted * bonus);
  //     finalScore += 2000;
  //     System.out.println(finalScore);
  //     return finalScore;
  //   }
  //   else {
  //     return -1;
  //   }
  //
  // }

  boolean gameOver = true;
  int score = 800;
  int levelCompleted = 5;
  int bonus = 100;

  if (gameOver) {
 int finalScore = score + (levelCompleted * bonus);
finalScore += 1000;
 System.out.println(finalScore);

  }
  score = 10000;
  levelCompleted = 8;
  bonus = 200;

  if (gameOver) {
  int finalScore = score + (levelCompleted * bonus);
  System.out.println(finalScore);


}
