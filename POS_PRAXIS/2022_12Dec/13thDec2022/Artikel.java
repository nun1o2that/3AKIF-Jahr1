public class Artikel {

    int artikelpreis;
    String artikelname;


    public Artikel(int preis, String name) {
        artikelpreis = preis;
        artikelname = name;
    }

    public int getPreis() {
        return artikelpreis;
    }

    public String getName() {
        return artikelname;
    }

    public double getPreisMitMWST() {
        return artikelpreis * 1.2;
    }

    public void setPreis(int neuerpreis) {
        if (neuerpreis > 0 && neuerpreis < 9999999) {
        artikelpreis = neuerpreis;
        }
    }

    public void setName(String neuername) {
        if (neuername.length() >= 3) {  //name muss mindestens 3 zeichen lang sein
        artikelname = neuername;
        }        
        else {
            System.out.println("Fehler! Name muss mindestens 3 Zeichen lang sein.");
        }
    }

}