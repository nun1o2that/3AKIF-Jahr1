// eingabe ausgabe feld ? ?  ! !

import java.util.Scanner;


//public hilft, wenn mehrere classes vorhanden sind
public class Main{
	public static void main ( String[] args ){
	
	System.out.println("hihi");
	// eingabe mit SCANNER
	Scanner myScanName = new Scanner(System.in); //so ein fehler - muss noch importiert werden;;
	//imports immer ganz oben - "java API doc scanner"
	
	int zahl = myScanName.nextInt(); //damit lesen wir nur eine zahl
	String text = myScanName.next();
	
	
	System.out.println("\n" + "	deine zahl: " + zahl);
	System.out.println("	dein text: " + text);
	}
}