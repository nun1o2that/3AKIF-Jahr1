/**
* Klasse dient zum Durcharbeiten des Hanoi-Problems mithilfe von Methode transport
*/
public class Hanoi2 {

    public long schritte = 0;

    /**
    * Funktion, die rekursiv das Hanoi-Problem durchlaeuft
    * @param n Anzahl der Scheiben
    * @param l stellt linke Saeule dar
    * @param m stellt mittige Saeule dar
    * @param r stellt rechte Saeule dar
    */
    public long transport(int n, char l, char m, char r) {

        //1. TRANSPORT(n - 1, L, R, M)    falls n > 1
        if (n > 1 ) {
            transport(n - 1, l, r, m);
        }

        schritte++;
        
        //2. Transportiere Scheibe n von Saeule L nach Saeule M     immer
        System.out.println("Schritt " + schritte + ": Transportiere Scheibe " + n + " von Saeule " + l + " zu Saeule " + m);

        //3. TRANSPORT(n - 1, R, M, L)    falls n > 1
        if (n > 1) {
            transport(n - 1, r, m, l);
        }

        return schritte;
    }

}

// Tuerme von Hanoi (Teil 2)

// Implementiere den Algorithmus, indem du folgende Funktion   void transport(int n, char l, char m, char r)   erstellst. 
// Diese ruft entsprechend dem Algorithmus sich selbst rekursiv mehrfach auf und gibt "Transportiere Scheibe n von Saeule L nach Saeule M (ueber R)" auf die Konsole aus.

// Integriere einen Schritte-Zaehler, welcher tatsaechlichen Verschiebungen (die Konsolenausgaben "Transportiere Scheibe...") zaehlt und am Ende ausgibt.

// Erstelle eine Messreihe (Excel-Tabelle und Diagramm) mit und ohne Konsolenausgaben fuer verschiedene Werte fuer n = 5, 10, ..., 30, 35 um den Zeitaufwand (System.currentTimeMillis()) in Abhaengigkeit von der Scheibenanzahl zu ermitteln. Teste ab welcher Anzahl ein Speicherfehler auftritt.

