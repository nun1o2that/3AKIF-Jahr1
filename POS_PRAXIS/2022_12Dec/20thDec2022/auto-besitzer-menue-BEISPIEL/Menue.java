import java.util.Scanner;

public class Menue {

    
    public static void menue() {
        System.out.println("\n" + "---------------------------");
        System.out.println("    1 - Auto hinzufuegen");
        System.out.println("    2 - Auto loeschen");
        System.out.println("    3 - Liste ausgeben");
        System.out.println("    4 - Laenge der Liste anzeigen ");
        System.out.println("    5 - Eintrag nach Marke suchen ");
        System.out.println("    6 - Ende");
        System.out.println("---------------------------");
        System.out.print("Welche Option? ");
    }


    public static void main ( String[] args ) {

            int userInt;
            Scanner scan = new Scanner(System.in);

            Liste myList;
            myList = new Liste();

        do {

            menue();
                userInt = scan.nextInt();
            System.out.println("\n");
            
            if (userInt == 1) {
                myList.autoAnlegen();
            }
            else if (userInt == 2) {
                myList.autoLoeschen();
            }
            else if(userInt == 3) {
                myList.listeAusgeben();
            }
            else if(userInt == 4) {
                System.out.print("Die Liste ist " + myList.listenLaenge() + " Stelle");
                if(myList.listenLaenge() > 1) {
                    System.out.print("n");
                }
                System.out.println(" lang.");
            }
            else if(userInt == 5) {
                myList.markeSuchen();
            }

        } while (userInt != 6);

        System.out.println("\n" + "Auf Wiedersehen!");

    }

}