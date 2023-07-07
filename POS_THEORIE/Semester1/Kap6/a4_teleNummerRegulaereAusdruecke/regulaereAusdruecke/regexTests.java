import java.util.regex.*;

public class regexTests {

    // Erstelle regulaere Ausdruecke fuer eine gueltige E-Mail-Adresse und fuer Telefonnummern 
    // (z.B. 0664/1234567 und +43 677 1234567) und implementiere diese in Java 

    public static void main ( String[] args ) {

        Pattern mypattern = Pattern.compile(".xx.");
        Matcher mymatcher = mypattern.matcher("AAAsasaxxS");

        System.out.println("\n" + "Does it match? " + mymatcher.matches());


        //characters
        // [abc]         a, b or c
        // [^abc]        anything except a, b or c
        // [a-zA-Z]      A through Z or a through z inclusive (range)
        // [a-d[m-p]]    a through d or m through p (union)
        // [a-z&&[def]]  d, e or f (intersection)
        // [a-z&&[^bc]]  a through z except b or c (subtraction)
        // [a-z&&[^m-p]] a through z and not m through p (subtraction)
        System.out.println("\n" + "\"[xyz]\", \"xwbcd\"  " + Pattern.matches("[xyz]", "xwbcd")); //false
        System.out.println("\"[xyz]\", \"x\"  " + Pattern.matches("[xyz]", "x")); //true
        System.out.println("\"[xyz]\", \"xxxyyyzzz\"  " + Pattern.matches("[xyz]", "xxxyyyzzz")); //false

        //quantifiers
        // x?          x occurs once or not at all
        // x+          x occurs one or more than one times
        // x*          x occurs zero or more times
        // x{n}        x occurs n times only   
        // x{n,}       x occurs n or more times only
        System.out.println("\n" + "? quantifier...");
        System.out.println("\"[ayz]?\", \"a\"  " + Pattern.matches("[ayz]?", "a"));
        System.out.println("\"[ayz]?\", \"aaa\"  " + Pattern.matches("[ayz]?", "aaa"));
        System.out.println("\"[ayz]?\", \"ayyyyzz\"  " + Pattern.matches("[ayz]?", "ayyyyzz"));
        System.out.println("\"[ayz]?\", \"xwbcd\"  " + Pattern.matches("[ayz]?", "amnta"));
        System.out.println("\"[ayz]?\", \"xwbcd\"  " + Pattern.matches("[ayz]?", "ayz"));
        System.out.println("\"[ayz]?\", \"az\"  " + Pattern.matches("[ayz]?", "az"));

        System.out.println("\n" + "+ quantifier...");
        System.out.println("\"[ayz]+\", \"a\"  " + Pattern.matches("[ayz]+", "a"));
        System.out.println("\"[ayz]+\", \"aaa\"  " + Pattern.matches("[ayz]+", "aaa"));
        System.out.println("\"[ayz]+\", \"aayyyzz\"  " + Pattern.matches("[ayz]+", "aayyyzz"));
        System.out.println("\"[ayz]+\", \"aamnta\"  " + Pattern.matches("[ayz]+", "aamnta"));
        System.out.println("\"[ayz]+\", \"ayyyza\"  " + Pattern.matches("[ayz]+", "ayyyza"));

        //metacharacters    use with double backslash!
        // .        can be any character
        // d        represents any digits
        // D        represents any non-digit
        // s        represents any white-space
        // S        non white-space character
        // w        it can be a word character
        // W        it can be a word character
        // b        represents a word boundary
        // B        represents a non-word boundary
        System.out.println("\n" + "+ metacharacters...");
        System.out.println("\"D\", \"ayz\"  " + Pattern.matches("\\D", "ayz"));
        System.out.println("\"D\", \"m\"  " + Pattern.matches("\\D", "m"));
        System.out.println("\"D*\", \"ayz\"  " + Pattern.matches("\\D*", "ayz"));
        System.out.println("\"d\", \"1\"  " + Pattern.matches("\\d", "1"));
    }
}