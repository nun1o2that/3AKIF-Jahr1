import java.util.Scanner;

public class CarProgram {
     
    public static void main ( String[] args ) {


            String answer;
            String userString;
            int userInt1;
            int userInt2;
            Car myCar1 = new Car();
            Scanner scan = new Scanner(System.in);



        do {
            System.out.println("\n" + "change da car's attributs..........");
            System.out.println("-------------------------------------------------");

            System.out.print("change type: ");
                userString = scan.next();
                myCar1.changeType(userString);

            System.out.print("change color: ");
                userString = scan.next();
                myCar1.changeCarColor(userString);

            System.out.print("Point: move to x-coordinate: ");
                userInt1 = scan.nextInt();
            System.out.print("Point: move to y-coordinate: ");
                userInt2 = scan.nextInt();
                myCar1.moveCar(userInt1, userInt2);

            myCar1.showAttributes();

            System.out.print("continue? yes no: ");
                answer = scan.next();

        } while(answer.equals("yes"));


    }
}