import java.util.Scanner;

public class m1_binaerZuDezimal {

	public static void main ( String[] args ) {
		
	    //1111 = 1*2^3 + 1*2^2 + 1*2^1 +
		

				String zahl;
				
				char ziffer;
				int zifferZahl;
				int zahlLaenge;
				int condition;
				int digit = 0;
				int ergebnis = 0;
				
				Scanner eingabe = new Scanner(System.in);
		
		
		System.out.print("Binaerzahl eingeben: ");
		    zahl = eingabe.next();
		
		zahlLaenge = zahl.length();
		condition = zahlLaenge - 1;
		
				while (condition >= 0 ) {
						// System.out.println("condition: " + condition);
					ziffer = zahl.charAt(digit);
						// System.out.println("ziffer: " + ziffer);
					zifferZahl = Character.getNumericValue(ziffer);
						// System.out.println("zifferzahl" + zifferZahl);
					
					ergebnis = ergebnis + ( zifferZahl * (int)(Math.pow(2, condition)));
						// System.out.println(ergebnis + "\n");
					condition = condition - 1;
					digit = digit + 1;
				}
		
		System.out.println("Dezimalzahl: " + ergebnis);
	}
}