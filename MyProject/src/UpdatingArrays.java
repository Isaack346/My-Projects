import java.util.Arrays;
import java.util.Scanner;
public class UpdatingArrays {

	public static void main(String[] args) {
		String[]menu = {"Esprsso" , "Iced Coffee" , "Machhiato"};
		menu[2] = "Bagel";
		System.out.println(Arrays.toString(menu));
		String[] newMenu = new String[5];
		/**
		 * Above I created an String array
		 * Then I updated the second element to Bagel
		 * After I printed out the menu array using Arrays.toString
		 * Next I created another array called new menu with 5 element instead of 3 using new String[5]
		 * 
		 */
		
for( int i = 0; i<menu.length; i++) {
newMenu[i] = menu[i];
newMenu[3] = "Dark roast";
newMenu[4] = "French Vanialla";
System.out.println(Arrays.toString(newMenu));
}
		/**
		 * Above I created a for loop then
		 * i said newMenu[i] = menu[i] which now makes it so the first 3 elements of newMenu =
		 * menu
		 * After I updated my 3 and 4 element in the newMenu array
		 * SO that all 5 elements of new Menu have an element
		 * Last I printed out NewMenu
		 */
	}

}
