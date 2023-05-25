import java.util.*;
import java.util.regex.*;
 
/**
* Main class of the Sudoku Game
* 81 Strings with values 1-9 are saved in a HashMap, with corresponding keys in String-form going from -a1- to -i9- (see format at end of program)
* Has Methods for filling / printing the HashMaps, user-inputs to change values, ...
**/
public class SudokuGame {

    private LinkedHashMap<String, String> SM;
    boolean endGame;
    boolean playAgain;

    /**
    * Constructor of the class SudokuGame
    * Initializes the HashMap SM, and calls coolmethod(0), which is used to fill the HashMap with 81 keys and corresponding values
    **/
    public SudokuGame() {
        SM = new LinkedHashMap<String, String>();
        endGame = false;
        playAgain = false;
        fillMap(true);
        fillMap(false);
    }

    /**
    * Used to fill the HashMap
    * @param option determines, whether the HashMap gets filled, or printed
    * 0 - fill. coolmethod(0) is only called once, in the constructor of this class
    * 1 - print. coolmethod(1) is called at every repeat of the game loop afterward 
    **/
    public void fillMap(boolean firstBoot) {
        int linecounter = 1;
        int lettercounter = 0;
        String letters = "abcdefghi";
        String result = "";

        // main loop for filling the HashMap - this outer loop handles line-breaks after each finished line and variable-resets for the inner loop
        do {

            // loop for targeting and working with the CONTENT of each line - this inner loop handles the actual filling and printing of each value
            while (lettercounter <= 8) {
                result += Character.toString(letters.charAt(lettercounter));
                result += Integer.toString(linecounter);

                if (firstBoot) {
                    SM.put(result, " ");
                }
                else if (!firstBoot) {
                    System.out.println("KEY: " + result);
                    SM.put(result, valueGeneration(result));
                }

                // resets & increments for the inner loop
                result = "";
                lettercounter++;

            // END OF INNER LOOP
            }

            // resets & increments for the outer loop
            linecounter++;
            lettercounter = 0;

        // END OF OUTER LOOP LOOP
        } while (linecounter <= 9);   

        if (!firstBoot) {
            randomDeletion();    
        }

    } 

    /**
    * Used to output the HashMap to console
    **/
    public void printMap() {
        int linecounter = 1;
        int lettercounter = 0;
        String letters = "abcdefghi";
        String result = "";

        System.out.println("                 a b c   d e f   g h i");
        System.out.println("               +-------+-------+-------+");

        // main loop for filling / printing the HashMap - this outer loop handles line-breaks after each finished line and variable-resets for the inner loop
        do {

            // between lines 3-4 and 6-7 a horizontal line is printed
            if (linecounter == 4 || linecounter == 7) {
                System.out.println("               +-------+-------+-------+");
            }
            // at the start of each line, the corresponding line number is printed, with the left-side border after
            System.out.print("             " + linecounter + " | ");

            // loop for targeting and working with the CONTENT of each line - this inner loop handles the actual filling and printing of each value
            while (lettercounter <= 8) {
                result += Character.toString(letters.charAt(lettercounter));
                result += Integer.toString(linecounter);
    
                // between columns 3-4 and 6-7 a vertical line is printed
                if (lettercounter == 3 || lettercounter == 6) {
                    System.out.print("| ");
                }

                // if there's nothing saved in the current value, add an extra space
                if (SM.get(result) == null) {
                    System.out.println("  ");
                }
                // if there IS something saved, print the value with 1 space
                else {
                    System.out.print(SM.get(result) + " ");
                }

                // resets & increments for the inner loop
                result = "";
                lettercounter++;

            // END OF INNER LOOP
            }

            // resets & increments for the outer loop
            linecounter++;
            lettercounter = 0;

            // at the end of each line, print the border on the right side
            System.out.println("|");

        // END OF OUTER LOOP LOOP
        } while (linecounter <= 9);

        // printing the bottom horizontal line of the border
        System.out.println("               +-------+-------+-------+");

    }



    /**
    * Randomly generates a number 1-9 and checks if it can be set as the value of the current key
    * @param key Key of the HashMap, current call of method generates a value for this key 
    **/
    public String valueGeneration(String key) {

        Random rand = new Random();
        String randomized;
        int randomCounter = 1;

        boolean validInCurrentLINE;
        boolean validInCurrentCOLUMN;
        boolean validInCurrentSQUARE;

        do {

            if ( Pattern.matches("[a-i][2-9]", key) ) {
                randomized = Integer.toString(randomCounter); 
            }
            else {
                randomized = Integer.toString(rand.nextInt(1, 10));
            }

            validInCurrentLINE = LINECheck(key, randomized);
            validInCurrentCOLUMN = COLUMNCheck(key, randomized);
            validInCurrentSQUARE = SQUARECheck(key, randomized);
            printMap();

            randomCounter++;
            if (randomCounter == 10) {
                randomCounter = 1;
            }

        } while( !(validInCurrentLINE && validInCurrentCOLUMN && validInCurrentSQUARE) );

        System.out.println(randomized);
        return randomized;

    }

