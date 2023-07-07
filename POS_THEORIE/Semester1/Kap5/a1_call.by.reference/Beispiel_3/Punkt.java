public class Punkt {
	public int x, y;

	public Punkt() {}               //constructor without parameters or anything in it?

	public Punkt(int x, int y) {    //constructor with parameters and this.x/y to make sure variables in method and attributes dont get confused
		this.x = x;
		this.y = y;
	}
	
	public void setLocation(int x, int y) { 
		this.x = x;
		this.y = y;
	}

    public static void changeReference( Punkt p ) {
		p = new Punkt();
    }


    public static void main( String[] args ) {
        Punkt a = new Punkt( 15, 23 );		// Koordinaten gesetzt (x=15,y=23)
        changeReference( a );
        System.out.println( a.x );				   //15
    }

}