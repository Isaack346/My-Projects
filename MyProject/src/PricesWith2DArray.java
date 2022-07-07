import java.util.Arrays;
import java.util.Scanner;
public class PricesWith2DArray {
public static void main(String[]args) {
	double[] [] prices = { {12.99 , 8.99 , 9.99 , 10.49 , 11.99},
			{0.99 , 1.99 , 2.49 , 1.49 , 2.99},
			{9.99 , 7.99 , 9.49 , 9.99 , 10.99}
			/**
			 * Above is my 2D array listing the prices
			 * of some items 
			 */
	                     
};
	System.out.println("Baking: " + Arrays.toString(prices[0]));
	System.out.println("Beverages: " + Arrays.toString(prices[1]));
	System.out.println("Cerals: " + Arrays.toString(prices[2]));
	/**
	 * Above is a print statement
	 * that says the goods name then i print out the array 
	 */
}
}