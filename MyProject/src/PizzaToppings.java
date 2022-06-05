import java.util.Scanner;
public class PizzaToppings {
 public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
boolean user = (false);
String answer;
String[]toppings = { "Mushroom" , "Onion" , "Pineapple" };
System.out.println("How many toppings would you like?");
int response = sc.nextInt();
if(response == 3) {
System.out.println("Great, enter each toppin");
/**
 * Above I created a Scanner then I created a String variable called answer 
 * After that I created a String array then proceeded to make a print statement
 * Asking how many toppings would the user like like
 * Next I got response from user and last I created a if statement where if the response is 
 * equal to the response a print statement comes out saying "Great enter each topping
 */
for(int i= 0; i<3; i++) {
System.out.print(i + ".");
toppings[0] = answer = sc.next();
	i++;
System.out.print(i + ".");
toppings[1] = answer = sc.next();
	    i++;
System.out.print(i + ".");
toppings[2] =answer = sc.next();
/**
 * Above I created a for loop 
 * then I updated my array elements by saing each array element equals
 * answer which equals sc.next
 */
	        }
	 System.out.println("Thank you! Here are the topping you ordered");
	  for(int i = 0; i < toppings.length; i++) {
	   System.out.println(i + "." + toppings[i]);
	   /**
	    * Above I created a print statement saying here are the toppings the user ordered
	    * then a for loop last a print statement printing out i + a period lastly the array
	    * itself with element being i so all element get printed out
	    */
	    }
	System.out.println("Please type anything to confirm your order.");
	String anything = sc.next();
	System.out.println("\nGreat a driver is on his way!");
	/**
	 * Above I tell user type anything to confirm order
	 * and lastly another print statement saying the driver is on his way.
	 */

	    }
if(user ==(false)) {
	System.out.println("Sorry the Minimum  and Max toppings is 3 Please restart the toppings process");
}
	    }

	}
