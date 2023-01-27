import java.util.Scanner;

public class gailer16_aufgabe3 {
	public static void main(String[] args) {

		//programm berechnet standardabweichung for eine reihe von gleitpunktzahlen
		//anwender gibt an wie viele zahlen N
		//programm fordert gleitpunktzahlen an und liest nacheinander ein

		//SD = Math.sqrt( durchschnittQ - durchschnitt^2)
		
		//durchschnitt ist durchschnitt der zahlen N und durchschnitt^2 ist quadrat des durchschnitts

		//durchschnittQ ist durchschnitt von Xi * Xi  /  = durchschnitt der quadrierten werde aller gleitpunktzahlen


				int zaehler = 1;

				double N;
                double zahl;
				double durchschnitt = 0;
				double durchschnittQ = 0;
				double Standardabweichung;

                Scanner eingabe = new Scanner (System.in);


		System.out.println("\n" + "------------------------------------");
		System.out.println("      	 Standardabweichung");
		System.out.println("------------------------------------" + "\n");

        System.out.print("Wie viele Gleitpunktzahlen willst du berechnen? ");
            N = eingabe.nextDouble();


                    while (zaehler <= N) {
                        System.out.print("\n" + zaehler + ". Zahl eingeben: ");
                            zahl = eingabe.nextDouble();

                        durchschnitt = durchschnitt + zahl;
                        durchschnittQ = durchschnittQ + (Math.pow(zahl, 2));
                        
                        zaehler = zaehler + 1;
                    }
            

                    durchschnitt = durchschnitt / N;           
                    durchschnittQ = durchschnittQ / N;
                
                Standardabweichung = Math.sqrt(durchschnittQ - (Math.pow(durchschnitt, 2)) );


                System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Die Standardabweichung betraegt: " + Standardabweichung);
        
        }
}