import java.util.Arrays;

public class JavaAirlines {
	public static void main(String[]args) {
		Person.name = "Imoney";
		Person.dateofBirth = "01/12/2003";
		Person.nationality = "Ivorian Nightmare";
		Person.seatNumber = 12;
        Person.passport = new String[]{Person.name, Person.nationality, Person.dateofBirth};
        /**
         * Above In my main I said what the person name was , dateofBirth
         * and nationality manually
         * also the seat number then I extended the String to 3 and each element in the String
         * is either dateofbirth , name or  nationality
         */
		
		System.out.println(Person.name);
		System.out.println(Person.nationality);
		System.out.println(Person.dateofBirth);
		System.out.println(Arrays.toString(Person.passport));
		System.out.println(Person.seatNumber);
		/**
		 * Above are just print statement printing out the information
		 * that is above
		 */
	}

}
