import java.util.Scanner;

public class a2_potenzEinerZahl {

    public static void main ( String[] args ) {

        //eingabe von x (gleitpunkt) und n(integer)
        //eingabe negatives n: anwender informieren, dass n positiv sein muss
        //x^n


                int n;
                int counter = 0;

                double x;
                double ergebnisMathPow;            //ergebnis mit Math.pow()
                double ergebnisLoop = 1.0 ;        //ergebnis mit Schleife // gotcha got me :(

                Scanner eingabe = new Scanner(System.in);

            
        System.out.println("\n" + "---------------------------------------------------");
        System.out.println("             Potenz einer Zahl x^n");
        System.out.println("---------------------------------------------------");


            do {

                System.out.print("Geben Sie x (Gleitpunktzahl) ein: ");
                    x = eingabe.nextDouble();

                System.out.print("Geben Sie n (Ganzzahl) ein: ");
                    n = eingabe.nextInt();

                if (n < 0) {
                    System.out.println("\n" + "n muss ein positiver Integer sein. Try again!");
                }
    
            System.out.println("\n" + "---------------------------------------------------");

            } while (n < 0);

            ergebnisMathPow = Math.pow(x, n);



            while (counter < n) {

                ergebnisLoop = ergebnisLoop * x;    //ergebnisLoop mit 1.0 initialisiert
                counter = counter + 1;              //und per iteration einmal mit x multipliziert
                            
            }


        System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Ergebnis [mit Math.pow()]: " + ergebnisMathPow);
        System.out.println("Ergebnis [mit Loop]: " + ergebnisLoop);

    }

}