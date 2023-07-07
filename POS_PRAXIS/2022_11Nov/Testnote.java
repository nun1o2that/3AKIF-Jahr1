public class Testnote {

    public static String noteUndSo(int testnote) {
        if (testnote > 4) {
            return "Cause of Death: Schol";
        }
        else{
            return "Cause of Live: You r poggers :)";
        }
    }

    public static void main ( String[] args ) {

        String yourFate;

        yourFate = noteUndSo(3);

        System.out.println(yourFate);
    }

}