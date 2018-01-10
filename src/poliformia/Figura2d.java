package poliformia;

public abstract class Figura2d extends Figura {

	private int colorRelleno;
	
	//Constructor
	public Figura2d(int color, int colorRelleno) {
		
	super(color);
	this.colorRelleno=colorRelleno;
	}
	
	
	
	//Cambiar color relleno
	public void cambiaRelleno(int color) {
		colorRelleno=color;
	}
}
