//weitere variable: verzierung

public class Aufgabe2_verzierung {

    String sorte;   //instanzvariablen = ATTRIBUTES
    String groesse;
    String form;
    Boolean istVerziert;


    public void ausgabe(int zaehler){
        System.out.print("Plaetzchen" + zaehler + ": Sorte " + sorte + ", Groesse " + groesse + ", Form " + form + ", Verzierung ");

        if (istVerziert == true) {
            System.out.println("ja");
        }

        else {
            System.out.println("nein");
        }
    }


    public static void main ( String[] args ) {

        Aufgabe2_verzierung Plaetzchen1 = new Aufgabe2_verzierung();
            Plaetzchen1.sorte = "Kokos";
            Plaetzchen1.form = "rund";
            Plaetzchen1.groesse = "mittel";
            Plaetzchen1.istVerziert = false;
                Plaetzchen1.ausgabe(1);

    
        Aufgabe2_verzierung Plaetzchen2 = new Aufgabe2_verzierung();
            Plaetzchen2.sorte = "Affennuss";
            Plaetzchen2.form = "rund";
            Plaetzchen2.groesse = "rund";
            Plaetzchen2.istVerziert = false;
                Plaetzchen2.ausgabe(2);

        Aufgabe2_verzierung Plaetzchen3 = new Aufgabe2_verzierung();
            Plaetzchen3.sorte = "Honigkuchen";
            Plaetzchen3.form = "gross";
            Plaetzchen3.groesse = "rechteckig";
            Plaetzchen3.istVerziert = true;
                Plaetzchen3.ausgabe(3);

        if (Plaetzchen1.form == Plaetzchen2.form) {
            System.out.println("\n" + "beide rund!");
        }
                
    }

}