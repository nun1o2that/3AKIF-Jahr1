public class Recurse {

    public static int recurse(int counter) {

        if (counter < 10) {
            counter = recurse(counter + 1);
        }

        return counter;

    }

    public static void main ( String[] args ) {

        System.out.println(recurse(0));

        System.out.println('c' == 'a');
        System.out.println('o' > '7');
        System.out.println('6' < 'g');
        System.out.println('c' > 'a');
        System.out.println('6' == '6');
        System.out.println('b' < 'a');


    }

}