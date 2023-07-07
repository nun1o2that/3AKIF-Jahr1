import java.util.Scanner;

public class Fibonacci {

    public static int[] fiboArray(int stelle) {
        int[] zahlen = new int[stelle];
    
        for (int i = 0; i < stelle; i++) {
            switch (i) {
                case 0: zahlen[0] = 0; break;
                case 1: zahlen[1] = 1; break;
            }
            if (i > 1) {
                zahlen[i] = zahlen[i - 1] + zahlen[i - 2];
            }
        }
        return zahlen;
    }

    public static void fiboAusgabe(int stelle) {
        int x = 0;
        int y = 1;
        int z;
        String output = "";
        
        output += "[";
        for (int i = 0; i < stelle; i++) {
            output += x + ", ";
            z = x;
            x += y;
            y = z;
        }

        output = output.substring(0, output.length() - 2);
        output += "]";
        System.out.println(output);
    }

    public static void main ( String[] args ) {

        Scanner scan = new Scanner(System.in);
        int user = 1;
        int[] zahlen;
        String output = "";

        while (user != 0) {
            System.out.print("\nBis zu welcher Stelle? ");
            user = scan.nextInt();

            if (user != 0) {
                fiboAusgabe(user);

                output += "[";
                zahlen = fiboArray(user);
                
                for (int i : zahlen) {
                    output += i + ", ";
                }
                output = output.substring(0, output.length() - 2);
                output += "]";
                System.out.println(output);
                output = "";
            }

        }

        scan.close();

    }

}