public class Rechnen {

    public static void main ( String[] args ) {
        
        int sum = 0;


        for (int i = 10; i <= 99; i++) {
            sum++;
        }
        System.out.println("10 - 99: " + sum);


        sum = 0;
        for (int i = 100; i <= 999; i++) {
            sum++;
        }
        System.out.println("100 - 999: " + sum);


        sum = 0;
        for (int i = 1000; i <= 9999; i++) {
            sum++;
        }
        System.out.println("1000 - 9999: " + sum);


        sum = 0;
        for (int i = 10000; i <= 99999; i++) {
            sum++;
        }
        System.out.println("10000 - 99999: " + sum);


        sum = 0;
        for (int i = 100000; i <= 999999; i++) {
            sum++;
        }
        System.out.println("100000 - 999999: " + sum);


        System.out.println("\n");
        sum = 0;
        sum += 12 * 10;
        System.out.println("" + sum + " + " + (14 * 90));
        sum += 14 * 90;
        System.out.println("" + sum + " + " + (16 * 900));
        sum += 16 * 900;
        System.out.println("" + sum + " + " + (18 * 9000));
        sum += 18 * 9000;
        System.out.println("" + sum + " + " + (20 * 90000));
        sum += 20 * 90000;
        System.out.println("" + sum + " + " + (22 * 900000));
        sum += 22 * 900000;
        System.out.println(sum);


    }

}