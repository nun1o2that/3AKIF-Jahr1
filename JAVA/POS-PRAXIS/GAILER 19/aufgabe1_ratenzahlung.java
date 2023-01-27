import java.util.Scanner;

public class a1_ratenzahlung {

    public static void main ( String[] args ) {

        //wir schulden kreditkartengesellschaft 1000$ 
        //gesellschaft berechnet monatlich 1.5% zinsen fuer gewaehrten kredit
        //wir benutzen kreditkarte nicht mehr und zahlen den kredit monatlich mit einem betrag n zurueck
        
        //program fragt nach monatlichen rueckzahlungsbetrag 
        //gibt saldo und gesamtbetrag der zahlungen fuer jeden monat aus
        //bis saldo null oder weniger

        //monatliche zinsen berechnen auf grund des saldos
        //neuen saldo berechnen, indem zinsen addieren und zurueckbezahlten betrag subtrahieren


                int monatZaehler = 1;

                double monatlicherBetrag;
                double gesamtBetrag = 0;
                double saldo = 1000; //dollar

                Scanner eingabe = new Scanner (System.in);


        System.out.println("Ratenzahlung");

        System.out.print("Geben Sie den monatlichen Betrag ein: ");
            monatlicherBetrag = eingabe.nextDouble();



        while (saldo > 0) {

            saldo = (saldo * 1.015) - monatlicherBetrag;
            gesamtBetrag += monatlicherBetrag;

            System.out.print("Monat " + monatZaehler + ":       ");
            System.out.print("Saldo: " + saldo + "       ");
            System.out.println("Gesamtbetrag: " + gesamtBetrag);

            monatZaehler++;
        }

    }
}