/**
* Klasse zum Nachbauen des 'static' Schluesselworts in C
* @author Stefanie Karov
**/
public class Demo {

    static int global = 0;

    /**
    * Art 1, mittels Inkrementieren der globalen Integer Variable
    **/
    static void increment1() { global++; }

    /**
    * Art 2, Hochzaehlen und Zurueckgeben einer Zahl
    * @param x in main()-Methode mitgegebene Zahl
    * @return die Zahl um 1 hoeher
    **/
    static int increment2(int x) { return ++x; }

    /* main()-Methode */
    public static void main ( String[] args ) {

        System.out.println();
        for(int i = 0; i < 4; i++) {
            System.out.println(global);
            increment1();
        }

        System.out.println();
        int zahl = 0;
        for(int i = 0; i < 4; i++) {
            System.out.println(zahl);
            zahl = increment2(zahl);
        }

    }

}