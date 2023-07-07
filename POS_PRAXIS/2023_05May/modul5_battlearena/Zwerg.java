import java.util.concurrent.ThreadLocalRandom;

public class Zwerg extends Charakter {

    public Zwerg(String constrName) {
        super(constrName);
    }

    public void angreifen(Charakter gegner) {
        int lebenspunkte = 0;
        int chance = 0;
        int random = 0;
        
        int minSchaden = 15;
        int maxSchaden = 25;

        int schaden = ThreadLocalRandom.current().nextInt(minSchaden, maxSchaden + 1);

        if (this.istSpezialfaehigkeitAktiv()) {
            lebenspunkte = this.getLebenspunkte();
            if (lebenspunkte > 20 && lebenspunkte <= 50) {
                chance = 30;
            }
            else if (lebenspunkte > 10 && lebenspunkte <= 20) {
                chance = 50;
            }
            else if (lebenspunkte > 0 && lebenspunkte <= 10) {
                chance = 70;
            }

            random = ThreadLocalRandom.current().nextInt(0, 100) + 1;

            if (random < chance) {
                schaden += 2;
            }
            else {
                schaden /= 2;
            }
        }

        gegner.schadenNehmen(schaden);

    }

    public void regelnAusgeben() {
        System.out.println("Als Zwerg hast du 100 Lebenspunkte.");
        System.out.println("Du machst zwischen 15 und 25 Schaden Punkte beim Angriff.");
        System.out.println("Deine Spezialfaehigkeit heisst \"Zwergenkopfnuss\".");
        System.out.println("Sie kann nur aktiviert werden, wenn du weniger als 50 Lebenspunkte hast.");
        System.out.println("Ist sie aktiviert, machst du zwar 5-10 Punkte weniger Schaden, hast aber 10 mehr Lebenspunkte.");
        System.out.println("Abhaengig von deinen Lebenspunkten hast die Chance, doppelten Schaden zu machen:");
        System.out.println("30 % ab einem Lebenspunkte-Wert von 50 oder weniger");
        System.out.println("50 % ab einem Lebenspunkte-Wert von 20 oder weniger");
        System.out.println("70 % ab einem Lebenspunkte-Wert von 10 oder weniger ");
        System.out.println("Triffst du nicht, wird dein Schaden fuer diese Runde halbiert");
    }

}