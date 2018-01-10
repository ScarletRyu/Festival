package poliformia;

public abstract class Figura {
	
	private int color;
	
	
	//Constructor
	
	public Figura(int color) {
		 this.color=color;
	}


	//Cambiar color de la figura
	public void cambiaColor(int color) {
		this.color=color;
	}
	
	//Borrar la figura
	public abstract void borrar();
	
	
	//Dibujar la figura
	public abstract void dibujar();
	
	
	
	
	
	
	
	
	
}
