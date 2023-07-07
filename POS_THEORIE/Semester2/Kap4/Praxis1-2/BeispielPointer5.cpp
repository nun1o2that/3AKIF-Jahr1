#include <iostream>
using namespace std;

void argumentByValue(int n) {
	n++;
	cout << "Im Funktionsaufruf von argumentByValue hat das Argument " << "nach dem Inkrementieren den Wert " << n << endl;
}

void argumentByReference1(int* p) {
	(*p)++;		// int-Wert an der Speicherstelle p wird um 1 erhöht
	cout << "Im Funktionsaufruf von argumentByReference1 hat das Argument " << "nach dem Inkrementieren den Wert " << *p << endl;
}

void argumentByReference2(int &n) {
	n++;
	cout << "Im Funktionsaufruf von argumentByReference2 hat das Argument " << "nach dem Inkrementieren den Wert " << n << endl;
}

int main(){
	int x = 3;
	cout << "Wert von x im Hauptprogramm nach der Initialisierung: " << x << endl;

	argumentByValue(x);
	
	cout << "Wert von x im Hauptprogramm nach dem Aufruf von " << "argumentByValue: " << x << endl;

	argumentByReference1(&x);
	
	cout << "Wert von x im Hauptprogramm nach dem Aufruf von " << "argumentByReference1: " << x << endl;

    argumentByReference2(x);

    cout << "Wert von x im Hauptprogramm nach dem Aufruf von " << "argumentByReference2: " << x << endl;

	return 0;
}