    public boolean LINECheck(String key, String randomized) {
        String letters = "abcdefghi";
        String LINE;
        String COLUMN; 
        String result = "";

        boolean valid = true;

        // CHECKING IF THE LINE THE KEY IS IN ALREADY HAS THE RANDOMIZED VALUE 
        for (int i = 0; i < 9; i++) {
            // e.g  a1
            COLUMN = Character.toString(letters.charAt(i));  // "abcdefghi" 
            LINE = Character.toString(key.charAt(1));        // a1 -> 1
            result = COLUMN + LINE;

            if (SM.get(result).equals(randomized)) {
                valid = false;
            }

        }
        System.out.println(key + " " + randomized + " " + "validInCurrentLINE: " + valid);
        return valid;
    }


    public boolean COLUMNCheck(String key, String randomized) {
        String letters = "abcdefghi";
        String LINE;
        String COLUMN; 
        String result = "";
        
        boolean valid = true;
        
        // CHECKING IF THE COLUMN THE KEY IS IN ALREADY HAS THE RANDOMIZED VALUE
        for (int i = 1; i <= 9; i++) {
            COLUMN = Character.toString(key.charAt(0));
            LINE = Integer.toString(i);
            result = COLUMN + LINE;

            if (SM.get(result).equals(randomized)) {
                valid = false;
            }
        }
        System.out.println(key + " " + randomized + " " + "validInCurrentCOLUMN: " + valid);
        return valid;
    }

    public boolean SQUARECheck(String key, String randomized) {
        String letters = "abcdefghi";
        String LINE;
        String COLUMN; 
        String result = "";
        int square = 0;

        boolean valid = true;
        
        // CHECKING IF THE SQUARE THE KEY IS IN ALREADY HAS THE RANDOMIZED VALUE
        COLUMN = Character.toString(key.charAt(0));
        LINE = Character.toString(key.charAt(1));
        result = COLUMN + LINE;

        // if ( ( COLUMN.equals("a") || COLUMN.equals("b") || COLUMN.equals("c") ) && ( Integer.valueOf(LINE) >= 1 && Integer.valueOf(LINE) <= 3 ) ) {
        //     square = 1;
        // }
        // else if ( ( COLUMN.equals("d") || COLUMN.equals("e") || COLUMN.equals("f") ) && ( Integer.valueOf(LINE) >= 1 && Integer.valueOf(LINE) <= 3 ) ) {
        //     square = 2;
        // }
        // else if ( ( COLUMN.equals("g") || COLUMN.equals("h") || COLUMN.equals("i") ) && ( Integer.valueOf(LINE) >= 1 && Integer.valueOf(LINE) <= 3 ) ) {
        //     square = 3;
        // }
        // else if ( ( COLUMN.equals("a") || COLUMN.equals("b") || COLUMN.equals("c") ) && ( Integer.valueOf(LINE) >= 4 && Integer.valueOf(LINE) <= 6 ) ) {
        //     square = 4;
        // }
        // else if ( ( COLUMN.equals("d") || COLUMN.equals("e") || COLUMN.equals("f") ) && ( Integer.valueOf(LINE) >= 4 && Integer.valueOf(LINE) <= 6 ) ) {
        //     square = 5;
        // }
        // else if ( ( COLUMN.equals("g") || COLUMN.equals("h") || COLUMN.equals("i") ) && ( Integer.valueOf(LINE) >= 4 && Integer.valueOf(LINE) <= 6 ) ) {
        //     square = 6;
        // }
        // else if ( ( COLUMN.equals("a") || COLUMN.equals("b") || COLUMN.equals("c") ) && ( Integer.valueOf(LINE) >= 7 && Integer.valueOf(LINE) <= 9 ) ) {
        //     square = 7;
        // }
        // else if ( ( COLUMN.equals("d") || COLUMN.equals("e") || COLUMN.equals("f") ) && ( Integer.valueOf(LINE) >= 7 && Integer.valueOf(LINE) <= 9 ) ) {
        //     square = 8;
        // }
        // else if ( ( COLUMN.equals("g") || COLUMN.equals("h") || COLUMN.equals("i") ) && ( Integer.valueOf(LINE) >= 7 && Integer.valueOf(LINE) <= 9 ) ) {
        //     square = 9;
        // }

        // int x = 1;
        // for (String y : SM.keySet()) {
        //     System.out.print(y + " ");
        //     x++;
        
        //     if (x == 10) {
        //         System.out.println();
        //         x = 1;
        //     }
        // }


        if ( Pattern.matches("[a-c][1-3]", key) ) {
            square = 1;
        }
        else if ( Pattern.matches("[d-f][1-3]", key) ) {
            square = 2;
        }
        else if ( Pattern.matches("[g-i][1-3]", key) ) {
            square = 3;
        }
        else if ( Pattern.matches("[a-c][4-6]", key) ) {
            square = 4;
        }
        else if ( Pattern.matches("[d-f][4-6]", key) ) {
            square = 5;
        }
        else if ( Pattern.matches("[g-i][4-6]", key) ) {
            square = 6;
        }
        else if ( Pattern.matches("[a-c][7-9]", key) ) {
            square = 7;
        }
        else if ( Pattern.matches("[d-f][7-9]", key) ) {
            square = 8;
        }
        else if ( Pattern.matches("[g-i][7-9]", key) ) {
            square = 9;
        }
        
        return SQUAREFackYou(square, randomized);
    }

