import java.util.Scanner;

public class Auto {

    private String marke;
    private String typ;
    private String farbe;   
    private Besitzer Owner;

    public Auto() {
        marke = "";
        typ = "";
        farbe = "";
        Owner = new Besitzer();

    } 

    public void eingabe() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Was ist die Marke? ");
            this.marke = scan.next();
        System.out.print("Was ist der Typ? ");
            this.typ = scan.next();
        System.out.print("Was ist die Farbe? ");
            this.farbe = scan.next();
        System.out.println("---------------------------");
        
        Owner.eingabe();
    }

    public String getMarke() {
        return this.marke;
    }

    public String getTyp() {
        return this.typ;
    }

    public String getFarbe() {
        return this.farbe;
    }

    public Besitzer getOwner() {
        return this.Owner;
    }
    
}