import java.util.Scanner;

public class CharAtTest {

    public static void main ( String[] args ) {

        // apple = "asfdsfshfgfgh";
        // char letter;

        // n = 5;
        // letter = apple.charAt(n);
        // System.out.println(letter);
            
            
                String apple;
                char letter;

                int n1;
                int counter;

                Scanner input = new Scanner(System.in);


        System.out.println("\n" + "------------------------------------------------");
        System.out.println("charAt() Method testing  //  stop by typing [stop]");
        System.out.println("------------------------------------------------");



        do {

                System.out.print("\n" + "enter word: ");
                    apple = input.next();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                n1 = apple.length();
                System.out.println("word length:  " + n1);
                
                            
                            counter = n1 - n1;

                            do {

                                letter = apple.charAt(counter);

                                System.out.print(letter + " ");

                                counter = counter + 1;

                            } while (counter < n1);


                System.out.println("");

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