import java.util.Scanner;

public class aufgabe2_dampfMaschinen{

    public static void main ( String[] args ) {

        //maximal moegliche effizienz einer dampfmaschine ist abhaengig von dampftemperatur im heizkessel und von aussentemperatur der luft

        // effizienz = 1 - tLuft / tDampf     (lufttemperatur / dampftemeratur)
        
        //temperaturen in kelvin angegeben
            //normale lufttemp ca 300grad kelvin / siedepunkt 373grad kelvin

        //programm fragt benutzer nach tLuft und tDampf
        //gibt maximal moegliche effizienz der dampfmaschine aus

        //wenn tDampf weniger als 373 betraegt -> es gibt keinen dampf -> effizienz betraegt 0

        //ganzzahl oder gleichpunkt, berechnungen aber mit gleichpunkt

                int luftTemp;
                int dampfTemp;

                double effizienzErgebnis;
                
                Scanner eingabe = new Scanner (System.in);

        System.out.println("\n" + "------------------------------------------");
        System.out.println("      Effizienz von Dampfmaschinen");
        System.out.println("------------------------------------------");


        System.out.print("\n" + "Geben Sie die Lufttemperatur ein (in Kelvin [300 = Raumtemperatur, 373 = Siedepunkt], Ganzzahlen): ");
            luftTemp = eingabe.nextInt();

        System.out.print("\n" + "Geben Sie die Dampftemperatur ein (in Kelvin [muss ueber 373 Grad Kelvin liegen!], Ganzzahlen): ");
            dampfTemp = eingabe.nextInt();

        
        effizienzErgebnis = (1 - luftTemp / (dampfTemp *1.0));

        System.out.println("\n" + "Rechnung");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Formel:" + "\n" + "Effizienz = 1 - Lufttemperatur / Dampftemperatur");
        System.out.println("------------------------");


        if (dampfTemp < 373) {
            System.out.println("Fehler! Dampftemperatur dark nicht unter 373 liegen.");
            effizienzErgebnis = 0; 
        }
        

        // else {
            System.out.println("Ihre Dampfmaschinen-Effizienz: " + effizienzErgebnis);
        // }



    }
}