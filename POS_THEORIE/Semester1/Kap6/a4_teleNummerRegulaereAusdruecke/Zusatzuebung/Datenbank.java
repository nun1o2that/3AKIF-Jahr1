import java.util.Scanner;

public class Datenbank {

    private Laender[] VorwahlenEuropa;

    /**
    * Methode zum Initialisieren des VorwahlenEuropa Arrays
    * haette auch ein Konstruktur sein koennen?
    */
    public void arrayErstellen() {
        VorwahlenEuropa = new Laender[53];
    }

    /**
    * Methode zum Fuellen des Arrays, jede Stelle nacheinander
    */
    public void arrayFuellen() {
        VorwahlenEuropa[0] = new Laender("Abchasien", "+7");
        VorwahlenEuropa[1] = new Laender("Albanien", "+355");
        VorwahlenEuropa[2] = new Laender("Andorra", "+376");
        VorwahlenEuropa[3] = new Laender("Belarus", "+375");
        VorwahlenEuropa[4] = new Laender("Belgien", "+32");
        VorwahlenEuropa[5] = new Laender("Bosn. & Herzeg.", "+387");
        VorwahlenEuropa[6] = new Laender("Bulgarien", "+359");
        VorwahlenEuropa[7] = new Laender("Daenemark", "+45");
        VorwahlenEuropa[8] = new Laender("Deutschland", "+49");
        VorwahlenEuropa[9] = new Laender("Estland", "+372");
        VorwahlenEuropa[10] = new Laender("Faeroer", "+298");
        VorwahlenEuropa[11] = new Laender("Finnland", "+358");
        VorwahlenEuropa[12] = new Laender("Frankreich", "+33");
        VorwahlenEuropa[13] = new Laender("Gibraltar", "+30");
        VorwahlenEuropa[14] = new Laender("Griechenland", "+44");
        VorwahlenEuropa[15] = new Laender("Irland", "+353");
        VorwahlenEuropa[16] = new Laender("Island", "+354");
        VorwahlenEuropa[17] = new Laender("Italien", "+39");
        VorwahlenEuropa[18] = new Laender("Kosovo", "+383");
        VorwahlenEuropa[19] = new Laender("Kroatien", "+385");
        VorwahlenEuropa[20] = new Laender("Lettland", "+371");
        VorwahlenEuropa[21] = new Laender("Liechtenstein", "+423");
        VorwahlenEuropa[22] = new Laender("Litauen", "+370");
        VorwahlenEuropa[23] = new Laender("Luxemburg", "+352");
        VorwahlenEuropa[24] = new Laender("Malta", "+356");
        VorwahlenEuropa[25] = new Laender("Mazedonien", "+389");
        VorwahlenEuropa[26] = new Laender("Moldawien", "+373");
        VorwahlenEuropa[27] = new Laender("Monaco", "+3777");
        VorwahlenEuropa[28] = new Laender("Montenegro", "+382");
        VorwahlenEuropa[29] = new Laender("Niederlande", "+31");
        VorwahlenEuropa[30] = new Laender("Norwegen", "+47");
        VorwahlenEuropa[31] = new Laender("Oesterreich", "+43");
        VorwahlenEuropa[32] = new Laender("Polen", "+48");
        VorwahlenEuropa[33] = new Laender("Portugal", "+351");
        VorwahlenEuropa[34] = new Laender("Rumaenien", "+40");
        VorwahlenEuropa[35] = new Laender("San Marino", "+378");
        VorwahlenEuropa[36] = new Laender("Schweden", "+46");
        VorwahlenEuropa[37] = new Laender("Schweiz", "+41");
        VorwahlenEuropa[38] = new Laender("Serbien", "+381");
        VorwahlenEuropa[39] = new Laender("Slowakei", "+421");
        VorwahlenEuropa[40] = new Laender("Slowenien", "+386");
        VorwahlenEuropa[41] = new Laender("Spanien", "+34");
        VorwahlenEuropa[42] = new Laender("Suedossetien", "+7");
        VorwahlenEuropa[43] = new Laender("Tschechien", "+420");
        VorwahlenEuropa[44] = new Laender("Turk. R. Nordzypern", "+90");
        VorwahlenEuropa[45] = new Laender("Ukraine", "+380");
        VorwahlenEuropa[46] = new Laender("Ungarn", "+36");
        VorwahlenEuropa[47] = new Laender("Vatikanstadt", "+379");
        VorwahlenEuropa[48] = new Laender("Vereinigtes Koenigreich", "+44");
        VorwahlenEuropa[49] = new Laender("Weissrussland", "+375");
        VorwahlenEuropa[50] = new Laender("Grossbritannien", "+44");
        VorwahlenEuropa[51] = new Laender("Isle of Man", "+44");
        VorwahlenEuropa[52] = new Laender("Kanalinseln", "+44");
    }

    /**
    * Anzeigen des ganze Arrays bei jeder Wiederholung des Menues
    */
    public void arrayAnzeigen() {
        int i = 0;
        
        while(i < VorwahlenEuropa.length) {

            int hilfs = 0;

            while(hilfs < 3 && i < VorwahlenEuropa.length) {
                VorwahlenEuropa[i].laenderAnzeige(1);
                hilfs++;
                i++;
            }
                System.out.println();
            
        }
    }

    /**
    * Suche durch das Array nach dem eingegebenen Wert (String userString)
    * @param eingabe: in Main nach dem Menue mitgegeben
    * eingabe == 1: es wird nach Laendern gesucht
    * eingabe == 2: es wird nach Vorwahlen gesucht
    */
    public void arraySuche(int eingabe) {
        String userString;
        String hilfs;
        int index = 0;
        boolean gefunden = false;
        Scanner scan = new Scanner(System.in);

        if(eingabe == 1) {
            System.out.print("Welches Land? ");
                userString = scan.nextLine().toLowerCase();
            System.out.println();

            for(Laender i : VorwahlenEuropa) {
                hilfs = VorwahlenEuropa[index].getName().toLowerCase();

                if(hilfs.contains(userString)) {
                    VorwahlenEuropa[index].laenderAnzeige(2);
                    gefunden = true;
                }
                index++;
            }
        }
        else {
            System.out.print("Welche Vorwahl? ");
                userString = scan.nextLine();
            System.out.println();
            
            for(Laender i : VorwahlenEuropa) {
                hilfs = VorwahlenEuropa[index].getVorwahl();

                // System.out.println("userString: " + userString + ", hilfs: " + hilfs);

                if(hilfs.contains(userString)) {
                    VorwahlenEuropa[index].laenderAnzeige(2);
                    gefunden = true;
                }
                index++;
            }
        }

        if(!gefunden) {
            System.out.println("Solch einen Eintrag gibt es nicht.");
        }
    }

}
