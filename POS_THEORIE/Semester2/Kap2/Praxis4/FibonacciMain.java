import java.util.Scanner;

/**
* Klasse zur Benutzereingabe. n-Wert dann in Fibonacci-Klasse verwendet
*/
public class FibonacciMain {

    public static void main ( String[] args ) {

        int n;
        Scanner scan = new Scanner(System.in);
        Fibonacci f;

        System.out.println("Fibonacci-Folge:");
        System.out.println("f(n) = f(n-1) + f(n-2) fuer n groessergleich 2" + "\n");
        System.out.print("Wie hoch ist n? ");
            n = scan.nextInt();

        f = new Fibonacci(n);
        f.fibonaccifolge();

    }

}