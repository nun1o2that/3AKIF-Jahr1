#include <iostream>
using namespace std;

int main() {
	int a = 3;
	int c;
	int* p;			// Deklaration eines Zeigers auf einen Integer-Wert

	p = &a;			// Ermitteln der Speicheradresse von a
					// Zuweisung dieser Adresse an p (Referenzierung)

	c = *p + 1;	    // Integer-Wert an der in p hinterlegten 
					// Speicherstelle wird ermittelt 
					// (Dereferenzierung), erhöht und c zugewiesen

	cout << endl << "Variable a hat den Wert " << a << " an der Speicherstelle " << p << endl << endl;

	cout << "Das direkte Auslesen der Speicherstelle " << p << " liefert ebenfalls den Wert " << *p << endl << endl; 

	cout << "c hat nun den Wert " << c << " der an der Speicherstelle " << &c << " liegt." << endl << endl; 

	cout << "Fuer die Pointer-Variable p wurde die Speicherstelle " << &p << " reserviert. Der Wert an dieser Speicherstelle ist " << *p << endl << endl;

	return 0;
}
