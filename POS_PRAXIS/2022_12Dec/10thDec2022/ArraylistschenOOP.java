import java.util.Scanner;
import java.util.Random;

public class ArraylistschenOOP {

    private int[] zahlen;
    private String[] buchstaben;
    public Scanner scan = new Scanner(System.in);
    private Random rand = new Random();


    //ZAHLEN-ARRAY-METHODEN
    public void zahlenErstellen() {
        int userInput;

        System.out.println("\n" + "ZAHLENERSTELLEN");
        System.out.println("Wie viele Zahlen soll das Array speichern?");
            userInput = scan.nextInt();
        zahlen = new int[userInput]; //SPEICHERPLATZ fuer array reservieren
    }

    public void zahlenFuellen() {
        int userInput;

        System.out.println("\n" + "ZAHLENFUELLEN");
        System.out.println("Zufallszahlen Obergrenze?");
            userInput = scan.nextInt();
        for(int i = 0;i < zahlen.length;i++) {
            zahlen[i] = rand.nextInt(userInput) + 1;
        }
    }

    public void zahlenAusgeben() {
        System.out.println("\n" + "ZAHLENAUSGEBEN");
        for(int i : zahlen) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }


    //STRING-ARRAY-METHODEN
    public void buchstabenErstellen() {
        int userInput;

        System.out.println("\n" + "BUCHSTABENERSTELLEN");
        System.out.println("Wie viele Buchstaben soll das Array speichern?");
            userInput = scan.nextInt();
        buchstaben = new String[userInput]; //SPEICHERPLATZ fuer array reservieren

    }

    public void buchstabenFuellen() {
        System.out.println("\n" + "BUCHSTABENFUELLEN");
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < buchstaben.length; i++) {
            buchstaben[i] = Character.toString(letters.charAt(rand.nextInt(26)));
        }
        System.out.println("Gefuellt...");
    }

    public void buchstabenAusgeben() {
        System.out.println("\n" + "BUCHSTABENAUSGEBEN");
        for(String i : buchstaben) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

}