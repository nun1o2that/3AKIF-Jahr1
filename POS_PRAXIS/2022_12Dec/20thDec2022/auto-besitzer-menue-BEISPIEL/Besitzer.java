import java.util.Scanner;

public class Besitzer {

    private String name;
    private String strasse;
    private String plz;
    private String ort;

    public Besitzer() {
        name = "";
        strasse = "";
        plz = "";
        ort = "";
    }

    public void eingabe() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Wie heisst der Besitzer? ");
            this.name = scan.nextLine();
        System.out.print("Wie heisst seine Strasse? ");
            this.strasse = scan.nextLine();
        System.out.print("Wie heisst sein PLZ? ");
            this.plz = scan.nextLine();
        System.out.print("Wie heisst der Ort? ");
            this.ort = scan.nextLine();
    }

    public String getName() {
        return this.name;
    }

    public String getStrasse() {
        return this.strasse;
    }

    public String getPLZ() {
        return this.plz;
    }

    public String getOrt() {
        return this.ort;
    }

}