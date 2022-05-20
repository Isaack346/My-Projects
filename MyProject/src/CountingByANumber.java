import java.util.Scanner;
public class CountingByANumber {
public static void main(String[] args) {
        // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int guess;
    int count;
        System.out.printf("What number would you like to count by?");
        int number  = sc.nextInt();
        System.out.printf("Pick a number to start counting from:");
        guess = sc.nextInt();
        System.out.println("Pick a number to count to:");
        count = sc.nextInt();
        /// above i declared my variables as integers before that i created my scanner.
        // then put print statements using printf and got user input
        for(int i = number ,  j = guess  , e = count;  j <= e ; j += number ) {
            System.out.print( "\t" + j);
            /// here i created a for loop the for loop contains i , j and e
            // i = number , j = guess and e = count and i declared all three of those as integers
            // then the program runs until j equals.
            // If i cannot equal e it stops at the last number it can before surrpassing e
            //but i starts from j
            // and moves up in increments of i 

        }
    }

}