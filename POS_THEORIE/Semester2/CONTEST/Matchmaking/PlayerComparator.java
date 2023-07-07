import java.util.Comparator;

public class PlayerComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Player p1 = (Player)obj1;
        Player p2 = (Player)obj2;
 
        /* wenn 2 Spieler gleich viele Spiele gewonnen haben, wird nach ID sortiert */
        if (p1.winCount == p2.winCount) {
            return Integer.valueOf(p1.id).compareTo(Integer.valueOf(p2.id));
        }
        else if (p1.winCount > p2.winCount) {
            return -1;
        }
        else {
            return 1;
        }
    }

}