import java.util.Scanner;
public class GroceryItems {
public static void main(String[]args) {
    String[]store = {"Juice" , "Milk" , "Chips" , "Tea" , "Coffee" } ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Isaack Grocery's");
    System.out.println("What can I help you find?");
    String item = sc.nextLine();
    /*
     * above i have created my array then implemented my scanner
     * after that i made some print statements then i created a variable called item
     *  then i made it equal sc which is for user input
     */
    boolean user = (false);
    // created a boolean variable
    for(int i = 0; i < store.length; i++) {
    if(store[i].toLowerCase().equals(item.toLowerCase())) {
        System.out.println("If you are looking for:  " + store[i] );
        System.out.println("We have that in aisle : " + i);
    }

/*
 * Above I created a loop so that all options from my array come out
 * them i created a if statement where if my array equals user input
 *  they get two print statements one verifying what they are looking for
 *   then next one telling them the location of the item
 */


        }
if(user = (false)) {
    System.out.println("Sorry we don't sell that item.");
    }
  // here I made a if statement where if the variable equals false
// then i have a print statement
}
}