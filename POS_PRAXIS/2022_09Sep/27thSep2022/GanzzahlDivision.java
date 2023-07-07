public class GanzzahlDivisionUndModulo{
	
  public static void main( String[] args ){
	 
	System.out.println("-----------------------");
	System.out.println("   GANZZAHLDIVISION");
	System.out.println("-----------------------" + "\n");
	
	System.out.println("ganzzahldivision: (1/2 + 1/2)");
    System.out.println("	Das Ergebnis ist: " + (1/2 + 1/2) + "\n");
	
	System.out.println("gleitpunktdivision: (1.0/2.0 + 1.0/2.0)");
	System.out.println("	Das Ergebnis ist: " + (1.0/2.0 + 1.0/2.0) + "\n" + "\n" + "\n" + "\n");
	
	
	
	
	
	System.out.println("-----------------------");
	System.out.println("    MODULO-OPERATOR");
	System.out.println("-----------------------" + "\n");
	
	
	int quotient, rest;

    quotient  =  17 / 3;
    rest =  17 % 3;
	System.out.println("quotient = 17/3");
	System.out.println("rest = 17%3" + "\n");
    System.out.println("	Der Quotient : " + quotient );
    System.out.println("	Der Rest: " + rest );
    System.out.println("	Das Original : " + (quotient*3 + rest) );
  }
}