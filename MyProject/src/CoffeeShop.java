import java.util.Scanner;
public class CoffeeShop {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	// Created a Scanner
	System.out.print("Do you sell coffee?");
	String response = sc.nextLine();
	// above a print statement asking if we sell coffee then
	// I created a variable then used sc.next to get response
	String[]store = {"Juice" , "Coffee" , "Sauce" , "Apples" , "Orange" };
	// above in my array 
	for(int i = 0; i <1; i++) {
	if(response.toLowerCase().equals("yes")) {
		System.out.println("We have that in aisle: " +  (i + 1));
		if(i == 1 ) {
			break;
		}
		/**
		 * Above first i created the array then the loop for the array
		 * after that i created a if statement that ==  Yes
		 * for if the user says user then the print statement 
		 * comes out and in the print statement I included
		 * i which is the loop and I added 1 to it so that it matches the coffee
		 * index in my array which is [1]
		 * 
		 * Also i did i<1 so I would get 0 then added 1 so it == Coffee
		 */
			
			
		}
	
	
	
	else {
		System.out.println("Sorry we do not sell coffee here. ");
		// here is just a else statement in case the user inputs something other than yes
	}
	}
	}
}

	


