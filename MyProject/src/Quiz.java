import java.util.Scanner;
public class Quiz {
	public static void main(String[] args) {
		Scanner response = new Scanner(System.in);
	System.out.println("Chapter 5 Section 3 Test No Caculators, Phones and Pens are allowed! Please use PENCIL ONLY !");
    System.out.println("\nQuestion 1: Which country held the 2016 olympics?\na) China\nb) Ireland\nc) Brazil\nd) Italy");
	String question1 = response.next();
   System.out.println("Question 2: Which planet is the hottest?\na) Venus \nb) Saturn \nc) Mercury \nd) Mars");
	String question2 = response.next();
   System.out.println("Question 3: What is the rarest blood type? \na) 0 \nb) A \nc) B \nd) AB-Negative");
	 String question3 = response.next();
  System.out.println("Question 4: What one of these characters is friend with Harry Potter?(Please only select one answer ) \na) Ron Weasley \nb) Hermione Granger \nc) Draco Malfoy ");
   String question4 = response.next();
/**
 * First I created my Scanner then I made print statements which the \
 *questions for the quiz underneath the questions for the quiz
 *I created a variable a declared it as a String but i also used next()
 *in the same line for user input
 */
		     int score = 0;
		     if(question1.equals("c"))  {
	             score += 5;
		    	
		    	 /**
		    	  * here i have int score equals 0 because the student starts off with a grade of 0 
		    	  * then i have for question 1 if they input "a" they get  
		    	  * 5 points ( which i did +5) after that because each question is 5 points
		    	  * below is the same thing all the way till question 4
		    	  */
		    	 
}
  if (question2.equals("a")) {
		    	 score += 5;
  }
		    if(question3.equals("d")) {
		    	score += 5;
		    }
		    if(question4.equals("a") || question4.equals("d")) {
		    	score += 5;
		    }
		    System.out.println("Your final score is " + score);
		    /**
		     * Above I have a print statement where it says the final score plus
		     * the user total score added up.
		     */
 {
if (score>= 15) {
	System.out.println("Great Job!");
	/**
	 * Above and below i have if statements for is the user score is 
	 * above or equal to a certain amount then
	 * a print statement will come out
	 */
}
else if (score>= 5 && score< 15) {
	System.out.println("Not bad");
	}
else if (score<= 5) {
System.out.println("You need to study more !");
	}
 }
	}
}
