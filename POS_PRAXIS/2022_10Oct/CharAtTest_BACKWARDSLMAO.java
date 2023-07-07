import java.util.Scanner;

public class CharAtTest_BACKWARDSLMAO {

    public static void main ( String[] args ) {

        // apple = "asfdsfshfgfgh";
        // char letter;

        // n = 5;
        // letter = apple.charAt(n);
        // System.out.println(letter);
            
            
                String apple;
                char letter;

                int n;
                int counter = 1;

                Scanner input = new Scanner(System.in);


        System.out.println("charAt() Method testing  //  stop by typing [stop]");
        System.out.println("------------------------------------------------");

        do {
            System.out.print("\n" + "enter word: ");
                apple = input.next();

            n = apple.length();
            
                    while ( (n >= counter) ){
                        n = n - 1;
                        letter = apple.charAt(n);

                        System.out.print (letter + " ");
                    }

        } while ( !(apple.equals("stop")) );

        

        
    }
}



//n! = n * (n-1) * n(n-2) * ... * 2 * 1 
        //0! = 1
        //1! = 1

        //         int n;
        //         int zaehler = 1;
        //         int ergebnis = 1;
        //         Scanner eingabe = new Scanner(System.in);

        // System.out.println("\n" + "Fakultaetsberechnung");
        // System.out.println("--------------------");
        // System.out.print("n eingeben: ");
        //     n = eingabe.nextInt();

        // System.out.println("~~~~~~~~~~~~~~~~~~~~");

        //         if ( (n != 0) && (n != 1) ) {

        //                 while (n > zaehler) {
        //                     ergebnis = ergebnis * (n - zaehler);
        //                     zaehler = zaehler + 1;
        //                 }   

        //             ergebnis = ergebnis * n;
        //             System.out.println(n +"! = " + ergebnis);
        //         }


        //         else /*  if ( (n == 1) || (n == 0) )  */ {
        //             System.out.println(n +"! = 1");
        //         }