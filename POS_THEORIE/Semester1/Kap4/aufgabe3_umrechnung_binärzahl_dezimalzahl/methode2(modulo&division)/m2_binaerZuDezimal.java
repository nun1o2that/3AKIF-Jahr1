import java.util.Scanner;

public class m2_binaerZuDezimal {
	
	public static void main ( String[] args ) {

		//binaer zu dezimal
        //eingabe in long
        //mit modulo und division


				long zahl;
				long ergebnis = 0;

				int zahlLaenge;
				int modulo;
				int condition1 = 0;
				int condition2;

				Scanner eingabe = new Scanner(System.in);


		System.out.print("Binaerzahl eingeben: ");
		    zahl = eingabe.nextLong();

		zahlLaenge = (int)(Math.log10(zahl) + 1);
		condition2 = zahlLaenge;
		zahlLaenge = 0;


				while (condition1 < condition2) {

						modulo = (int)(zahl % 2);
						zahl = zahl / 10;

						ergebnis = ergebnis + (int)( modulo * (Math.pow(2, zahlLaenge)) );

						zahlLaenge = zahlLaenge + 1;
						condition2 = condition2 - 1;
				}


		System.out.println("Dezimalzahl: " + ergebnis);
	}
}