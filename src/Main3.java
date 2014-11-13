
import java.lang.*;
import java.util.*;
import java.io.*;


public class Main3 {

	public static void main (String args[]) {
				
		char palabra='T';
		String palabra2="ant";
		
		while (!palabra2.equalsIgnoreCase("T")){
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa la palabra depende de lo que quieras hacer: Ayuntamiento(A),EspacioPublico(E),Inmueble(I),Habitante(H),Partido(P) ?: ");
		palabra2 = sc.nextLine();
		palabra=palabra2.charAt(0);
		//palabra2 = sc.next().charAt(0);
		if ((palabra=='A') || (palabra=='E') || (palabra=='I') || (palabra=='H') || (palabra=='P')){		
		if (palabra=='A') {

			
		System.out.print("\nHAS ELEGIDO Ayuntamiento ");
System.out.print("\n-----------------------------------------------------------------------------------------");

		String localidad, alcalde;
		int año;
		Ayuntamiento ayuntamiento = new Ayuntamiento();

		System.out.print("\ningresa la localidad del ayuntamiento: ");
		localidad = sc.next();
		ayuntamiento.setLocalidad(localidad);
		System.out.print("\ningresa el año del ayuntamiento: ");
		año = sc.nextInt();
		ayuntamiento.setAño(año);
		System.out.print("\ningresa el alcalde del ayuntamiento: ");
		alcalde = sc.next();
		ayuntamiento.setAlcalde(alcalde);
		
		System.out.println("\nLocalidad: " + ayuntamiento.getLocalidad());
		System.out.println("\nAlcalde: " + ayuntamiento.getAlcalde());
		System.out.println("\nAño: " + ayuntamiento.getAño());


	}
		
	else if (palabra=='E'){

	System.out.print("\nHAS ELEGIDO EspacioPublico ");
System.out.print("\n***********************************************************************************");

		int metros;
		String nombreparcela;


		EspacioPublico espacio = new EspacioPublico();

		System.out.print("\ningresa los metros del Espacio Publico: ");
		metros = sc.nextInt();
		espacio.setMetros(metros);

		System.out.print("\ningresa el nombre del Espacio Publico: ");
		nombreparcela = sc.next();
		espacio.setNombreparcela(nombreparcela);
		
				
		System.out.println("\nDatos del ESPACIO PUBLICO " );
		System.out.println("\nNombre: " + espacio.getNombreparcela());
		System.out.println("\nTelefono: " + espacio.getMetros());

	

	}
	else if (palabra=='I'){

	System.out.print("\nHAS ELEGIDO Inmueble ");
System.out.print("\n***********************************************************************************");
		String localizacion;
		int metros;

		Inmueble inmueble = new Inmueble();
		
		System.out.print("\ningresa la localizacion del Espacio Publico: ");
		localizacion = sc.next();
		inmueble.setLocalizacion(localizacion);

		System.out.print("\ningresa los metros del Espacio Publico: ");
		metros = sc.nextInt();
		inmueble.setMetros(metros);

				
		System.out.println("\nDatos del INMUEBLE " );
		System.out.println("\nLocalizacion: " + inmueble.getLocalizacion());
		System.out.println("\nmetros: " + inmueble.getMetros());

	

	}
	else if (palabra=='H'){

	System.out.print("\nHAS ELEGIDO Habitante ");
	System.out.print("\n***********************************************************************************");

	String nombrefichero = "censo.txt";
	String ruta ="/home/zubiri/elecciones/javaprj/elecciones/src";
	ArrayList<Habitante> habitantes = new ArrayList<Habitante>();

	//Instanciamos el fichero donde estan los datos
	File archivo = new File(ruta, nombrefichero);
	Scanner s = null;
	try {
		// Leemos el contenido del fichero
		System.out.println("... Leemos el contenido del fichero ...");
		s = new Scanner(archivo);
		// Obtengo los datos de los partidos del fichero
		while (s.hasNextLine()){
			String linea = s.nextLine();	// Obtengo una linea del fichero un partido
			String [] cortarString = linea.split(" , ");		// Obtengo los datos del partido
			Habitante habitantese = new Habitante();	// Creo un objeto de la clase Partido

		// Pongo los atributos al objeto "Habitante"

		habitantese.setNombre(cortarString[0]);
		habitantese.setApellido1(cortarString[1]);
		habitantese.setApellido2(cortarString[2]);
		habitantese.setEdad(Integer.parseInt(cortarString[3]));
		habitantese.setDireccion(cortarString[4]);

		// Añadimos el objeto "Habitante" al ArrayList
		
		if (habitantese.getEdad()>=18){
		habitantes.add(habitantese);
		

		System.out.println("Nombre:" + habitantese.getNombre());
		System.out.println("Apellido1:" + habitantese.getApellido1());
		System.out.println("Apellido2:" + habitantese.getApellido2());
		System.out.println("Edad:" + habitantese.getEdad());
		System.out.println("Direccion:" + habitantese.getDireccion());
habitantes.clear();
		}

	}
	


	} 
catch (Exception e) {
		e.printStackTrace();
	} finally{
		try {
			if (s != null)
				s.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	}
	
	else if (palabra=='P'){

	System.out.print("\nHAS ELEGIDO Partido ");
System.out.print("\n***********************************************************************************");
System.out.print("\ningresa QUE QUIERES HACER: ESCRIBIR (E) O LEER (L) O VER DATOS(D) ");
		String p = sc.nextLine();
		char p2=p.charAt(0);
			if (p2=='E') {

			
		System.out.print("\nHAS ELEGIDO ESCRIBIR ");
System.out.print("\n---------------------------------------------------------");
	
	 PrintWriter salida = null;
        try {
            salida = new PrintWriter("/home/zubiri/javaprj/src/elecciones/listapartidos2.txt");
            String cadena;
            System.out.println("Escribe los nombres de los 5 partidos politicos. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);
                cadena = sc.nextLine();
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {         
            salida.close();
        }

}
		
	else if (p2=='L'){

	System.out.print("\nHAS ELEGIDO LEER ");
System.out.print("\n***************************************************");

String nombrefichero = "ListadoPartidos.txt";
String ruta ="/home/zubiri/javaprj/elecciones/src";
ArrayList<Partido> partidos = new ArrayList<Partido>();

//Instanciamos el fichero donde estan los datos
File archivo = new File(ruta, nombrefichero);
Scanner s = null;
try {
	// Leemos el contenido del fichero
	System.out.println("... Leemos el contenido del fichero ...");
	s = new Scanner(archivo);
	// Obtengo los datos de los partidos del fichero
	while (s.hasNextLine()){
		String linea = s.nextLine();	// Obtengo una linea del fichero un partido
		String [] cortarString = linea.split(" , ");		// Obtengo los datos del partido
		Partido partidose = new Partido();	// Creo un objeto de la clase Partido

		// Pongo los atributos al objeto "partido"
		partidose.setAñocreacion(Integer.parseInt(cortarString[0]));
		partidose.setPolitica(cortarString[1]);
		partidose.setLider(cortarString[2]);
		partidose.setNombre(cortarString[3]);



		// Añadimos el objeto "partido" al ArrayList
		partidos.add(partidose);
		
		System.out.println("Año creacion:" + partidose.getAñocreacion());
		System.out.println("Politica:" + partidose.getPolitica());
		System.out.println("Lider:" + partidose.getLider());
		System.out.println("Nombre:" + partidose.getNombre());


partidos.clear();
	}
	

	} 
catch (Exception e) {
		e.printStackTrace();
	} finally{
		try {
			if (s != null)
				s.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	}
			

/*	else if (p2=='D') {

		System.out.print("\nHAS ELEGIDO mirar los datos del PARTIDO ");
System.out.print("\n***********************************************************************************");

		
	}
*/	

	}
	}
	
	else 
	{
	System.out.print("\nHAS ELEGIDO EL terminar ");
	break;
	}
	}
	}
	
}
