public class OutOfMemoryError {
    
    public static void main ( String[] args ) {

        int s = 1000;
        long c = 0;
        int[][][] a = new int[s][s][s];
                
        for (int x = 0; x < s; x++) {
            for (int y = 0; y < s; y++) {
                for (int z = 0; z < s; z++) {
                    a[x][y][z] = 1;
                    c++;
                }
            }
        }		
        
        System.out.println(c); // Anzahl Elemente

    }

}
