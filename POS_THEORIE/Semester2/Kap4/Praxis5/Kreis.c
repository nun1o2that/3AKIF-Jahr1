/**
* C-Programm, gleichzustellen mit gleicher Funktionalitaet der Java-Klassen Koordinate, Kreis und Main
**/

#include <stdio.h>  // ermoeglicht Ausgabe usw.
#include <math.h>   // fuer mathematische Funktionen (unten: sqrt)

// Struktur mit 2 Integer; gleichzustellen mit Koordinate.java
struct koordinate {
    int x;
    int y;
};

// Struktur aus einer "Instanz" der Koordinatenstruktur und einem int Radius; gleichzustellen mit Kreis.java
struct kreis {
    koordinate coord;
    int radius;
};

// Parameter: Integer-Pointer
// mit Hilfe dieser werden die Datenfelder der main()-Methode manipuliert
void eingabe(int* x, int* y, int* z) {
    printf("\nPosition (Koordinate in der Mitte des Kreises):\n");
    // Eingabe NORMALERWEISE mit &
    // z.B scanf("%d", &x);
    // wird aber durch die Pointer-Parameter schon mitgegeben ???
    printf("X-Koordinate: ");
        scanf("%d", x);
    printf("Y-Koordinate: ");
        scanf("%d", y);
    printf("Radius eingeben: ");
        scanf("%d", z);
}

// Parameter: Kreisstruktur-Pointer und Integer-Pointer
// mit Hilfe dieser werden die Datenfelder der main()-Methode manipuliert
void setPosition(kreis* c, int* newX, int* newY, int* newRadius) {
    // coord ist ein Datenfeld der Kreisstruktur-Instanz c                      ->
    // x und y sind Datenfelder der Koordinatenstruktur-Instanz coord in c      .
    c->coord.x = *newX;
    c->coord.y = *newY;
    c->radius = *newRadius;
}
r
// Parameter: Kreisstruktur-Pointer
// Werte werden wie in setPosition() aufgerufen und dann ausgegeben
void output(kreis* c) {
    const double PI = 3.141592653589793;
    printf("\n**************************************");
    printf("\nMitte M(%d|%d)", c->coord.x, c->coord.y);
    printf("\nRadius r = %d", c->radius);
    printf("\nUmfang u = %lu \nFlaeche f = %f", (2 * PI * c->radius), (PI * sqrt(c->radius)));
    printf("\n**************************************\n");
}

// Parameter: Integer-Pointer
void menue(int* user) {
    printf("\n--------------------------------------");
    printf("\n1 - Werte des Kreises aendern");
    printf("\n2 - Informationen ausgeben");
    printf("\n3 - Programm Beenden");
    printf("\n--------------------------------------");
    printf("\nWelche Option? ");
    scanf("%d", user); // hier wieder kein & benoetigt !!!
}

// main()-Methode
int main() {

    int user = 0;
    int x = 0;
    int y = 0;
    int z = 0;
    kreis circle;

    // bei Methodenaufrufen wird immer die ADRESSE mitgeliefert
    eingabe(&x, &y, &z);
    setPosition(&circle, &x, &y, &z);

    do {
        menue(&user);
        switch(user) {
            case 1: eingabe(&x, &y, &z); setPosition(&circle, &x, &y, &z); break;
            case 2: output(&circle); break;
        }
        // printf("%d %d %d %d", user, x, y, z); // testing
    } while(user != 3);

    printf("\nByeBye!\n");

}