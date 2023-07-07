#include <iostream>
using namespace std;

int main() {
	// Eingabe der Anzahl der zu speichernden Zahlen
	int n;
	cout << "Bitte geben Sie die Anzahl der zu speichernden Zahlen ein: ";
	cin >> n;
	cout << endl;

	// NICHT MÖGLICH IST FOLGENDES:
	// double a[n];

	// Deklaration des dynamischen Arrays: Allokation von Speicher
	double* a;
	a = new double[n];	// Speicher für n Double-Zahlen wird reserviert und 
						// die Startadresse dieses Speicherblocks dem 
						// Zeiger a zugewiesen

	// Eingabe der n Double-Zahlen
	for (int i = 0; i < n; i++) {
			cout << (i+1) << ".te Zahl: ";
			cin >> *(a+i);  	// Zeigerarithmetik, um die Startadresse der i-ten 
								// Speicherstelle zu ermitteln; Verwende  
								// Derefenzierung, um den Wert an dieser 
	}							// Speicherstelle zu setzen.

	// Summenbildung
	double summe = 0;
	for (int i = 0; i < n; i++) {
			summe = summe + a[i]; // Lese den Wert an der i-ten Speicher-
	}								// stelle aus und addiere diesen zur summe

	// Mittelwertberechnung und Ausgabe
	double mittelwert = summe / n;

	cout << "Mittelwert: " << mittelwert << endl;

	delete a; 	// WICHTIG: reservierten Speicher freigeben

	return 0;
}
