#include <iostream>
using namespace std;

int main() {
		double a[5];
		double* p;

		// Speicheradresse von a
		cout <<  "Speicheradresse von a: " << a << endl;
		p = &(a[0]);
		cout << p << endl;

		// Zeigerarithmetik: Zugriff auf das 2. Arrayelement
		cout << "Zugriff auf a[2]: " << endl;
		cout << a[2] << endl;
		cout << *(a+2) << endl;
		cout << *(p+2) << endl;

		// Speicherstelle von a[2]
		cout << "Speicherstelle von a[2]: " << endl;
		cout << &(a[2]) << endl;
		cout << a+2 << endl;
		cout << p+2 << endl;

		return 0;
}
