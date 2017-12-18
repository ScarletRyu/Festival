import java.util.ArrayList;
import java.util.Iterator;

public class Festival {


private String nombre;
private String patrocinador;
private ArrayList<Actuacion> Actuaciones;







//Getters & Setters
public String getNombre() {
	return nombre;
}
public static void setNombre(String nombre) {
	nombre = nombre;
}
public String getPatrocinador() {
	return patrocinador;
}
public void setPatrocinador(String patrocinador) {
	this.patrocinador = patrocinador;
}
public ArrayList<Actuacion> getActuacion() {
	return Actuaciones;
}
public void setActuacion(ArrayList<Actuacion> actuacion) {
	Actuaciones = actuacion;
}

public void addActuacion (Actuacion a){
	this.Actuaciones.add(a);
}

public void addActuacion (String nombre, int duracion){
	Actuacion a = new Actuacion();
	a.setNombregrupo(nombre);
	a.setDuracion(duracion);
	
	this.Actuaciones.add(a);
}

public void mostrarInfo(){
	System.out.println(getNombre());
	System.out.println("------------");
	System.out.println("Patrocinado por " + "getPatrocinador");
	
	Iterator<Actuacion> i = Actuaciones.iterator();
	
	while(i.hasNext()){
		String infoActuacion = i.next().getInfo();
		System.out.println(infoActuacion);
		}
}



//Duracion 2
private int getduracion() {
	int duraciontotal = 0;
	Iterator<Actuacion> i = this.Actuaciones.iterator();
	
	
	return duraciontotal;
	
}




//Eliminar un grupo
public void eliminarActuacion(String grupo) {
	Iterator<Actuacion> i = Actuaciones.iterator();
	
	while(i.hasNext()){
		Actuacion a = i.next();
		if (a.getNombregrupo().equals(grupo) ) {
			i.remove();
		}
	}
}


//Modificar la duracion de una actuacion
public void cambiarDuracionActuacion(String Nombregrupo, int Duracion) {
	for(int i = 0; i < this.getActuacion().size(); i++){
		if(this.Actuaciones.get(i).getNombregrupo().equals(Nombregrupo));
		Actuacion a = this.Actuaciones.get(i);
		a.setDuracion(Duracion);
		this.Actuaciones.set(i, a);
		
	}
	
}

}

