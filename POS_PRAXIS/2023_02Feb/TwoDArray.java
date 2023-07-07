public class TwoDArray {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
 
        int[][] array = new int[rows][columns];
 
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }
 
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] < 10) {
                    System.out.print(array[i][j] + "  ");
                }
                else if (array[i][j] > 9) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}