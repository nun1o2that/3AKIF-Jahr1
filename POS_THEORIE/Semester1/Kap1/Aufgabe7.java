import java.util.Scanner;

public class Aufgabe7{
	
	public static void main( String[] args ){
		
		int temperatur;
		double luftfeuchtigkeit;
		
		Scanner Eingabe = new Scanner(System.in);

		System.out.println("----------------------------------------------");
		System.out.println("		Lueftungsanlage");
		System.out.println("----------------------------------------------");
		
			System.out.print("\n" + " Geben Sie Ihre Temperatur ein (in Ganzzahlen)! ");
				temperatur = Eingabe.nextInt();
			System.out.print("\n" + " Geben Sie Ihre Luftfeuchtigkeit ein (Prozent, in Ganzzahlen!) ");
				luftfeuchtigkeit = Eingabe.nextInt();

		if (temperatur < 12){
			System.out.println("Die Lueftungsanlage wurde aktiviert!");
		}

		else if(temperatur < 50 && temperatur > 24){
			System.out.println("Die Lueftungsanlage wurde aktiviert!");
		}

		else if(luftfeuchtigkeit > 65){
			System.out.println("Die Lueftungsanlage wurde aktiviert!");
		}

		else{
			System.out.println("Die Lueftungsanlage wurde nicht aktiviert.");
		}


	}
}