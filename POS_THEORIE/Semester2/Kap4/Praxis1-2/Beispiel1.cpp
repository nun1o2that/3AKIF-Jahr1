#include <iostream>
using namespace std;

int x = 0;	// Deklaration und Intialisierung einer globalen Variable

void inkrement() {	// Deklaration und Initialisierung einer Funktion,
	x = x + 1;		// die die globale Variable verwendet und verändert
}

void dekrement() { 
	x--;
}

int main() {
	cout << "Urspruenglicher Wert der globalen Variable x: " << x << endl;
	inkrement();
	inkrement();
	cout << "Neuer Wert der globalen Variable x: " << x << endl;
	dekrement();
	cout << "Neuer Wert der globalen Variable x: " << x << endl;
	return 0;
}

