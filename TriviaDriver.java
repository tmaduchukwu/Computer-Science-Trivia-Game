/*
Name: Tobechi Maduchukwu 
Date: 7 December 2019
Professor: Mukurram
Description:In the driver you have your main method where you create a Scanner and call your playGame method. You need
to have a separate method for populating and returning your array of questions. In the playGame method you
will populate the question array, create your trivia game and then play games until they request to stop. At the
end you print the number of games they played and their average. Please refer to the sample output. You may
use your own questions but the rest of your output must match the sample. Also, use the return from the
askNextQuestion method to determine if there are more questions to be asked or not.
*/
import java.util.Scanner;

public class TriviaDriver {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      new TriviaDriver().playGame(sc);
   }
   public void playGame(Scanner sc) {
   
      int gamesPlayed = 0; //these variables will keep count of how many games played, total score, and average
      int totalScore = 0;
      double avgScore;
      //TriviaGame object
      TriviaGame tg = new TriviaGame(populateQuestions());
      while (true) {
         gamesPlayed++;
         while (tg.askNextQuestion()){}
         totalScore += tg.getScore();
         tg.restart();
         System.out.println("Game over! Would you like to play again?\n(Yes/No):");
         String choice = sc.next();
         if (choice.equalsIgnoreCase("No") || !choice.equalsIgnoreCase("Yes")) {
            break;
         }
      }
      avgScore = (double) totalScore/gamesPlayed;
      System.out.println("You played " + gamesPlayed + " games and your average score was " + avgScore + ". Thank you for playing, have a great day!");
   }
   public TriviaQuestion[] populateQuestions() {
   //this is an array of all the questions and answers for the quiz
      TriviaQuestion ob1 = new TriviaQuestion
      ("The first Pokemon that Ash receives from Professor Oak", "pikachu", 1);
      TriviaQuestion ob2 = new TriviaQuestion
      ("Erling Kagge skiied into here alone on January 7, 1993", "south pole", 2);
      TriviaQuestion ob3 = new TriviaQuestion
      ("1997 British band that produced 'Tub Thumper'", "chumbawumba", 2);
      TriviaQuestion ob4 = new TriviaQuestion
      ("Who is he tallest person record (8ft. 11 in) that has lived?", "Robert Wadlow", 3);
      TriviaQuestion ob5 = new TriviaQuestion
      ("PT Barnum said 'This way to the ____' to attract people to the exit.", "egress", 1);
      return new TriviaQuestion[]{ob1, ob2, ob3, ob4, ob5};
   }
}