import java.util.Scanner;

public class Elferprogramm {

    public static void main ( String[] args ) {

        //dreistellige natuerliche zahlen, die die hunderterziffer 7 haben und durch 11 teilbar sind


                int counter = 0;
                int zahl;
                int obergrenze;

                Scanner scan = new Scanner(System.in);

            
        System.out.print("obergrenze: ");
            obergrenze = scan.nextInt();

        while (counter < obergrenze){
            zahl = 11 * counter;
            System.out.println(zahl);
            counter++;
        }

    }
}