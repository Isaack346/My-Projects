import java.util.Scanner;
public class GuessingGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.printf("I chose a number between 1 asnd 5. Try to guess it:");
        int guess = sc.nextInt();
        /// here i am declaring my scanner first then I create my print statement
        // then i declared my int as guess and used sc.nextInt() to get user input
         while(guess < 5) {
                System.out.println("Guess again:");
                guess = sc.nextInt();
                // here i used a while loop where is guess is less than 5 a print statement 
                // comes out and says guess again
                // then used guess to get user input 
         }
                if(guess==5) {
                    System.out.println("Congrats you got it!");
                    // here is the if statement for once the user finally puts 5
                    // a print statement will come out saying "Congrats you got it!"

                }


                }
         }