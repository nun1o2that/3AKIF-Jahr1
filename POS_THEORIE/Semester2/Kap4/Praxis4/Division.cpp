#include <iostream>     // erlaubt Ausgabe
using namespace std;    // Standardbibliothek, sonst muss man bei jeder Ausgabe std::cout schreiben

// globale Variablen, verwendet in divisionGlobal()
int quotient;
int rest;

// in divisionStruct() verwendet
struct ergebnisse {
    int quotient;
    int rest;
};

/** Erste Variante
* die globalen Variablen quotient und rest oben werden benutzt und dann in der main()-Methode ausgegeben
* x ist der Dividend, y der Divisor
**/
void divisionGlobal(int x, int y) {
    quotient = x / y;
    rest = x % y;
}

/** Zweite Variante
* eine Struktur kann mehrere Variablen halten. auch von verschiedenen Datentypen. Hier wird eines
* x ist der Dividend, y der Divisor
**/
ergebnisse divisionStruct(int x, int y) {

    ergebnisse meinE;           /* eine "Instanz" der oben definierten Struktur, mit Punktoperator auf Variablen zugreifen  */
    meinE.quotient = x / y;
    meinE.rest = x % y;

    return meinE;
}

/** Dritte Variante
* Dividend x und Divisor y werden mitgegeben
* zusaetzlich zwei POINTER
* in der main()-Methode werden hier ADRESSEN mit dem &-Zeichen (Adress Operator) mitgegeben
* mit Pointer werden die Werte an diesen Adressen manipuliert
**/
void divisionPointer(int x, int y, int* quotient, int* rest) {
    *quotient = x / y;
    *rest = x % y;
}

// main()-Methode
int main() {

    // Methode 1 mit einer globalen Variable

    divisionGlobal(12, 4);
    // Ausgabe der veraenderten globalen Variablen
    cout << endl << "Quotient: " << quotient << endl;
    cout << "Rest: " << rest << endl << endl;
    system("pause");    // pausieren; im Terminal wird man aufgefordert, eine Taste zu druecken


    ergebnisse meineE = divisionStruct(26, 3);
    // eine ergebnisse-Struktur wird deklariert und mit der zurueckgegebenen Struktur der Funktion initialisiert
    cout << endl << "Quotient: " << meineE.quotient << endl;
    cout << "Rest: " << meineE.rest << endl << endl;
    system("pause");


    int quotientMain;
    int restMain;
    // der Methode werden die ADRESSEN der obigen Variablen mitgegeben
    // in der Methode werden die Werte dieser Adressen veraendert
    divisionPointer(5, 2, &quotientMain, &restMain);
    cout << endl << "Quotient: " << quotientMain << endl;
    cout << "Rest: " << restMain << endl << endl;
    system("pause");

    return 0; 

}