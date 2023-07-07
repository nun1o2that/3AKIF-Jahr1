import java.util.Random;

public class Smartgrid {

    public static void main( String[] args ) {

        int counter = 0;
        int zahl;
        int[] prices;
        Random random = new Random();

        // for how many minutes does the price get documented?
        int n = random.nextInt(10, 31);
        prices = new int[n];

        System.out.println("\n" + "n: " + n + "\n");

        // generate random numbers between 1000-8000 (inclusive) and fill the array with them
        while (counter < n) {
            zahl = random.nextInt(1000, 8001);
            prices[counter] = zahl;
            counter++;
        }

        // output all the prices with the corresponding ID (= minute)
        counter = 0;
        for (int i : prices) {
            System.out.print("ID: " + counter);
            if (counter < 10) {
                System.out.print(" ");
            }
            System.out.println(" Price: " + i);
            counter++;
        }

        counter = 0;
        int minPrice = 0;
        int minPriceId = 0;
        // cycle through the array and pick out the lowest price, together with its ID
        for (int i : prices) {
            if (counter == 0) {
                minPrice = i;
                minPriceId = counter;
            }
            if (i < minPrice) {
                minPrice = i;
                minPriceId = counter;
            }
            counter++;
        }

        // output of results
        System.out.println("\n" + "minPriceId: " + minPriceId);
        System.out.println("minPrice: " + minPrice);
        System.out.println("The lowest price is " + minPrice + ", occuring at minute " + minPriceId + ".");

    }

}