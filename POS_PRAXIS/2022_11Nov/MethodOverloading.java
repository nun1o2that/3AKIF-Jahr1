import java.util.Scanner;

public class MethodOverloading {

    //multiple methods can have same name with different parameters
    //instead of defining two methods that do the same thing, it's better to overload one
    //multiple methods can have the same name as long as the amount/type of parameters is different

    static int plus(int x, int y){
        return x + y;
    }

    static double plus(double x, double y){
        return x + y;
    }





    //RECURSION
    //calling a function INSIDE a function
    //kind of like a loop, can be infinite -> need halting condition

    //being careful
    //very easy 2 slip into writing a function that never terminates / uses excess amounts of memory/processor power
    //however, correctly written recursion can be a very efficient & mathematically-elegant approach 2 programming

    static int runterzaehlenSum(int x){
        
        if (x > 0) {
            return x + runterzaehlenSum(x - 1);
            // System.out.println(x);
        }

        else {
            return 0;
        }

    }



    static int aufzaehlenSum(int start, int ende){
        
        if (start <= ende){
            return start +  aufzaehlenSum(start + 1, ende);
        }

        else{
            return 0;
        }

    }


    public static void main ( String[] args ) {


                int x;
                int start;
                int ende;

                int runterzaehlen;
                int aufzaehlen;
                
                Scanner scan = new Scanner(System.in);



        System.out.println("plus()");
            System.out.println(plus(3, 4));
            System.out.println(plus(2.5, 1.2));



        System.out.println();



        System.out.println("runterzaehlenSum()");
            System.out.print("x eingeben: ");
                x = scan.nextInt();

            runterzaehlen = runterzaehlenSum(x);
            System.out.println("summe: " + runterzaehlen);



        System.out.println();



        System.out.println("aufzaehlenSum()");
            System.out.print("start eingeben:");
                start = scan.nextInt();

            System.out.print("ende eingeben:");
                ende = scan.nextInt();

            aufzaehlen = aufzaehlenSum(start, ende);
            System.out.println("summe: " + aufzaehlen);



        System.out.println();





        



    }


}