  public boolean SQUAREFackYou(int square, String randomized) {
        String letters = "abcdefghi";
        String LINE;
        String COLUMN; 
        String result = "";
        // a b c d e f g h i 
        // 0 1 2 3 4 5 6 7 8 
        result = "";
        System.out.println("square: " + square + "  ");
        int y1 = 0;
        int y2 = 0;
        boolean valid = true;

        if (square == 1 || square == 2 || square == 3) {

            switch(square) {
                case 1: y1 = 0; y2 = 2; break;
                case 2: y1 = 3; y2 = 5; break;
                case 3: y1 = 6; y2 = 8; break;
            }

            // handles each LINE
            for (int x = 1; x <= 3; x++) {
            
                LINE = Integer.toString(x);

                // handles COLUMNS of current line
                for (int y = y1; y <= y2; y++) {
                    
                    COLUMN = Character.toString(letters.charAt(y));
                    result = COLUMN + LINE;

                    if (SM.get(result).equals(randomized)) {
                        valid = false;
                    } 

                }
                System.out.print(result + " ");
                System.out.print("Line: " + x + "  ");

            }

        }

        else if (square == 4 || square == 5 || square == 6) {

            switch(square) {
                case 4: y1 = 0; y2 = 2; break;
                case 5: y1 = 3; y2 = 5; break;
                case 6: y1 = 6; y2 = 8; break;
            }

            // handles each LINE
            for (int x = 4; x <= 6; x++) {
            
                LINE = Integer.toString(x);

                // handles COLUMNS of current line
                for (int y = y1; y <= y2; y++) {
                    
                    COLUMN = Character.toString(letters.charAt(y));
                    result = COLUMN + LINE;

                    if (SM.get(result).equals(randomized)) {
                        valid = false;
                    } 

                }
                System.out.print(result + " ");
                System.out.print("Line: " + x + "  ");

            }

        }

        else if (square == 7 || square == 8 || square == 9) {

            switch(square) {
                case 7: y1 = 0; y2 = 2; break;
                case 8: y1 = 3; y2 = 5; break;
                case 9: y1 = 6; y2 = 8; break;
            }

            // handles each LINE
            for (int x = 7; x <= 9; x++) {
            
                LINE = Integer.toString(x);

                // handles COLUMNS of current line
                for (int y = y1; y <= y2; y++) {
                    
                    COLUMN = Character.toString(letters.charAt(y));
                    result = COLUMN + LINE;

                    if (SM.get(result).equals(randomized)) {
                        valid = false;
                    } 

                }
                System.out.print(result + " ");
                System.out.print("Line: " + x + "  ");

            }

        }

        System.out.println(randomized + " " + "validInCurrentSQUARE: " + valid + "\n");

        return valid;
    }  




    /**
    * Method used to complete the setup-process
    * The player chooses the difficulty, depending on which, different amounts of values are deleted from the HashMap, resulting in a grid the player can fill
    * 1 - Easy: 26 values are deleted
    * 2 - Intermediate: 46 values are deleted
    * 3 - Difficult: 51 values are deleted
    **/
    public void randomDeletion() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String difficulty; 
        int deleteCounter = 0;
        int DELETE;

