public class StringPool {

	public static void main ( String[] args ) {
		String schachFigur = "Läufer";

		// Wiederverwendung aus dem String-Pool
		String zweiteFigur = "Läufer";		
	
		// keine Wiederverwendung, neues Objekt
		String dritteFigur = new String("Läufer");
	}

}

