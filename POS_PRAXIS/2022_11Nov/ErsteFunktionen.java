public class ErsteFunktionen {


    static void system_out() {          //static = method belongs to class funktion_ersterTest and not an object of funktion_ersterTest
        System.out.println("lol");      //voi = method does not have a return value
    }





    //parameters act as variables inside a method
    //are specified after method name, inside parentheses
    //can add as many as you want, separate with comma -> method CALL must have same number & order of arguments

    //when a parameter is passed 2 the method, it's called an ARGUMENT

    static void people(String name, String lastName, int age) {
        System.out.println(name + " " + lastName + " " + "is " + age + " years old.");
    }





    //void keyword indicates that method SHOULD NOT RETURN A VALUE
    //instead, you can use a primitive data type
    //eg INT, CHAR
    //and use return keyword inside the method to return the value

    static void sum(int a, int b) {
        System.out.println("the sum of " + a + " and " + b + " is " + (a + b));
    }

    static int sumReturn(int a2, int b2) {
        return a2 + b2;
    }


    //storing results in a variable is recommended -> easier 2 read and maintain

    static int square(int x) {
        System.out.println("the square of " + x + " is " + ((int)Math.pow(x, 2)));
        return x;
    }

    static int squareReturn(int x2){
        return (int)Math.pow(x2, 2);
    }



    public static void main( String[] args) {
        
        System.out.println("system_out()");
            system_out();   //do System.out.println("lol"); three times
            system_out();
            system_out();


        System.out.println();


        System.out.println("people()");
            people("max", "muster", 23);
            people("hans", "dieter", 50);
            people("jeremy", "elbertson", 69);


        System.out.println();


        System.out.println("sum");
            sum(3, 6);


        System.out.println();


        System.out.println("sumReturn()");
            int sumReturn = sumReturn(4, 3);
            System.out.println("the sum is " + sumReturn);  //nur 1 variable returnbar


        System.out.println();


        System.out.println("square()");
            square(5);


        System.out.println();


        System.out.println("squareReturn");
            int squareReturn = squareReturn(5);
            System.out.println("the square is " + squareReturn);    //nur 1 variable returnbar

    }
}