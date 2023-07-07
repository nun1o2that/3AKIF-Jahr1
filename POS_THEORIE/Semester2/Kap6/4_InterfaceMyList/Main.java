import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Random rand = new Random();
        MyListElement liste = new MyListElement();
        Scanner scan = new Scanner(System.in);

        System.out.println("Size: " + liste.size());

        for (int i = 100; i < 110; i++) {
            // liste.add(rand.nextInt(100, 201));
            liste.add(i);
        }

        System.out.println("\n" + liste);
        System.out.println("Size: " + liste.size());

        liste.add(1000, 5);

        System.out.println("\n" + liste);
        System.out.println("Size: " + liste.size());

        System.out.print("Remove which? ");
        int remove = scan.nextInt();
        System.out.println("Removed: " + liste.remove(remove));


        System.out.println("\n" + liste);
        System.out.println("Size: " + liste.size());

    }

}