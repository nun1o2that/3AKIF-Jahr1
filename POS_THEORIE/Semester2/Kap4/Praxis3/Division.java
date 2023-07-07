/**
* Klasse zum Durchfuehren einer einfachen Division
* 2 Implementierungen, mit jeweils einer Methode
**/
public class Division {

    /**
    * Implementierung 1: Rueckgabe eines Objektes, das als Datenfelder den Quotient und den Rest hat
    * die ueberschriebene toString()-Methode dieser Klasse wird in der main()-Methode unten benutzt
    * @param x Dividend
    * @param y Divisor
    * @return obj der Klasse Divisionsspeicher
    **/
    public static Divisionsspeicher divisionMitObjekt(int x, int y) {
        int quotient = x / y;
        int rest = x % y;

        Divisionsspeicher obj = new Divisionsspeicher(quotient, rest);

        return obj;
    }

    /**
    * Implementierung 2: Ruckgabe eines Integer-Arrays, das die zwei Werte Quotient und Rest gespeichert hat
    * @param x Dividend
    * @param y Divisor
    * @return das Integer-Array
    **/
    public static int[] divisionMitArray(int x, int y) {
        int quotient = x / y;
        int rest = x % y;

        int[] zahlen = {quotient, rest};

        return zahlen;
    }

    /**
    * main()-Methode
    **/
    public static void main ( String[] args ) {

        // durch das Verwenden der toString()-Methode muessen hier nicht extra Variablen angelegt werden
        System.out.println("Methode 1" + "\n" + divisionMitObjekt(26, 3));

        // fuer diese Methode wird in der main() ein Integer-Array angelegt, dass man aus der Methode von oben zurueckgeben laesst
        int[] ergebnisse = divisionMitArray(12, 4);
        System.out.println("\n" + "Methode 2" + "\n" + "Quotient: " + ergebnisse[0]);
        System.out.println("Rest: " + ergebnisse[1]);

    }

}