#include <iostream>
using namespace std;

int main() {
	int a = 3; 	// Variable vom Typ int wird deklariert: Eine 
				// Speicherstelle der Größe von 4 Byte wird reserviert

                // &a liefert die Speicheradresse des ersten der vier für die 
                // Variable a reservierten Speicherblöcke
	cout << "Speicherbereich von a beginnt bei Adresse " << &a << endl;

    cout << a << endl;

    // Dereferenzierung mit *-Operator
    cout << *(&a) << endl; 	// Zuerst wird die Speicheradresse von a 
                            // bestimmt (durch den &-Operator). Dann wird
                            // der Wert, der an dieser Speicheradresse liegt,
                            // ermittelt (durch den *-Operator).


	return 0;
}
