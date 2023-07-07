import java.util.Scanner;

public class Aufgabe2_equals {
    
    public static void main ( String[] args ) {

        //5 integer eingeben, schleife
        //Stringvariable antwort 
            //--> "ja"
            //equals() --> ist der vom anwender eingegebene String aequivalent zu dem String auf den atnwort verweist
        //Boolean prompt: true oder false, je nach eingabe des anwenders
            //--> ja = eingabeaufforderungen, nein == keine eingabeaufforderungen

            int input;
            int zaehler = 1;
            int summe = 0;
            String antwort = "ja";
            String userantwort;
            Boolean prompt;
            Scanner scan = new Scanner(System.in);

        System.out.println("\n" + "Zahleneingabe");
        System.out.println("-----------------------------");

        System.out.println("Eingabeaufforderung <ja> oder <nein>?");
        userantwort = scan.next();

        if (userantwort.equals("ja")) {
            prompt = true;
        }
        else {
            prompt = false;
        }   

        if (userantwort == antwort) {
            System.out.println("userantwort == antwort : true");
        }
        else {
            System.out.println("userantwort == antwort : false");
        }

        if (userantwort.equals(antwort)) {
            System.out.println("userantwort.equals(antwort) : true");
        }
        else {
            System.out.println("userantwort == antwort : false");
        }

        do {

            if (prompt == true) {
                System.out.print("Geben Sie die " + zaehler + ". Zahl ein: ");
            }
            
            input = scan.nextInt();
            summe += input;
            zaehler++;

        } while (zaehler <= 5);

        System.out.println("-----------------------------");    
        System.out.println("Summe: " + summe);

    }
}