import java.util.Scanner;

public class BinaerModuloTest {

    public static void main ( String[] args ) {

        //binaer zu dezimal
        //eingabe in long
        //mit modulo und division ? ? ?

                    long zahl2 = 10001010101L;
                    long ergebnis = 0;

                    int zahlLaenge;
                    int modulo;
                    int counter = 0;
                    int counter2;

                    Scanner eingabe = new Scanner(System.in);

    
        zahlLaenge = (int) (Math.log10(zahl2) + 1);

            System.out.println("\n" + "Zahllaenge = " + zahlLaenge);

        counter2 = zahlLaenge;

        zahlLaenge = 0;




        while (counter < counter2) {
            modulo = (int)(zahl2 % 2);
            zahl2 = zahl2 / 10;

            ergebnis = ergebnis + (int)( modulo * (Math.pow(2, zahlLaenge)) );

                System.out.println("\n" + modulo);
                System.out.println(zahl2);
                System.out.println(zahlLaenge);
                System.out.println(ergebnis);

            zahlLaenge = zahlLaenge + 1;
            counter2 = counter2 - 1;
        }

    }
}