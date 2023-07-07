import java.util.Scanner;

public class Aufgabe1_Kreisflaeche{
	
	public static void main( String[] args ){
	
	//Kreisflaeche Formel: radius * radius * PI   - Math.PI()
	// Radius-Int-Wert ueber Tastatureingabe
	
	System.out.println("-----------------");
	System.out.println("Radiusberechnung!");
	System.out.println("-----------------");
	System.out.println("\n" + "Bitte geben Sie Ihren Radiuswert ein:");
	
		Scanner radiusEingabe = new Scanner(System.in);
		int radiusWert = radiusEingabe.nextInt();
		
		System.out.println("\n" + "	Ihr Wert betraegt: " + radiusWert);


	double kreisFlaeche = radiusWert * radiusWert * Math.PI;
	
	System.out.println("	Die Flaeche des Kreises mit einem Radius von " + radiusWert + " betraegt: " + kreisFlaeche);
	}
}