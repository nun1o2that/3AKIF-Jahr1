public class Aufgabe1_plaetzchen {

    String sorte;   //instanzvariablen = ATTRIBUTES
    String groesse;
    String form;


    public void ausgabe(){
        System.out.println("Sorte " + sorte + ", Groesse " + groesse + ", Form " + form);
    }


    public static void main ( String[] args ) {

        Aufgabe1_plaetzchen Plaetzchen1 = new Aufgabe1_plaetzchen();
            Plaetzchen1.sorte = "Kokos";
            Plaetzchen1.form = "rund";
            Plaetzchen1.groesse = "mittel";
                Plaetzchen1.ausgabe();

    
        Aufgabe1_plaetzchen Plaetzchen2 = new Aufgabe1_plaetzchen();
            Plaetzchen2.sorte = "Affennuss";
            Plaetzchen2.form = "rund";
            Plaetzchen2.groesse = "rund";
                Plaetzchen2.ausgabe();

        Aufgabe1_plaetzchen Plaetzchen3 = new Aufgabe1_plaetzchen();
            Plaetzchen3.sorte = "Honigkuchen";
            Plaetzchen3.form = "gross";
            Plaetzchen3.groesse = "rechteckig";
                Plaetzchen3.ausgabe();
                
    }

}