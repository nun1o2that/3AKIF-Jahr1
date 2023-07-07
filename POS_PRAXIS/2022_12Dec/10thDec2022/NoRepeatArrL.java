import java.util.*;

public class NoRepeatArrL {

    //aufgabe: array mit 6 integer werten, das keine sich wiederholenden nummmern enthaelt

    private ArrayList<String> numbers;
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public void createArrayList() {
        System.out.println("\n" + "CREATEARRAYLIST"); 
        numbers = new ArrayList<String>();
        System.out.println("done...");
    }

    public void fillArrayList() {
        System.out.println("\n" + "FILLARRAYLIST"); 
        int generated;
        String stringNumber;

        for(int i = 0; i < 6; i++) {
            
            do {
                generated = rand.nextInt(6) + 1;
                stringNumber = Integer.toString(generated);
            } while(numbers.contains(stringNumber));
            
            numbers.add(stringNumber);
        }   

        System.out.println("done..."); 
    }

    public void printArrayList() {
        System.out.println("\n" + "PRINTARRAYLIST"); 
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != 5) {
                System.out.print(", ");
            }
        }

        System.out.println("\n" + "done...");
    }

}