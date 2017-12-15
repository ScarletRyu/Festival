
public class Actuacion {

	
private String nombregrupo;
private int duracion;
		
		
		
		
		
		
		
		
		
//Getters & Setters
public String getNombregrupo() {
	return nombregrupo;
}
public void setNombregrupo(String nombregrupo) {
	this.nombregrupo = nombregrupo;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
	
public String getInfo(){
	String info = this.getNombregrupo() + " : " + this.getDuracion();
	return info;
}

}
