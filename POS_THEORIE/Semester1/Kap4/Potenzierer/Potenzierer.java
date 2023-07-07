import java.util.Scanner;

public class Potenzierer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Bitte Basis b eingeben:");
		int b = scan.nextInt();

		if (b < 1) {
			System.out.println("Falsche Eingabe");
		} else {
			System.out.println("Bitte Exponent n eingeben:");
			int n = scan.nextInt();
			int e = 1;
			while (n > 0) {
				e = e * b;
				n = n - 1;
			}
			System.out.println("Ergebnis: " + e);
		}
		
		scan.close();
	}

}
