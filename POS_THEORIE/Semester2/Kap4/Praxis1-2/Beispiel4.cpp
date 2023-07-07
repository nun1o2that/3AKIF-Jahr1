#include <iostream>
using namespace std;

void function() {
	static int zaehler = 0;	// Deklaration einer statischen Variable
                            // mittels des Schlüsselwort static,
                            // Initialisierung nur beim ersten 
                            // Funktionsaufruf

	zaehler++;			       // zaehler erhöhen 

	cout << "Die Funktion wurde " << zaehler << "-mal aufgerufen. " << endl;
}


int main() {			
	function();
	function();
	function();

	// cout << zeahler -> ist hier nicht möglich, da die Variable nur in 
	// der Funktion gültig ist

	return 0;
}
