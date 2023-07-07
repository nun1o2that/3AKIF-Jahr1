import java.util.*;

public class Liste {

    private ArrayList<Auto> autoDatenBank;


    public Liste() {
        autoDatenBank = new ArrayList<Auto>();
    }


    public void autoAnlegen() {
        Auto a1 = new Auto();
        a1.eingabe();
         autoDatenBank.add(a1);
    }


    public void autoLoeschen() {
        int userInt;
        int dbLaenge = autoDatenBank.size();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Welches Auto (welche ID) loeschen? ");
                userInt = scan.nextInt();    
            if(userInt >= dbLaenge || userInt < 0) {
                System.out.println("Ungueltige ID! Zahl zwischen (inkl.) 0 und " + dbLaenge + "!" + "\n");
            }
        } while(userInt >= dbLaenge || userInt < 0);

        autoDatenBank.remove(userInt);
    }


    public void listeAusgeben() {
        int index = 0;

        for(Auto i : autoDatenBank) {
            System.out.print("ID " + index + ": " + i.getMarke() + ", " + i.getTyp() + ", " + i.getFarbe() + ", " + i.getOwner().getName() + ", " + i.getOwner().getStrasse() + ", " + i.getOwner().getPLZ() + ", " + i.getOwner().getOrt());
            System.out.println();
            index++;
        }
        
    }


    public int listenLaenge() {
        return autoDatenBank.size();
    }


    public void markeSuchen() {
        int index = 0;
        String userString;
        String markeWert;
        Scanner scan = new Scanner(System.in);
        boolean notFound = true;

        System.out.print("Wie heisst die Marke, nach der Sie suchen? ");
        userString = scan.next().toLowerCase();     //lowercase damit nicht case-sensible
        System.out.println();

        //fuer jedes auto in der datenbank. mach...
        for(Auto i : autoDatenBank) {

            //sonst if() klammer unten zu kompliziert
            markeWert = i.getMarke().toLowerCase();     //lowercase damit nicht case-sensible
            //auch moeglich: string.EQUALSIGNORECASE()

            if(markeWert.equals(userString)) {
                System.out.print("ID " + index + ": " + markeWert + ", " + i.getTyp() + ", " + i.getFarbe() + ", " + i.getOwner().getName() + ", " + i.getOwner().getStrasse() + ", " + i.getOwner().getPLZ() + ", " + i.getOwner().getOrt());
                System.out.println();
                notFound = false;
            }

            index++;
        }

        if(notFound) {
            System.out.println("Ein Auto der Marke '" + userString + "' gibt es in dieser Liste nicht!");
        }
    }

}