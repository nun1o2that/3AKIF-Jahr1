import java.util.concurrent.ThreadLocalRandom;

public class Drache extends Charakter {
    
    public Drache(String constrName) {
        super(constrName);
    }

    public void angreifen(Charakter gegner) {
        int minSchaden = 20;
        int maxSchaden = 25;

        int schaden = ThreadLocalRandom.current().nextInt(minSchaden, maxSchaden + 1);

        if (this.istSpezialfaehigkeitAktiv()) {
            schaden -= ThreadLocalRandom.current().nextInt(5, 10 + 1);
        }

        gegner.schadenNehmen(schaden);
    }

    public void setSpezialfaehigkeit(boolean set) {
        super.setSpezialfaehigkeit(set);
        if (set == true) {
            this.setLebenspunkte(this.getLebenspunkte() + 10);
        }
        else {
            this.setLebenspunkte(this.getLebenspunkte() - 10);
        }
    }

    public void regelnAusgeben() {
        System.out.println("Als Drache hast du 100 Lebenspunkte.");
        System.out.println("Du machst zwischen 20 und 25 Schaden Punkte beim Angriff.");
        System.out.println("Deine Spezialfaehigkeit heisst \"Fliegen\".");
        System.out.println("Ist sie aktiviert, machst du zwar 5-10 Punkte weniger Schaden, hast aber 10 mehr Lebenspunkte.");
    }

}
