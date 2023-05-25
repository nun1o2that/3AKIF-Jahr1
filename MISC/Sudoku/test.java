public class test {
    
    public static void main ( String[] args ) {

        int row = 1;
        int column = 2;

        System.out.println(row);
        System.out.println(column);

        switch (row % 3) {
            case 1: row -= 1; break;
            case 2: row -= 2; break;
        }

        switch (column % 3) {
            case 1: column -= 1; break;
            case 2: column -= 2; break;
        }

        System.out.println("\n" + row);
        System.out.println(column);




        System.out.println("BLEHHH");

        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 3 && counter != 3) {
                i = 0;
                counter++;
            }
            System.out.println(i);
        }

    }

}
