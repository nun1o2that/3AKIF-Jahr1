import java.util.Scanner;

/**
* Main-class
* Prints a Welcome-message and handles the game-loop
**/
public class Main {
    
    /**
    * Prints a Welcome-message before the game starts
    **/
    public static void welcome() {
        System.out.println("\n" + "******************************************************");
        System.out.println("                      Welcome!" + "\n");
        System.out.println("               This is a Sudoku-Game." + "\n");
        System.out.println("        To target a field, you have to write:");
        System.out.println("        the corresponding letter, then number.");
        System.out.println("          For example: a1, b5, i8, f3, ..." + "\n");
        System.out.println("          To quit the current game, enter Q.");
        System.out.println("                      Have fun!");
        System.out.println("******************************************************" + "\n" + "\n");
    }

    /**
    * Prints a Goodbye-message after the game ends (user chooses not to play anymore)
    **/
    public static void byebye() {
        System.out.println("******************************************************");
        System.out.println("                      Byebye! :)");
        System.out.println("******************************************************" + "\n");
    }

    /**
    * main-method YOU KNOW IT YOU LOVE IT
    **/
    public static void main ( String[] args ) {

        SudokuGame game;  
        String user;
        Scanner scan = new Scanner(System.in);
        
        welcome();
        
        // whole program
        do {
            // System.out.println("AGIN");1
            game = new SudokuGame();

            do {
                game.printMap();
                game.input();
            } while (game.returnEndGame() == false);

            // at the end of one game loop, get thrown back here
            // implement choice - play again or no?

        } while (game.returnPlayAgain() == true);

        byebye();

    }

}