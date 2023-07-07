import java.util.ArrayList;

public class Lambda {

    public static void main ( String[] args ) {

        ArrayList<String> array = new ArrayList<String>();
        array.add("word");
        array.add("anotha one");
        array.add("HUH");

        array.forEach( (n) -> System.out.println(n) );

    }

}