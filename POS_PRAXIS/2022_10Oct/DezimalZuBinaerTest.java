import java.util.Scanner;

public class DezimalZuBinaerTest {

    public static void main ( String[] args ) {

        //dezimal zu binaer
        //division durch 2 bis quotient 0 ist
        //mit modulo und division ? ? ?

                int dezimalZahl;
                int division;
                int modulo;

                Scanner eingabe = new Scanner (System.in);
        

        System.out.print("Dezimalzahl: ");
            dezimalZahl = eingabe.nextInt();

        while (dezimalZahl > 0) {

            modulo = dezimalZahl % 2;
            division = dezimalZahl / 2;

        
                if (dezimalZahl >= 1000) {

                    
                    System.out.println(dezimalZahl + " : 2 = " + division + " Rest: " + modulo );
                }

                else if (dezimalZahl >= 100) {
                    System.out.println(dezimalZahl + "  : 2 = " + division + "  Rest: " + modulo );
                }

                else if (dezimalZahl >= 10) {
                    System.out.println(dezimalZahl + "   : 2 = " + division + "   Rest: " + modulo );
                }

                else {
                    System.out.println(dezimalZahl + "    : 2 = " + division + "    Rest: " + modulo );
                }


            dezimalZahl = dezimalZahl / 2;


        // System.out.println(dezimalZahl + " : 2 = " + division + "  Rest: " + modulo );

        }



    }
}