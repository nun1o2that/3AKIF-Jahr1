/**
* Klasse zur Bestimmung der Fibonacci-Folge bis zur Zahl n
*/
public class Fibonacci {

    int start = 0;
    int f1 = 0;
    int f2 = 1;
    int f3 = 0;

    /**
    * Funktion zur Bestimmung der Fibonacci-Folge bis zur Zahl n
    * Vorgabe der PDF-Datei der Coding Contest Seite:
    *      f(n) = f(n-1) + f(n-2) fuer n groessergleich 2
    *      f(0) = 0  und  f(1) = 1  sind definiert
    * @param n Grenze, bis zu der die Sequenz ausgegeben wird
    */
    void fibonaccifolge(int n) {

        if (start == 0) {
            System.out.println("f(" + start + ") = " + f1);
        }
        else if (start == 1) {
            System.out.println("f(" + start + ") = " + f2);
        }
   
        if (start > 1) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

            System.out.println("f(" + start + ") = " + f2);
        }

        start++;

        if (n > 0) {
            fibonaccifolge(n-1);
        }

    }

}