public class Charakter {

    private String name;
    private int lebenspunkte = 100;
    private boolean spezialfaehigkeitAktiv = false;

    public Charakter(String constrName) {
        name = constrName;
    }

    public void angreifen(Charakter gegner) {
        // i'm here i guess
    }

    public void regelnAusgeben() {
        // i'm here i guess
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int newLebenspunkte) {
        lebenspunkte = newLebenspunkte;
    }

    public void schadenNehmen(int punkte) {
        lebenspunkte -= punkte;
        System.out.println("\n\n++++++++++++++++++++++++++++++++++++");
        System.out.println(name + " nimmt " + punkte + " Punkte Schaden!");
        System.out.print("++++++++++++++++++++++++++++++++++++");
    }

    public void setSpezialfaehigkeit(boolean set) {
        spezialfaehigkeitAktiv = set;
    }

    public boolean istSpezialfaehigkeitAktiv() {
        return spezialfaehigkeitAktiv;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

}