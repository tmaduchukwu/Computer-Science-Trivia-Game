/*
Name: Tobechi Maduchukwu
Professor: Mukurram
Date: 7 December 2019
Description: The fields question, answer and value store the individual question in a trivia game, it’s correct answer and the
number of points earned for answering correctly. You must provide accessors for these fields and a constructor
to initialize them.
*/
public class TriviaQuestion { //fields
   private String question;
   private String answer;
   private int value;
   TriviaQuestion(String question, String answer, int value) { //constructor
      this.question = question;
      this.answer = answer;
      this.value = value;
   }
   public String getQuestion() { //accessor
      return this.question;
   }
   public String getAnswer() { //accessor
      return this.answer;
   }
   public int getValue() { //accessor
      return this.value;
   }
}