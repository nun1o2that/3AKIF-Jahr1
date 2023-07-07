import java.util.Scanner;

public class TernaryOperator {

    public static void main ( String[] args ) {

        int exam;
        int gift;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many points did you get on the test?");
            exam = scan.nextInt();

        gift = (exam >= 50) ? 10 : 0;

        System.out.println("Gift: " + gift);
    }
}