import java.util.*;

public class Main {

    public static void printInput(int gameCount, int playerCount, List<Game> games) {
        System.out.println(gameCount + " " + playerCount);
        games.forEach(System.out::println);
    }

    /* gibt eine Liste der Spieler-IDs zurueck. Kommt eine ID 3x in dieser Liste vor, hat dieser Spieler 3x gewonnen. */
    public static List<Integer> getAllGameResults(List<Game> games) {
        List<Integer> results = new ArrayList<Integer>();

        for(Game i : games) {
            results.add(i.getResult());
        }
        
        return results;
    }

    /* in jedem Player-Objekt wird die winCount-Variable ausgefuellt */
    public static void countAllPlayerWins(List<Player> players, List<Integer> results) {
        for (Player i : players) {
            i.countWins(results);
        }
    }

    public static void printResults(List<Player> players) {
        players.forEach(System.out::println);
    }

    public static void main(String[] args) {

        int gameCount = 9;
        int playerCount = 4;

        // die 4 Spieler hinzufuegen
        List<Player> players = new ArrayList<Player>();
        players.add(new Player(0));
        players.add(new Player(1));
        players.add(new Player(2));
        players.add(new Player(3));

        // die Spielrunden hinzufuegen (Daten aus PDF uebernommen)
        List<Game> games = new ArrayList<Game>();
        games.add(new Game(0, 227, 1, 775));
        games.add(new Game(2, 292, 3, 184));
        games.add(new Game(0, 279, 3, 74));
        games.add(new Game(2, 34, 3, 22));
        games.add(new Game(1, 926, 2, 486));
        games.add(new Game(0, 595, 1, 856));
        games.add(new Game(0, 120, 3, 108));
        games.add(new Game(0, 25, 2, 935));
        games.add(new Game(0, 923, 2, 968));

        System.out.println();
        printInput(gameCount, playerCount, games);
        System.out.println();

        List<Integer> results = getAllGameResults(games);

        countAllPlayerWins(players, results);

        Collections.sort(players, new PlayerComparator());
        printResults(players);

    }

}