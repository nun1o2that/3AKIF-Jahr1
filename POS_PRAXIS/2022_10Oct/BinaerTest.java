import java.util.Scanner;

public class BinaerTest {
	public static void main(String[] args) {
		
	    //1111 = 1*2^3 + 1*2^2 + 1*2^1 +
		
		String zahl = "1111";
		char ziffer;
		int zifferZahl;
		int zahlLaenge;
		int condition = 0;
		int ergebnis = 0;
		
		System.out.println("zahl: " + zahl);
		zahlLaenge = zahl.length();
		
		while (condition < zahlLaenge) {
		        System.out.println(condition);
		    ziffer = zahl.charAt(condition);
		        System.out.println(ziffer);
		    zifferZahl = Character.getNumericValue(ziffer);
		        System.out.println(zifferZahl);
		    
		    ergebnis = ergebnis + ( zifferZahl * (int)(Math.pow(2, condition)));
		        System.out.println(ergebnis + "\n");
		    condition = condition + 1;
		    
		}
		
		System.out.println("ergebnis: " + ergebnis);
	}
}