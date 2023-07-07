import java.util.Scanner;
import java.util.regex.*;

public class App {
    
    private static Arena game;

    public static Charakter spielerEingabe(int spielerZahl) {
        Scanner scan = new Scanner(System.in);
        String spielerName;
        String spielerTyp;
        boolean validChoice = false;
        int hoechstLaenge = 14;
        
        System.out.print("\n\n+++++++++++++++ Spieler " + spielerZahl + " +++++++++++++++");

        do {
            System.out.print("\nWie heisst dein Charakter? ");
                spielerName = scan.nextLine();
            if (spielerName.length() > hoechstLaenge) {
                System.out.println("Name zu lang! Hoechstens 14 Buchstaben!");
            }
        } while(spielerName.length() > hoechstLaenge);

        System.out.println("\nWelche Art von Charakter?");
        System.out.println("----------------------------");
        System.out.println("0 - Zwerg");
        System.out.println("1 - Drache");
        System.out.print("----------------------------");
        do {
            System.out.print("\nWahl treffen: ");
                spielerTyp = scan.nextLine();
            if (!Pattern.matches("-?[0-9]+", spielerTyp)) {
                System.out.println("Falsche Eingabe! Keine Buchstabeneingabe erlaubt!");
                continue;
            }
            else if (Integer.parseInt(spielerTyp) < 0 || Integer.parseInt(spielerTyp) > 1) {
                System.out.println("Falsche Eingabe! Nur [0] oder [1] moeglich!");
            }
            else {
                validChoice = true;
            }
        } while(!validChoice);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        switch(Integer.parseInt(spielerTyp)) {
            case 0: return new Zwerg(spielerName);
            default: return new Drache(spielerName);
        }
    }

    public static void main ( String[] args ) {
        
        System.out.println("\n\n         /------------------------------------\\");
        System.out.println("         |          WELCOMEEEEEEEEEE          |");
        System.out.println("         \\------------------------------------/");

        game = new Arena(spielerEingabe(1), spielerEingabe(2));
        game.charakterRegelnAusgeben();
        game.ersterFight();
        
        do {
            game.fight();
        } while(!game.istGameOver());

        System.out.println("\n\n         /--------------------------------\\");
        System.out.println("         |     Danke fuers Spielen :)     |");
        System.out.println("         \\--------------------------------/\n");

    }

}
