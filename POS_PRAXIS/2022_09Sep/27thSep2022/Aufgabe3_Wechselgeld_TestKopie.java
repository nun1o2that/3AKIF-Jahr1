import java.util.Scanner;

public class Aufgabe3_Wechselgeld_TestKopie{
	
	public static void main( String[] args ){

			int centWert;
			int rest;
			
			int dollarZiffer;
			int quarterZiffer;
			int dimeZiffer;
			int nickelZiffer;
	//wenn in einem geschaeft
	//Dollar -> Quarter (25Cent) -> Dime (10Cent) -> Nickel (5Cent) -> Cent

	System.out.println("-----------------------------------------------------------");
	System.out.println("Berechnung: Cent zu Dollar, Quarter, Dime, Nickel und Cent!");
	System.out.println("-----------------------------------------------------------");
	System.out.println("\n" + "Bitte geben Sie Ihren Centwert ein:");

	Scanner centEingabe = new Scanner(System.in);
	centWert = centEingabe.nextInt();
		
	//eg centWert 163
	dollarZiffer = centWert / 100;
		rest = centWert % 100;
	
	quarterZiffer = rest / 25;
		rest = dimeZiffer % 25;
		
	dimeZiffer = rest / 10;
		rest = nickelZiffer % 10;

	nickelZiffer = rest / 5;
		rest = nickelZiffer % 5;
		
		// System.out.println(dollarZiffer);
		// System.out.println(quarterZiffer);
		// System.out.println(dimeZiffer);
		// System.out.println(nickelZiffer);
		// System.out.println(centZiffer);

	System.out.println("\n" + "	Ihr Wert betraegt " + dollarZiffer + " Dollar, " + quarterZiffer + " Quarter, " + dimeZiffer + " Dime, " + nickelZiffer + " Nickel und " + rest + " Cent.");
  }
}