        System.out.println("******************************************************");
        System.out.println("                  DIFFICULTY SETTINGS");
        System.out.println("                  1 - Easy");
        System.out.println("                  2 - Intermediate");
        System.out.println("                  3 - Difficult");
        System.out.println("******************************************************");
        
        do {
            System.out.print("Which difficulty? ");
            difficulty = scan.next();
            if ( !Pattern.matches("[1-3]", difficulty) ) {
                System.out.println("Invalid Input! Try again." + "\n");
            }
        } while ( !Pattern.matches("[1-3]", difficulty) );
        System.out.println();

        deleteCounter = Integer.valueOf(difficulty);

        switch(deleteCounter) {
            case 1: deleteCounter = 30; break;  // Easy
            case 2: deleteCounter = 45; break;  // Intermediate
            case 3: deleteCounter = 60; break;  // Difficult
        }

        do { 
            //it's randomly decided whether or not the current value is deleted
            for (String i : SM.keySet()) {
                DELETE = rand.nextInt(0, 40);
                if (DELETE < 20 && deleteCounter > 0) {
                    SM.put(i, " ");
                    deleteCounter--;
                }
            }
        } while(deleteCounter > 0);

    }

    /**
    * Method for inputting a key for the HashMap and a number to be put as the corresponding value of that key
    * Calls inputcheck() after inputs are made
    **/
    public void input() {
        Scanner scan = new Scanner(System.in);
        String userKey;
        String userNumber;

        System.out.print("Change which field? / Q to end the current game. ");
            userKey = scan.next();
        if (userKey.toLowerCase().equals("q")) {
            endGame = true;
            sendBack();
        }
        else {
            System.out.print("Which number? ");
            userNumber = scan.next();

            System.out.println();
            inputcheck(userKey, userNumber);
        }
    }

    /**
    * Method for the checking previously entered values for validity using simple regular expressions
    * Called from input()
    * In the case of invalidity, the user is sent back to input() to enter values again
    * @param userKey Key for the HashMap
    * @param userNumber Number to be placed at the specified key
    **/
    public void inputcheck(String userKey, String userNumber) {

        if ( Pattern.matches("[a-iA-I][1-9]", userKey) && Pattern.matches("[1-9]", userNumber) ) {
            SM.put(userKey.toLowerCase(), userNumber);
        }
        else {
            System.out.println("Invalid Input! Try again.");
            input();
        }
        
    }

    /**
    * Called when the user enters "q" in input()
    * User is sent back to class Main
    **/
    public void sendBack() {
        Scanner scan = new Scanner(System.in);
        String user;

        System.out.println("\n" + "******************************************************");
        
        do {
            System.out.print(" Play Again? [0 = no, 1 = yes]: ");
                user = scan.next();
            if ( !Pattern.matches("[01]", user) ) {
                System.out.println("Invalid Input! Try again." + "\n");
            }
        } while ( !Pattern.matches("[01]", user) );

        System.out.println("******************************************************" + "\n" + "\n");

        if (user.equals("1")) {
            playAgain = true;
        } 
        else if (user.equals("0")) {
            playAgain = false;
        }

    }

    /**
    * Called by the Main-class's INNER loop
    *
    **/
    public boolean returnEndGame() {
        return endGame;
    }

    /**
    * Called by the Main-class's OUTER loop
    * @return playAgain;
    **/
    public boolean returnPlayAgain() {
        return playAgain;
    }
        
}

    // Format:                                      Squares:

    //  a1  b1  c1 | d1  e1  f1 | g1  h1  i1                           |           |   
    //  a2  b2  c2 | d2  e2  f2 | g2  h2  i2                     1     |     2     |     3      
    //  a3  b3  c3 | d3  e3  f3 | g3  h3  i3                           |           |
    // ------------+------------+------------               -----------+-----------+-----------
    //  a4  b4  c4 | d4  e4  f4 | g4  h4  i4                           |           |
    //  a5  b5  c5 | d5  e5  f5 | g5  h5  i5                     4     |     5     |     6
    //  a6  b6  c6 | d6  e6  f6 | g6  h6  i6                           |           |
    // ------------+------------+------------               -----------+-----------+-----------
    //  a7  b7  c7 | d7  e7  f7 | g7  h7  i7                           |           |
    //  a8  b8  c8 | d8  e8  f8 | g8  h8  i8                     7     |     8     |     9
    //  a9  b9  c9 | d9  e9  f9 | g9  h9  i9                           |           |