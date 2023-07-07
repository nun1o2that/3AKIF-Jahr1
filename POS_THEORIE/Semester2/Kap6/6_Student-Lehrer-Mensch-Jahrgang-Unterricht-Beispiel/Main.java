import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main ( String[] args ) {

        // DUMMYDATEN

        // Aggregation: Stundenten koennen auch ohne Jahrgang existeren
        // name, geburtstag, matrikelnummer
        Student student1 = new Student("Michael", LocalDate.of(2002, 9, 14), "1");
        Student student2 = new Student("Emily", LocalDate.of(1999, 8, 30), "2");
        List<Student> alleStudenten = new ArrayList<Student>();
        alleStudenten.add(student1);
        alleStudenten.add(student2);

        // stammklasse
        Jahrgang schuleJahrgang = new Jahrgang("4AKIF");
        schuleJahrgang.setStudenten(alleStudenten);

        // kurzname, langname
        Fach mathe = new Fach("AM", "Angewandte Mathematik");
        Fach tinf = new Fach("TINF", "Technische Informatik");
        List<Fach> alleFaecher = new ArrayList<Fach>();
        alleFaecher.add(mathe);
        alleFaecher.add(tinf);

        // student, von, bis, note, fach
        Unterricht u1 = new Unterricht(student1, LocalDate.of(2020, 9, 13), LocalDate.of(2021, 7, 9), 1, mathe);
        Unterricht u2 = new Unterricht(student2, LocalDate.of(2021, 9, 13), LocalDate.of(2022, 7, 9), 4, tinf);
        List<Unterricht> alleUnterrichte = new ArrayList<Unterricht>();
        alleUnterrichte.add(u1);
        alleUnterrichte.add(u2);

        // name, geburtstag
        Lehrer meinLehrer = new Lehrer("Max Mustermann", LocalDate.of(1990, 5, 24));
        meinLehrer.setUnterrichtet(alleUnterrichte);
        meinLehrer.setFaecher(alleFaecher);

        System.out.println(meinLehrer);

    }

}