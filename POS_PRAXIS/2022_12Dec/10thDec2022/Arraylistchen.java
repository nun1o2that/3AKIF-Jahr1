import java.util.Random;

public class Arraylistchen {

    public static void main ( String[]args ) {

        //array erstellen UND speicherplatz reservieren
        int[] zahlen = new int[100];
        Random rand = new Random();

        //fuellen
        for(int i = 0;i < 100;i++) {
            zahlen[i] = rand.nextInt(1000) + 1;
        }
        //ausgeben
        for(int i : zahlen) {
            System.out.print(i + ", ");
        }

        System.out.println("\n" + "---------------------------------------------------------------------------" + "\n");

        String[] buchstaben = new String[10];
        String lttrs = "abcdefghijklmnopqrstuvwxyz";
        
        //fuellen
        for(int i = 0; i < 10; i++) {
            buchstaben[i] = Character.toString(lttrs.charAt(rand.nextInt(26)));
        }
        //ausgeben
        for(String i : buchstaben) {
            System.out.print(i + ", ");
        }


    }
    
}