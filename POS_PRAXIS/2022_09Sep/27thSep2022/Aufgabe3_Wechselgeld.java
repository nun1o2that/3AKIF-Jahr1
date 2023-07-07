import java.util.Scanner;

public class Aufgabe3_Wechselgeld{
	
	public static void main( String[] args ){

	//wenn in einem geschaeft
	//Dollar -> Quarter (25Cent) -> Dime (10Cent) -> Nickel (5Cent) -> Cent

	System.out.println("-----------------------------------------------------------");
	System.out.println("Berechnung: Cent zu Dollar, Quarter, Dime, Nickel und Cent!");
	System.out.println("-----------------------------------------------------------");
	System.out.println("\n" + "Bitte geben Sie Ihren Centwert ein:");

	Scanner centEingabe = new Scanner(System.in);
	int centWert = centEingabe.nextInt();

	//eg centWert 163
	int dollarZiffer = centWert / 100;
	int quarterZiffer = (centWert % 100) / 25;
	int dimeZiffer = ((centWert % 100) % 25) / 10;
	int nickelZiffer = (((centWert % 100) % 25) % 10) / 5;
	int centZiffer = centWert % 5;
		// System.out.println(dollarZiffer);
		// System.out.println(quarterZiffer);
		// System.out.println(dimeZiffer);
		// System.out.println(nickelZiffer);
		// System.out.println(centZiffer);

	System.out.println("\n" + "	Ihr Wert betraegt " + dollarZiffer + " Dollar, " + quarterZiffer + " Quarter, " + dimeZiffer + " Dime, " + nickelZiffer + " Nickel und " + centZiffer + " Cent.");
  }
}