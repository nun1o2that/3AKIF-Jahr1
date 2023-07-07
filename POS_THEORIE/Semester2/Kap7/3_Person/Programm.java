import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.function.Function;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Comparator;

public class Programm {

    /* Sortiert die gegebene Liste absteigend und return'd sie */
    public static List<Person> sortByAge(List<Person> personenListe) {
        Collections.sort(personenListe, new AgeComparator());
        return personenListe;
    }

    public static void main (String[] args) {

        /* Aufruf der statischen Methode sortByAge, Parameter List, Rueckgabe List */
        Function<List<Person>, List<Person>> sortDescending = Programm::sortByAge;

        List<Person> personenListe = new ArrayList<Person>();
        String[] namen = {"Max Mustermann", "Jane Doe", "Spiderman", "Harry Potter", "Hulk", "Darth Vader", "Zelda"};

        // Name, Alter, Geschlecht
        personenListe.add(new Person(namen[0], 29, Geschlecht.M));
        personenListe.add(new Person(namen[1], 20, Geschlecht.X));
        personenListe.add(new Person(namen[2], 17, Geschlecht.M));
        personenListe.add(new Person(namen[3], 18, Geschlecht.M));
        personenListe.add(new Person(namen[4], 36, Geschlecht.M));
        personenListe.add(new Person(namen[5], 40, Geschlecht.K));
        personenListe.add(new Person(namen[6], 21, Geschlecht.W));

        personenListe.forEach(System.out::println);

        // Warning laut -Xlint: unchecked method invocation
        // absteigend sortieren mit dem neuen Comparator
        personenListe = sortDescending.apply(personenListe);

        System.out.println("\nAbsteigend sortiert:");
        personenListe.forEach(System.out::println);

        /* sortieren: nur die Maenner werden in die neue Liste alleMaenner gespeichert */
        List<Person> alleMaenner = personenListe
            .stream()
            .filter(person -> person.getGeschlecht().getBezeichnung() == "maennlich")
            .collect(Collectors.toList());

        System.out.println("\nAlle Maenner:");
        alleMaenner.forEach(System.out::println);

        /* Liste in Stream verwandelt, dann nur die Alter verwendet, dann der Durchschnitt in average gespeichert */
        Double average = alleMaenner
            .stream()
            .mapToInt(person -> person.getAlter())
            .average()
            .getAsDouble();

        System.out.println("\nDurchschnitt der Maenner-Alter:");
        System.out.println(average);

    }

}