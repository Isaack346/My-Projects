import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class HighestScoreSeat {
    public static void main(String[]args) {
        Integer[]scores = {22778 , 30428 ,46338 , 35390 , 786231};
        // right here i created my array
        int max = Collections.max(Arrays.asList(scores));
        System.out.println("The highest score is: " + max + "." + " Impressive!");
        boolean user = true;
        /**
         *  Above I created my mx integer so that I can use that to
         *  get the max number from my array
         *  I also created a boolean variable called user
         */
    
        for(int i = 0; i< scores.length; i++) {
            if(scores[i].equals(max)){
            System.out.println("It's the gentlemen in seat:" + i + " Give that man a cookie!");
            /**
             *  Right Here I created a for loop where i starts at 0 and its less than the length of my array
             *  and goes up in increments of 1
             *  then i made a if statement where if I == max then a print statement comes out and 
             *  says its the gentleman in the seat + i because i is the number that max is in my
             *  Index which is 4 then added another print statement
             */
         
        }
        if(user = (false)) {
            System.out.println("Sorry that is the incorrect seat ");
            // right here the boolean = false then print statement comes out saying sorry 
            // incorrect seat
        }

    }

}
}