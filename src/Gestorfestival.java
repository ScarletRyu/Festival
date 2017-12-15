import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestorfestival {

	public static void main(String[] args) {
		////Crear actuación por programacion
		
		Actuacion a1 = new Actuacion();
		a1.setNombregrupo("AC/DC");
		a1.setDuracion(90);
		
		
		
		
		
		//Crear actuación con inputs del teclado
		Scanner scan = new Scanner(System.in);
		Actuacion a2 = new Actuacion();
		System.out.println("Introduce nombre del grupo");
		a2.setNombregrupo(scan.nextLine());
		
		System.out.println("Introduce duracion de la actuacion");
		a2.setDuracion(scan.nextInt());
		
		
		
		
	   //Crear actuación leyendo desde fichero
		File fichero1 = new File("D:/Ficheros");
		Scanner scan2 = null;
		try {
			scan2 = new Scanner(fichero1);
			
	
	}catch(FileNotFoundException e) {
		
	e.printStackTrace();
	}

	String linea = scan2.nextLine();
	String[] partes = linea.split(";");
		
	Actuacion a3 = new Actuacion();
	a3.setNombregrupo(partes[0]);
	a3.setDuracion(Integer.parseInt(partes[1]));
	
	
	

	
	//Crear un festival por programacion con 3 actuaciones
	Festival festival = new Festival();
	festival.setNombre ("Jazzaldia");
	festival.setPatrocinador ("Heineken");
		
		ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();
		actuaciones.add(a1);
		actuaciones.add(a2);
		actuaciones.add(a3);
		
		festival.setActuacion(actuaciones);
		
		Actuacion a4 = new Actuacion();
		a4.setNombregrupo("Mikel laboa");
		a4.setDuracion(80);
		
		festival.addActuacion(a4);
		
		festival.addActuacion("Linkin Park", 95);
		
		festival.mostrarInfo();
}
	
}

