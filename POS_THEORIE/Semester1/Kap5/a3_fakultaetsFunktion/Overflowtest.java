public class Overflowtest {

    public static void main ( String[] args ) {

        int hi = 2147483647;
        
        System.out.println("2147483647 + 1 = " + (hi + 1));
        //output: 2147483647 + 1 = -2147483648
    }
}


