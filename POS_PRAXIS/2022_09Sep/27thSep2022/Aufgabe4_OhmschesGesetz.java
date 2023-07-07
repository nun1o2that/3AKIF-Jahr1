import java.util.Scanner;

public class Aufgabe4_OhmschesGesetz{
	
	public static void main( String[] args ){
	 
	//ohm'sches gesetz
	//zusammenhang zwischen stromstaerke und spannung 
	//stromstaerke I direkt proportional zur spannung U
	// I = U/R
	// I(Stromstaerke, Ampere), U(Spannung, Volt), R(Widerstand, Ohm) 

	//programm: fragt anwender nach spannung und widerstand eines geraetes
	//gibt stromstaerke aus : GLEITPUNKTDIVISION
	//trick: I = (U + 0.0)/R

	System.out.println("-----------------------");
	System.out.println("Stromstärke-Berechnung!");
	System.out.println("-----------------------");

	System.out.println("\n" + "Bitte geben Sie Ihren Spannungswert ein:");
	Scanner spannungEingabe = new Scanner(System.in);
	int spannungWert = spannungEingabe.nextInt();

	System.out.println("Bitte geben Sie Ihren Widerstandswert ein:");
	Scanner widerstandEingabe = new Scanner(System.in);
	int widerstandWert = widerstandEingabe.nextInt();

	System.out.println("\n" + "Formel: I = U/R");
	double stromstaerkeErgebnis = (spannungWert + 0.0) / widerstandWert; //gleitpunktdivision

	System.out.println("\n" + "	Ihre Stromstaerke betraegt " + stromstaerkeErgebnis + " Ampere.");
  }
}