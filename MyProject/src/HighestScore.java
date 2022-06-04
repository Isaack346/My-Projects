import java.util.Arrays;
import java.util.Collections;
public class HighestScore {
    public static void main(String[]args) {
        Integer[]scores = {5378 , 6783 , 1456 , 3457 ,7634 , 1234 , 2231 };
        int max = Collections.max(Arrays.asList(scores));
        System.out.print("Here are the scores: " );
        for(int i = 0; i <scores.length; i++) {
            System.out.print(" " + scores[i]);
            /**
             * ABove I created my array 
             * Then I created a the integer max using Collections.max(Arrays.asList)
             * After i created a for loop that starts from 0 because array counts from 0 
             * so forth 
             * Last I printed a statement where i used "" to give space after every score is 
             * printed and at the end of my print statement
             * I put scores[i] so that all the numbers in my array get printed
             *
             */
        }
        //System.out.println("Here are the scores" + Arrays.toString(scores));
      System.out.println("\nThe highest score is " + max + " Give that man a cookie.");
      // Here is another print statement where I just said what the highests score is and
      // then give that man a cookie!

    }

}
