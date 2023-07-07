import java.util.Scanner;
import java.util.regex.*;
import java.util.concurrent.ThreadLocalRandom;

public class Arena {
    
    private Charakter kaempfer1;
    private Charakter kaempfer2;
    private Charakter gewinner;

    private int angreiferBestimmung;
    private int runde;

    private boolean gameOver = false;

    public Arena(Charakter constrKaempfer1, Charakter constrKaempfer2) {
        kaempfer1 = constrKaempfer1;
        kaempfer2 = constrKaempfer2;
        runde = 1;
    }

    public void ersterFight() {
        statusinformationenAusgeben();
        switch(ThreadLocalRandom.current().nextInt(0, 2)) {
            case 0: 
                kampfSimulieren(kaempfer1, kaempfer2);
                angreiferBestimmung = 1;
                break;
            case 1: 
                kampfSimulieren(kaempfer2, kaempfer1); 
                angreiferBestimmung = 0;
                break;
        }
    }

    public void fight() {
        if (kaempfer1.getLebenspunkte() <= 0 || kaempfer2.getLebenspunkte() <= 0) {
            gameOver = true;
            spielFertig();
        }
        else {
            runde++;
            statusinformationenAusgeben();

            if (runde % 2 == angreiferBestimmung) {
                kampfSimulieren(kaempfer1, kaempfer2);
            }
            else {
                kampfSimulieren(kaempfer2, kaempfer1);
            }
        }
    }

    public void kampfSimulieren(Charakter angreifer, Charakter opfer) {
        String wahl;
        boolean validChoice = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n***** Runde " + runde + ": " + angreifer.getName().toUpperCase() + " ist dran! *****");
        System.out.println("------------------------------------");
        System.out.println("Was machst du diese Runde?");
        System.out.println("1 - Angreifen");
        System.out.println("2 - Spezialfaehigkeit aktivieren");
        System.out.println("3 - Spezialfaehigkeit deaktivieren");
        System.out.print("------------------------------------");

        do {
            System.out.print("\nWahl treffen: ");
                wahl = scan.nextLine();
            if (!Pattern.matches("-?[0-9]+", wahl)) {
                System.out.println("Falsche Eingabe! Keine Buchstabeneingabe erlaubt!");
                continue;
            }
            else if (Integer.parseInt(wahl) < 1 || Integer.parseInt(wahl) > 3) {
                System.out.println("Falsche Eingabe! Nur [1], [2] und [3] moeglich!");
                continue;
            }

            if (wahl.equals("2") && angreifer.istSpezialfaehigkeitAktiv()) {
                System.out.println("Spezialfaehigkeit bereits aktiv!");
            }
            else if (wahl.equals("3") && !angreifer.istSpezialfaehigkeitAktiv()) {
                System.out.println("Spezialfaehigkeit ist schon inaktiv!");
            }
            else if (wahl.equals("2") && angreifer instanceof Zwerg && angreifer.getLebenspunkte() > 50) {
                System.out.println("Zwerge koennen ihre Spezialfaehigkeit nur unter 50 Lebenspunkten aktivieren!");
            }
            else {
                validChoice = true;
            }
        } while(!validChoice);
        
        switch(Integer.parseInt(wahl)) {
            case 1: angreifer.angreifen(opfer); break;
            case 2: angreifer.setSpezialfaehigkeit(true); break;
            case 3: angreifer.setSpezialfaehigkeit(false); break;
        }
    }

    public void charakterRegelnAusgeben() {
        System.out.println("\n\nCHARAKTER-ERKLAERUNGEN");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        if (kaempfer1.getClass() == kaempfer2.getClass()) {
            System.out.println("Ihr seid beide: " + kaempfer1.getClass().getSimpleName() + "\n");
            kaempfer1.regelnAusgeben();
        }
        else {
            kaempfer1.regelnAusgeben();
            System.out.println();
            kaempfer2.regelnAusgeben();
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void statusinformationenAusgeben() {
        String output = "";
        String temp1 = "";
        String temp2 = "";
        String stars = "*****";
        String spaces = " ";
        int spacelength = 0;
        int maxlength = 50;

        temp1 = stars + " " + kaempfer1.getName() + " " + stars;
        temp2 = stars + " " + kaempfer2.getName() + " " + stars;
        spacelength = maxlength - temp1.length() - temp2.length();
        output += "\n" +  temp1 + spaces.repeat(spacelength) + temp2 + "\n";

        temp1 = spaces.repeat(stars.length() / 2) + "Typ: " + kaempfer1.getClass().getSimpleName().toUpperCase();
        temp2 = spaces.repeat(stars.length() / 2) + "Typ: " + kaempfer2.getClass().getSimpleName().toUpperCase();
        spacelength = maxlength - temp1.length() - temp2.length();
        output += temp1 + spaces.repeat(spacelength) + temp2 + "\n";

        temp1 = spaces.repeat(stars.length() / 2) + "Lebenspunkte: " + kaempfer1.getLebenspunkte();
        temp2 = spaces.repeat(stars.length() / 2) + "Lebenspunkte: " + kaempfer2.getLebenspunkte();
        spacelength = maxlength - temp1.length() - temp2.length();
        output += temp1 + spaces.repeat(spacelength) + temp2 + "\n";

        temp1 = spaces.repeat(stars.length() / 2) + "Spezial aktiv: " + kaempfer1.istSpezialfaehigkeitAktiv();
        temp2 = spaces.repeat(stars.length() / 2) + "Spezial aktiv: " + kaempfer2.istSpezialfaehigkeitAktiv();
        spacelength = maxlength - temp1.length() - temp2.length();
        output += temp1 + spaces.repeat(spacelength) + temp2 + "\n";

        System.out.println("\n" + output);
    }

    public void spielFertig() {
        if (kaempfer1.getLebenspunkte() < 0) {
            gewinner = kaempfer2;
        }
        else {
            gewinner = kaempfer1;
        }

        System.out.println("\n\n\n" + "++++++++++++++++++++++++++++++++++++");
        System.out.println(gewinner.getName().toUpperCase() + " hat gewonnen!");
        System.out.println("Es wurde " + runde + " Runden lang gespielt.");
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }

    public boolean istGameOver() {
        return gameOver;
    }

}