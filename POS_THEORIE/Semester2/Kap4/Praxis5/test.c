// Programm zum Testen des Pfeil-Operators gefolgt vom Punkt-Operator bei Pointer auf eine Struktur und deren Inhalte
#include <stdio.h>

struct Test1 {
    int number;
};

struct toBeAccessed {
    int number;
};

struct Test2 {
    toBeAccessed ACCESSTHIS;
};

void changeFirst(Test1* point1, int* point2) {
    point1->number = *point2;
}

void changeSecond(Test2* point1, int* point2) {
    point1->ACCESSTHIS.number = *point2;
}

int main() {
    int x = 5;
    int y = 69;
    Test1 first;
    changeFirst(&first, &x);
    printf("%d", first.number);

    Test2 second;
    changeSecond(&second, &y);
    printf("\n%d", second.ACCESSTHIS.number);

}