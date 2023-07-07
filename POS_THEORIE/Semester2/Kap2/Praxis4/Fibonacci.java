/**
* Klasse zur Bestimmung der Fibonacci-Folge bis zur Zahl n
*/
public class Fibonacci {

    int[] zahlen;

    /**Konstruktor der Klasse Fibonacci
    *
    * @param n Integer, bis zu dem berechnet wird -> n + 1 ist die Array-Groesse
    **/
    public Fibonacci(int n) {
        zahlen = new int[n + 1];
    }

    /**
    * Funktion zur Bestimmung der Fibonacci-Folge bis zur Zahl n
    * Vorgabe der PDF-Datei der Coding Contest Seite:
    *      f(n) = f(n-1) + f(n-2) fuer n groessergleich 2
    *      f(0) = 0  und  f(1) = 1  sind definiert
    */
    void fibonaccifolge() {

        zahlen[0] = 0;
        zahlen[1] = 1;
        for(int i = 2; i < zahlen.length; i++) {
            zahlen[i] = zahlen[i - 1] + zahlen[i - 2];
        }

        for(int i = 0; i < zahlen.length; i++) {
            System.out.println("f(" + i + ") = " + zahlen[i]);
        }

    }

}