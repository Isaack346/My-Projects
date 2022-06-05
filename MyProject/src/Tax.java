import java.util.Arrays;
import java.util.Scanner;
public class Tax {
public static void main(String[] args) {
double[]price = {1.99 , 2.99 , 3.99 , 4.99};
System.out.println("The original prices are: " + Arrays.toString(price));
price[0] = 1.99 * 1.13;
price[1] = 2.99 * 1.13;
price[2] = 3.99 * 1.13;
price[3] = 4.99 * 1.13;
System.out.println("The after tax prices are: " + Arrays.toString(price));
/**
 * Above I created my array first which I named as price
 * Then I proceeded to create a print statement saying what the original price of the items were
 * Next I updated each element in my array with a 1.13 percent increase
 * Lastly I printed out the price of the items after tax
 */

}

    }