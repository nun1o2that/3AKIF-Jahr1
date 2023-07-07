#include <iostream>
using namespace std;

struct Student1 {
   int *ptr;  		// int Pointer
   char *name; 		// char Pointer (String)
} s1;

int main() {
   int roll = 20;
   s1.ptr = &roll;
   s1.name = (char*) "Pritesh";

   printf("\nRoll Number of Student : %d", *s1.ptr);
   printf("\nName of Student        : %s", s1.name);

   return 0;
}
