import java.util.Comparator;

public class AgeComparator implements Comparator {

    // ueberschriebene Methode MUSS Object als Parameter haben, kann aber dann mit Typecasting anders verwendet werden.
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        
        if (p1.getAlter() == p2.getAlter()) {
            return 0;
        }
        // absteigend sortieren!
        else if (p2.getAlter() > p1.getAlter()) {
            return 1;
        }
        else {
            return -1;
        }
    }
 
}