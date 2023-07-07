#include <iostream>
using namespace std;

int inkrement(int x) {	//
	int y;			    // Gültigkeitsbereich von x und y
	y = x + 1;			//
	return y;			//
} 

int dekrement(int x) { 	// Scope von x
	return x--;			// Fehlerhafte Anweisung?
}

int main() {			
	int x = 0;				        // Scope von x
	x = inkrement(x);			    //
	cout << " x: " << x << endl;	//
	return 0;				        //
}
