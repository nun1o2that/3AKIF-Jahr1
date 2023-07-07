import java.util.Scanner;

public class Aufgabe2_CentZuDollar{
	
	public static void main( String[] args ){
	 
	//Cent zu Dollar Umrechnung
	//Zahl eingeben z.B.: 856 (Cent) -> 8 Dollar und 56 Cent#
	//Ganzzahlarithmetik verwenden

	System.out.println("---------------------------");
	System.out.println("Berechnung: Cent zu Dollar!");
	System.out.println("---------------------------");
	System.out.println("\n" + "Bitte geben Sie Ihren Centwert ein:");

	Scanner centEingabe = new Scanner(System.in);
	int centWert = centEingabe.nextInt();

	int dollarZiffer = centWert / 100;
	int centZiffern = centWert % 100;

	System.out.println("\n" + "	Ihr Wert betraegt " + dollarZiffer + " Dollar und " + centZiffern + " Cent");
  }
}