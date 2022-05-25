import java.util.Scanner;
public class Converting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of feet.");
		double feet = sc.nextDouble();
		System.out.println(feet + " feet" + " is " + feet * 0.305 + " meters");
		System.out.println(feet + " feet" + " is " + feet * 12 + " inches");
/**
 * First i created a scanner
 * then i put a print statement that asked the user to enter the number of feet
 * after that  i declared the variable feet as a double and put it to = scanner so user can type out
 * the number of feet
 * Last i created print statements that shows the number of feet in meters and inches 
 */
	}

}
