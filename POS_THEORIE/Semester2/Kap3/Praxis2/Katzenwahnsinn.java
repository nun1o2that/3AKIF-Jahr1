public class Katzenwahnsinn {

	private static void machKatzen(int anzahl) {
		String name = "Katze";
		for(int i=0; i<anzahl; i++) {
			// Katze katze = new Katze("Katze" + i);	/* jeder String neu, mehr Speicherverbrauch */
			Katze katze = new Katze("Katze");		/* Verwendung des String-Pools, viel weniger Speicherverbrauch */
		}
	}
	
	private static void warten(long millisekunden) {
		try {
			Thread.sleep(millisekunden);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

    public static void main ( String[] args ) {
		for(int i=0; i<4; i++) {
			machKatzen(1000000);
			warten(5000);
		}
	}

}
