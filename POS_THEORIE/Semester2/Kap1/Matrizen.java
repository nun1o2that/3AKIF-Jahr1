public class Matrizen {

    public static void main ( String[] args ) {

        int[][] adjazenzmatrix = new int[5][5];   
        adjazenzmatrix[0][0] = 2;
        adjazenzmatrix[0][1] = 6;
        adjazenzmatrix[0][2] = 4;
        adjazenzmatrix[0][3] = 1;
        adjazenzmatrix[0][4] = 7;

        System.out.println();

        for (int zeile = 0; zeile < adjazenzmatrix.length; zeile++) {

            for (int spalte = 0; spalte < adjazenzmatrix[zeile].length; spalte++) {
                System.out.print(adjazenzmatrix[zeile][spalte] + " ");
            }
            System.out.println();

        }

        System.out.println();

    }

}