import java.util.LinkedHashMap;
import java.util.Random;
import java.util.regex.*;

public class SudokuNEW {
    
    LinkedHashMap<String, Integer> spielfeld;

    public SudokuNEW() {

        spielfeld = new LinkedHashMap<String, Integer>();

        fillZero();

        fillDiagonal(0, 0);
        fillDiagonal(3, 3);
        fillDiagonal(6, 6);

        // fillDiagonal(0, 6);
        // fillDiagonal(6, 0);

        printMap();

        fillRest2(0, 0);

    }

    public String getPosition(int l, int d) {
        String letters = "abcdefghi";
        return Character.toString(letters.charAt(l)) + d;
    }

    public int randomize() {
        Random rand = new Random();
        return rand.nextInt(1, 10);
    }

    public void fillZero() {
        String position = "";
        for (int digit = 0; digit <= 8; digit++) {
            for (int letter = 0; letter <= 8; letter++) {
                position = getPosition(letter, digit);
                spielfeld.put(position, 0);
            }
        }
    }

    public void fillDiagonal(int row, int column) {
        String position = "";
        int ranum;
        boolean valid;
 
        for (int digit = row; digit <= row + 2; digit++) {
            for (int letter = column; letter <= column + 2; letter++) {
                do {
                    ranum = randomize();
                    valid = isRowValid(digit, ranum) && isColumnValid(letter, ranum) && isSquareValid(digit, letter, ranum);
                } while (!valid);

                position = getPosition(letter, digit);
                spielfeld.put(position, ranum);
            }
        }

    }

    public void fillRest2(int digit, int letter) {
        String position = "";
        int iterate = 1;

        boolean validPosition;
        boolean validNumber;
        boolean diagonal;
        boolean filled = false;

        do {
            position = getPosition(letter, digit);

            validPosition = isRowValid(digit, iterate) && isColumnValid(letter, iterate) && isSquareValid(digit, letter, iterate);
            validNumber = iterate > spielfeld.get(position) && iterate <= 9;
            diagonal = Pattern.matches("[abc][012]", position) || Pattern.matches("[def][345]", position) || Pattern.matches("[ghi][678]", position);

            if (validPosition && validNumber) {
                spielfeld.put(position, iterate);
                filled = true;
            }
            if (letter == 8 && digit < 8 && filled) {
                fillRest2(digit + 1, 0);
            }
            if (diagonal && digit <= 8) {
                fillRest2(digit, letter + 1);
            }
            if (digit > 8 || letter > 8) {
                System.out.println("no more");
                break;
            }
            if (iterate > 9) {
                System.out.println("feck");
            }

            iterate++;

            System.out.println("\n" + iterate + " " + position + " " + " " + validPosition);

            printMap();

        } while (!validPosition && !validNumber);
        
    }

    public boolean isRowValid(int row, int ranum) {
        String position = "";
        boolean valid = true;
        for (int column = 0; column <= 8; column++) {
            position = getPosition(column, row);
            if (spielfeld.get(position) == ranum) {
                valid = false;
            }
        }
        return valid;
    } 

    public boolean isColumnValid(int column, int ranum) {
        String position = "";
        boolean valid = true;
        for (int row = 0; row <= 8; row++) {
            position = getPosition(column, row);
            if (spielfeld.get(position) == ranum) {
                valid = false;
            }
        }
        return valid;
    }

    public int boxOriginROW(int row) {
        switch (row % 3) {
            case 1: row -= 1; break;
            case 2: row -= 2; break;
        }
        return row;
    }

    public int boxOriginCOLUMN(int column) {
        switch (column % 3) {
            case 1: column -= 1; break;
            case 2: column -= 2; break;
        }
        return column;
    }

    public int fillRestOriginROW() {
        return 0;
    }

    public int fillRestOriginCOLUMN() {
        return 2;
    }

    public boolean isSquareValid(int row, int column, int ranum) {
        String position = "";
        boolean valid = true;
        
        row = boxOriginROW(row);
        column = boxOriginCOLUMN(column);
        
        for (int r = row; r <= row + 2; r++) {
            for (int c = column; c <= column + 2; c++) {
                position = getPosition(c, r);
                if (spielfeld.get(position) == ranum) {
                    valid = false;
                }
            }
        }

        return valid;
    }

    /**
    * Used to output the LinkedHashMap to console
    **/
    public void printMap() {
        String position = "";

        System.out.println("          a b c   d e f   g h i");
        System.out.println("        +-------+-------+-------+");

        for (int row = 0; row <= 8; row++) {

            System.out.print("      " + row + " | ");

            for (int column = 0; column <= 8; column++) {

                position = getPosition(column, row);
                System.out.print(spielfeld.get(position) + " ");

                if (column % 3 == 2) {
                    System.out.print("| ");
                }

            }

            System.out.println();
            if (row % 3 == 2) {
                System.out.println("        +-------+-------+-------+");
            }

        }

    }

}
