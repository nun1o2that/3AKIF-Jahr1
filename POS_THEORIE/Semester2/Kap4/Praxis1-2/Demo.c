#include <stdio.h>  // ermoeglicht Ausgabe

// main()-Methode
int main() {

    // ich wollte hier urspruenglich meinen Namen hinschreiben, aber bei einem char-Array mit 8 Zeichen muss ich ein Wort mit 7 Zeichen nehmen, da es noch den Null-Character gibt, der das Ende des "Strings" darstellt.
    char name[8] = "Elefant";   // char-Array, "String"

    printf("\n");
    for (int i = 0; i < 7; i++) {
        // mit %-Zeichen werden Format Specifier benutzt
        // %d = int, %c = char, %p = pointer
        // \n ist wie in Java das Zeichen fuer einen Zeilenumbruch
        printf("Element an Stelle %d: %c, mit Addresse %p und Groesse %lu Byte \n", i, name[i], &name[i], sizeof(name[i]));
    }

    // %lu = unsigned long
    printf("Die Groesse des Arrays betraegt %lu Bytes\n", sizeof(name));

    // Strukturen koennen mehrere Datentypen beeinhalten
    struct Student1 {
        int *ptr;           // int Pointer
        char *studentname;  // char Pointer (String)
    } s1;

    int number = 15;

    // ADRESSE von number Variable wird mitgegeben 
    // da im Struct an dieser Stelle ein POINTER ist, zeigt dieser auf den WERT zu dem die Adresse fuehrt
    s1.ptr = &number;

    // scheint die Groesse nicht zu beeinflussen?
    // Padding for Alignment Purposes (2er-Potenzen, da manche Systeme diese am besten lesen koennen, im Gegensatz zu anderen Werten, z.B 6 Bytes)
    s1.studentname = (char*) "Stefaniex";

    printf("\nAdresse des Student1 Pointers: %p, mit der Groesse %lu \n", s1.ptr, sizeof(s1.ptr));
    printf("Adresse des Student1 Namen: %p, mit der Groesse %lu \n", s1.studentname, sizeof(s1.studentname));
    printf("Die Groesse des Struct betraegt %lu Bytes\n", sizeof(s1));

}
