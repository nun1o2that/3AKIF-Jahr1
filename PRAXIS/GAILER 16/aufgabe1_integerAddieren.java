import java.util.Scanner;

public class gailer16_aufgabe1 {

    public static void main ( String[] args ) {

        //programm fragt, wie viele zahlen addiert werden sollen
        //danach fordert programm benutzer auf, zahlen nacheinander eingzugeben
        //ergebnis ausgabe


                int i;                  //schleifen"startwert"
                int integAnzahl;        //schleifen"endwert"
                
                int benutzerInteger;    //integer des benutzers        
                int summe;              //summe aller benutzer-integer
                
                Scanner eingabe = new Scanner(System.in);


        System.out.println("-----------------------------------------------------");
        System.out.println("                Integer Addieren");
        System.out.println("-----------------------------------------------------");

        System.out.print("\n" + "Wie viele Integer sollen addiert werden? "); 
                integAnzahl = eingabe.nextInt();

        System.out.println("\n" + "+++++++++++++++++++++++++++++++++++++++++++++++++++++");


                i = 0;
                summe = 0;

                while (integAnzahl > i) {                               //zaehlt wiefolgt: [i] faengt bei 0 an und wird bei jeder iteration um 1 ergaenzt
                    System.out.print("Geben Sie einen Integer ein:");   //dies passiert solange, bis der eingegebene [integAnzahl] wert erreicht wird
                        benutzerInteger = eingabe.nextInt();               
                        summe = summe + benutzerInteger;                //jede iteration ergaenzt die variable [summe] um den gerade eingegebenen [benutzerInteger]
                    i++;
                }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ihre Summe betraegt: " + summe);
        
    }
}