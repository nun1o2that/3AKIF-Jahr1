// ConsoleApplication5.cpp : Definiert den Einstiegspunkt für die Konsolenanwendung.
//

#include "stdafx.h"
#include <iostream>
#include <string>
#include <sstream>
using namespace std;

struct adresse { string vorname; string nachname; int plz; string ort; string strasse; };
struct schueler { adresse person; string klasse; };

void ausgeben(schueler &s) {
	cout << s.klasse;
	s.klasse = "2AXIF";
}

int main()
{
	adresse imst;
	imst.plz = 6460;

	schueler huber; 
	huber.klasse = "1AXIF"; 
	huber.person.vorname = "Daniel";

	ausgeben(huber);
	
	cout << huber.klasse;

	int x;
	cin >> x;

    return 0;
}

