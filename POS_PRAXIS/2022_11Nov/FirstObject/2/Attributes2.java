import java.util.Scanner;

public class Attributes2 {


        int x;
        int y;
        int zaehler;

        static void myMethod() {
            System.out.println("hello");
            System.out.println("hi");
        }


    public static void main ( String[] args ) {

        attributes2 Obj1 = new attributes2();
        attributes2 Obj2 = new attributes2();
        Scanner scan = new Scanner(System.in);

        Obj1.x = 10;    //override values in object 1
        Obj1.y = 20;    
        Obj2.x = 5;     //override values in object 2
        Obj2.y = 5;

        System.out.println("Obj1: ");
        System.out.println("x = " + Obj1.x);
        System.out.println("y = " + Obj1.y);

        System.out.println();
        System.out.println("Obj2: ");
        System.out.println("x = " + Obj2.x);
        System.out.println("y = " + Obj2.y);

        System.out.println();
        System.out.print("how insanity you want. ");
            Obj1.zaehler = scan.nextInt();

        if (Obj1.zaehler > 0) {
            while (Obj1.zaehler > 0) {
                myMethod();
                Obj1.zaehler--;
            }
        }

        else {
            System.out.println("wrong. value above 0 pitty pease");
        }

    }
}