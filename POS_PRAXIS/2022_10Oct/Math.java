import java.util.Scanner;
import java.lang.Math;

public class Math{

	public static void main ( String[] args ){
	
				double wert;
				double wertQuadrat;


		Scanner myScanner = new Scanner(System.in);

		System.out.println("quadratrechnung");
		System.out.print("geben sie eine zahl ein:");
			wert = myScanner.nextInt();

		wertQuadrat = Math.pow(wert, 2);

		System.out.println("ihr quadrat betraegt: " + wertQuadrat);
	}
}