#include <stdio.h>  /* fuer Ausgabe */

/* Funktion die eine Zahl hochzaehlt und zurueckgibt */
/* die Variable ist statisch, ihr Wert wird also zwischen Aufrufen gespeichert und weiterverwendet */
int statischeVar() {
    static int zahl = 0;
    zahl++;
    return zahl;
}

/* main()-Methode */
int main() {


    for (int i = 0; i <= 5; i++) {
        printf("%d\n", statischeVar());
    }
    /* output 1 - 6 */

}