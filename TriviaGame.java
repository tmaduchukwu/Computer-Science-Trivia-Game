/*
Name: Tobechi Maduchukwu
Professor: Mukurram
Date: 7 December 2019
Description: The questions that are to be asked in the trivia game are stored in an array of TriviaQuestion objects. This, in
additional to the score and questionNum are fields in the class. The questionNum field is used to store the last
question that was asked (initially set to 0). The constructor needs an array of questions. Make sure to use the
Arrays.copyOf() method here to copy the questions into the game and not link (copy by reference) to the
questions in the driver class. This is an important habit to get into.
The askNextQuestion() method should return true if there are more questions and false otherwise. In this
method you are to prompt the user to answer the question, use a Scanner object to read in the response and if
it matches the answer (ignore case) then add the value of the question into their score. You also need a method
showScore() to print out the user’s current score, a method restart() to reset the score and the questionNum
fields. Finally, you need an accessor method for the score field.
*/
import java.util.*;
public class TriviaGame {
   private TriviaQuestion questions[]; //learn to make an object a field
   private int score;
   private int questionNum;
   
   TriviaGame(TriviaQuestion questions[]) { //constructor
      this.questions = Arrays.copyOf(questions,questions.length);
      this.score = 0;
      this.questionNum = 0;
   }
   public boolean askNextQuestion() {// returns true if a question was asked
      this.questionNum++;
      if (this.questionNum > questions.length) {
         return false;
      }
      Scanner sc = new Scanner(System.in);
      String question = questions[questionNum - 1].getQuestion();
      String answer = questions[questionNum - 1].getAnswer();
      //int value = questions[questionNum - 1].getValue();
      System.out.println("\nQuestion " + questionNum);
      //System.out.print("For " + + " point...");
      System.out.println(question);
      String answer1 = sc.nextLine();
      if (answer1.equalsIgnoreCase(answer)) { 
         System.out.println("That is correct!");
         this.score += 1;
      }
      else {
         System.out.println("Wrong. The correct answer is " + answer);
      }
      showScore();
      return true;
   }
   public void showScore() {
      System.out.println("Your score is " + this.score);
   }
   public void restart() {
      this.score = 0;
      this.questionNum = 0;
   }
   public int getScore() {
      return this.score;
   }
}
