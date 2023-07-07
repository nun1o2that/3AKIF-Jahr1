import java.util.Random;

public class ZweiDimensional {

    private int[][] matrix;

    public ZweiDimensional() {
        matrix = new int[10][10];
    }

    public void fuellen() {

        Random rand = new Random();

        for (int row = 0; row < 10; row++) {

            for (int column = 0; column < 10; column++) {
                matrix[row][column] = rand.nextInt(10);
            }

        }

    }

    public void ausgeben() {

        System.out.println();
        for (int row = 0; row < 10; row++) {

            for (int column = 0; column < 10; column++) {
                System.out.print(matrix[row][column] + " ");
                switch (column) { case 9: System.out.println(); }
            }

        }

    }

}