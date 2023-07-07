import java.util.Scanner;
import java.lang.Math;

public class ScannerNext{

	public static void main ( String[] args ){
	
				String text1;
				String text2;

		Scanner myScanner = new Scanner(System.in);

		System.out.println("nextLine COMMAND");
		System.out.println("----------------");
		System.out.print("hey could you type in uhhh. poggers for me. right here right now. like exactly poggers. this is gonna decide your fate. -->  ");
			text1 = myScanner.nextLine();
			
					if (   text1.equals("poggers")   ) {

						System.out.println("poggers :thumbsup:");
					}

					else{

						System.out.println(". im gona kill you.");
					}




		System.out.println("\n" + "\n" + "|| operators SHIT");
		System.out.println("----------------");
		System.out.print("my favorite letters are. p. and e. and n. and u. and t. and s. could you type one of my favorite letters pls. -->  ");
			text2 = myScanner.nextLine();

					if (   (text2.equals("p")) || (text2.equals("e")) || (text2.equals("n")) || (text2.equals("u")) || (text2.equals("t")) || (text2.equals("s")) ) {

						System.out.println("\n" + "	join the dark brotherhood. you put the right passwor.d good.");
					}


					else if (   (text2.equals("P")) || (text2.equals("E")) || (text2.equals("N")) || (text2.equals("U")) || (text2.equals("T")) || (text2.equals("S")) ) {

						System.out.println("\n" + "	you heathen. we do not do the large letters here.");
					}


					else{
						System.out.println("\n" + "	:flushed_emoji:");
					}
	}
}