public class Punkt {
	public int x, y;

	public Punkt() {}               //constructor w/o parameters or anything in it?

	public Punkt(int x, int y) {    //constructor w. parameters and this.x/y to make sure variables in method and class itself (attributes) dont get confused
		this.x = x;
		this.y = y;
	}
	
	public void setLocation(int x, int y) { 
		this.x = x;
		this.y = y;
	}


    public static void main( String[] args ) {
        Punkt a = new Punkt();
        Punkt b = a;
        a.x = 10;
        System.out.println( b.x );            // output: 10
        b.y = 5;
        System.out.println( a.y );            // output: 5
    }

}
