import java.util.*;

public class MethodsTwo {

  public static void main(String[] args) {

    // boolean gameOver = true;
    // int score = 800;
    // int levelCompleted = 5;
    // int bonus = 100;
    //
    // int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    // System.out.println("Your high score is " + highScore);
    //
    // score = 10000;
    // bonus = 200;
    // levelCompleted = 8;
    //
    // highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    // System.out.println("Your second final score is " + highScore);


          int highScorePosition = calculateHighScorePosition(1500);
          displayHighScorePosition("David", highScorePosition);

          highScorePosition = calculateHighScorePosition(900);
          displayHighScorePosition("Nadia", highScorePosition);

          highScorePosition = calculateHighScorePosition(400);
          displayHighScorePosition("Mateo", highScorePosition);

          highScorePosition = calculateHighScorePosition(50);
          displayHighScorePosition("Cassie", highScorePosition);


  }


  // public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
  //
  //   if (gameOver) {
  //     int finalScore = score + (levelCompleted * bonus);
  //     finalScore += 2000;
  //     return finalScore;
  //   }
  //   else {
  //     return -1;
  //   }
  // }



        public static void displayHighScorePosition(String playerName, int highScorePosition){
          System.out.println(playerName + " finished in position " + highScorePosition);

        }


              public static int calculateHighScorePosition(int playerScore){
                if (playerScore >= 1000) {
                return 1;
                }
                else if (playerScore >= 500) {
                return 2;
                }
                else if (playerScore >= 100) {
                  return 3;
                }
                return 4;
                // int position = 4;   //assuming position 4 will be return
                // if (playerScore >= 1000) {
                //   position = 1;
                // }
                // else if (playerScore >= 500) {
                //   position = 2;
                // }
                // else if (playerScore >=100) {
                //   position = 3;
                // }
                // return position;

              }

}
