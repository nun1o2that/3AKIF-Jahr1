import java.util.List;

public class Player {
    
    int id;
    int winCount;

    public Player(int id) {
        this.id = id;
        this.winCount = 0;
    }

    public void countWins(List<Integer> results) {
        for (Integer i : results) {
            if (i == id) {
                winCount++;
            }
        }
    }

    public String toString() {
        return id + " " + winCount;
    }

}