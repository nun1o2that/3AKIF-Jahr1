import java.util.Scanner;

public class Aufgabe1_internetDelikatessen{

    public static void main ( String[] args ) {

        // programm, das bestellungen ueber ein internetformular entgegen nimmt
        // programm fragt welchen artikel kunde will, und wie viel dieses kostet
        // programm fragt, ob artikel der express geschickt werden soll
        
        // artikel unter $10 - versandkosten $2.00
        // artikel ueber oder gleich $10 - versandkosten $3.00
        // expresszuschlag - $5.00



                    String produkt;
                    double produktPreis;

                    double versandKosten;
                    String expressVersand;

                    double gesamtKosten;

                    Scanner eingabe = new Scanner(System.in);


        System.out.println("\n" + "----------------------------------");
        System.out.println(" Sam & Ellas Delikatessen-Versand");
        System.out.println("----------------------------------");


        System.out.print("\n" + "Welches Produkt wollen Sie kaufen? ");
            produkt = eingabe.next();

        System.out.print("Wie viel kostet dieses? ");
            produktPreis = eingabe.nextDouble();



        if (produktPreis >= 10) {
            versandKosten = 3;
        }                               // checkt, ob produktpreis groessergleich 10 ist
                                        
        else {                          // versandkosten sind dann entweder 3 oder 2 euro
            versandKosten = 2;
        }




        System.out.print("\n" +  "Wollen Sie einen Expressversand? (ja / nein) ");
            expressVersand = eingabe.next();


            if (expressVersand.equals("ja")) {
                System.out.println("\n" + "    Express: Sie Zahlen $5 mehr Versand.");
                versandKosten = versandKosten + 5;
            }

            else if (expressVersand.equals("nein")) {
                System.out.println("\n" + "    Kein Express: Ihr Versandkosten veraendern sich nicht.");
            }

            else {
                System.out.println("\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ihre Antwort ist ungueltig! Antworten Sie entweder mit ' ja ' oder ' nein '.");
                System.out.println("Try Again!");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                return;
            }


        gesamtKosten = produktPreis + versandKosten;

        System.out.println("\n" + "Rechnung");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ihr Produkt: " + produktPreis);
        System.out.println("Ihre Versandkosten:" + versandKosten);
        System.out.println("-----------------------");
        System.out.println("Gesamtkosten: " + gesamtKosten);


    }


}