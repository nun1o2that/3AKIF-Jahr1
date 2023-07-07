public class Aufgabe_5{
	
	public static void main( String[] args ){
		
		int test = 5/2;
		double test2 = 5/2;
		System.out.println(test + "\n" + test2);
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Welche 4 logischen Operatoren gibt es in Java?");
		System.out.println("--------------------------------------------------------------------");
		
			System.out.println("\n" + " 	1. Konjunktion 'UND'" + "\n");
			System.out.println("	+ zweistelliges &&");
			System.out.println("	+ Aussage a&&b ist nur dann TRUE wenn ~beide~ Teilaussagen a & b wahr sind" + "\n");
			
				System.out.println("	a	b	a&&b");
				System.out.println("	--------------------");
				System.out.println("	0	0	 0");
				System.out.println("	0	1	 0");
				System.out.println("	1	0	 0");
				System.out.println("	1	1	 1");


System.out.println("\n" + "--------------------------------------------------------------------");

			System.out.println("\n" + " 	2. Disjunktion 'ODER'" + "\n");
			System.out.println("	+ zweistelliges ||");
			System.out.println("	+ Aussage a||b ist TRUE wenn ~eine~ der zwei Teilaussagen a & b wahr ist" + "\n");

				System.out.println("	a	b	a||b");
				System.out.println("	--------------------");
				System.out.println("	0	0	 0");
				System.out.println("	0	1	 1");
				System.out.println("	1	0	 1");
				System.out.println("	1	1	 1");


System.out.println("\n" + "--------------------------------------------------------------------");

			System.out.println("\n" + " 	3. Negation 'NICHT'" + "\n");
			System.out.println("	+ einstelliges !");
			System.out.println("	+ Aussage !a nimmt den genau ~entgegengesetzten~ Zustand von a ein" + "\n");

				System.out.println("	a	!a");
				System.out.println("	----------");
				System.out.println("	0	1");
				System.out.println("	1	0");


System.out.println("\n" + "--------------------------------------------------------------------");

			System.out.println("\n" + " 	4. XOR 'Exklusives ODER'" + "\n");
			System.out.println("	+ einstelliges ^");
			System.out.println("	+ Aussage a^b ist nur dann TRUE wenn beide Teilaussagen a & b ~unterschiedlich~ sind" + "\n");

				System.out.println("	a	b	a^b");
				System.out.println("	-------------------");
				System.out.println("	0	0	 0");
				System.out.println("	0	1	 1");
				System.out.println("	1	0	 1");
				System.out.println("	1	1	 0");


System.out.println("\n" + "--------------------------------------------------------------------");

		System.out.println("\n" + "	Unterschied zwischen zweistelligen &&, || und &, |");
		System.out.println("\n" + "	Recherche: So weit ich es verstanden habe, unterstuetzen && und");
			System.out.println("	|| Short-Circuit-Auswertungen, & und | NICHT" +  "\n");

System.out.println("--------------------------------------------------------------------");
		// //EINZELNE & UND | ERLAUBEN KEINE SHORT-CIRCUIT-AUSWERTUNG
			
		// boolean a = true;
		// boolean b = false;
		// boolean c = true;
		
		// System.out.println("\n" + "\n" + "\n" + "\n" + "----------------------------------------------");
		// System.out.println("  Programm zur Ausgabe der Wahrheitstabellen");
		// System.out.println("----------------------------------------------");
		
		// System.out.print("\n" + "a&b =	"); System.out.println(a&b);
	}
}