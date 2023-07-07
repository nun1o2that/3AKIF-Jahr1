public class Game {
    
    int player1Id;
    int scorePlayer1;
    int player2Id;
    int scorePlayer2;

    public Game(int player1Id, int scorePlayer1, int player2Id, int scorePlayer2) {
        this.player1Id = player1Id;
        this.scorePlayer1 = scorePlayer1;
        this.player2Id = player2Id;
        this.scorePlayer2 = scorePlayer2;
    }

    public String toString() {
        return player1Id + " " + scorePlayer1 + " " + player2Id + " " + scorePlayer2;
    }

    public int getResult() {
        if (scorePlayer1 > scorePlayer2) {
            return player1Id;
        }
        else {
            return player2Id;
        }
    }

}