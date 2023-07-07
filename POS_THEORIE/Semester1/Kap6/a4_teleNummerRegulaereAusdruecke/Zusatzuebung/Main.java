import java.util.Scanner;

public class Main {

    private static Datenbank teleDatenBank = new Datenbank();

    /**
    * Menue Ausgabe
    */
    public static void menue() {
        int userInt;
        Scanner scan = new Scanner(System.in);

        System.out.println();
        teleDatenBank.arrayAnzeigen();

        do {

            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("  1 - Suchen (nach Land)");
            System.out.println("  2 - Suchen (nach Vorwahl)");
            System.out.println("  3 - Beenden");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.print("Welche Option? ");
                userInt = scan.nextInt();
            System.out.println();

            if(userInt <= 0 || userInt > 3) {
                System.out.println("\n" + "Falsche Eingabe! Nochmal versuchen!");
            }
            else if(userInt == 1 | userInt == 2) {
                teleDatenBank.arraySuche(userInt);
            }


        } while(userInt != 3);

    } 

    public static void main ( String[] args ) {

        System.out.println();
        teleDatenBank.arrayErstellen();
        teleDatenBank.arrayFuellen();

        menue();

    }

}