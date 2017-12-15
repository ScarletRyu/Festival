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


}

