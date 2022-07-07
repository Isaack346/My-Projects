
public class Objects {
public static void main(String[]args) {
	Car Bmw = new Car();
	Bmw.make="Bmw";
	Bmw.price =  30000;
	Bmw.year = 2017;
	Bmw.color = "Black";
	Car dodge = new Car();
	dodge.make= "dodge";
	dodge.price= 5000;
	dodge.year= 2007;
	dodge.color= "blue";
	System.out.println("This " + Bmw.make + " is worth $" + Bmw.price + " . It was built in " + Bmw.year + " It is " + Bmw.color + ".\n" );
	
}
}
