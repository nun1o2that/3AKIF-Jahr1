import java.util.Scanner;

public class Rabattberechnung {

    public static void main ( String[] args ) {


                int KN;       //kundenNummer                
                double JU;    //jahresUmsatz
                double Rabatt;

                String frage; // J / N

                Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "---------------------------------------");
        System.out.println("        Rabattberechnung");
        System.out.println("---------------------------------------");


                do {

                    System.out.print("\n" + "Geben Sie Ihre Kundennummer ein: ");
                        KN = eingabe.nextInt();

                    System.out.print("Geben Sie Ihren Jahresumsatz ein: ");
                        JU = eingabe.nextDouble();

                    System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                                if (JU > 10000) {
                                    Rabatt = JU * 0.03;
                                    System.out.println("Ihr Rabatt: 0.03");
                                }

                                else {
                                    Rabatt = JU * 0.02;
                                    System.out.println("Ihr Rabatt: 0.02");
                                }
            

                    
                    System.out.println("Ihr Endbetrag: " + (JU - Rabatt) );
                    System.out.println("Abgezogen wurden: " + Rabatt);

                    System.out.println("\n" + "---------------------------------------");
                    System.out.println("Wollen Sie weiter berechnen?");
                        frage = eingabe.next();


                } while ( frage.equals("J") || frage.equals("j") || frage.equals("Ja") || frage.equals("ja") || frage.equals("JA") );
    }
}