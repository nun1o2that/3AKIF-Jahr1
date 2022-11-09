import java.util.Scanner;

public class gailer16_aufgabe2 {
	public static void main(String[] args) {
		
		//summe = 1.0/1 + 1.0/2 + ... + 1.0/n

				int n;
				double summe = 0;
				
				Scanner eingabe = new Scanner(System.in);
		

		System.out.println("\n" + "---------------------------");
		System.out.println("      Summenberechnung");
		System.out.println("---------------------------");

		System.out.println("Rechnung: 1.0/1 + 1.0/2 + ... + 1.0/n");

		System.out.print("\n" + "n eingeben: ");
			n = eingabe.nextInt();
		
		while (n >= 1) {
		    summe = summe + 1.0/n;
		    n = n - 1;
		 }
		    
		    System.out.println("summe = " + summe);
	}
}