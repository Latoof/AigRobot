public class Aiguille {

	public final static int MINUTES = 6;
	public final static int HEURES = 30;
	
	public int angle;
	public int size;
	public int pas;
	
	
	
	public Aiguille( int type ) {
		this.pas = type;
	}
	
	public Aiguille( int type, int angle ) {
		this.pas = type;
		this.angle = angle;
	}
	
	
	
	public void avancer() {
		this.angle += pas;
		
		if ( this.angle >= 360 ) {
			this.angle -= 360;
		}
	}
	
	
}
