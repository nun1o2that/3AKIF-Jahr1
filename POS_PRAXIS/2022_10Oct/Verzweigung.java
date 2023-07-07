import java.util.Scanner;

public class Verzweigung {

    public static void main ( String[] args ) {

        //schleife 
        //fragt nach kapitelnamen und seite wo es anfaengt


                String kapitelname;
                String seite;

                int kapitelnameLAENGE;
                int seiteLAENGE;
                int punktLAENGE;
                

                Scanner eingabe = new Scanner(System.in);


        System.out.println("Geben Sie eine Ueberschrift ein:");
            kapitelname = eingabe.next();

        System.out.println("Auf welcher Seite beginnt diese Ueberschrift? ");
            seite = eingabe.next();

        kapitelnameLAENGE = kapitelname.length();
        seiteLAENGE = seite.length();


        punktLAENGE = 60 - kapitelnameLAENGE - seiteLAENGE;


        System.out.print(kapitelname);

        while (punktLAENGE > 0) {

            System.out.print(".");
            punktLAENGE--; 
            //punktLAENGE = punktLAENGE - 1;

        }

        System.out.println(seite);

    }
}
