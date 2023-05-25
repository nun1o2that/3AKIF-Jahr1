import java.util.*;
import java.io.*;

public class Worddeletion {

    public static void main ( String[] args ) throws FileNotFoundException {

        File initialFile = new File("wordlist.10000.txt");
        System.out.println(initialFile.exists()); //kleiner check -> true

        Scanner fileScanner = new Scanner(initialFile);

        int counter = 0;
        ArrayList<String> myWords = new ArrayList<String>();
        String current;

        // alle Woerter groesser als 3 in eine ArrayList speichern
        while(fileScanner.hasNextLine()) {
            current = fileScanner.nextLine();

            if (current.length() > 3) {
                myWords.add(current + "\n");
                // System.out.println(current);
                counter++;
            }
        }
        System.out.println(counter);

        // output list
        for (String i : myWords) {
            System.out.println(i);
        }

        // writey writey :)
        try {
            FileWriter writey = new FileWriter("new_wordlist.txt");
            for (String i : myWords) {
                writey.write(i);
            }
            writey.close();
        }
        catch (IOException e) {
            System.out.println("Error!! >:(");
        }

    }

}