import java.util.*;

public class Main 
{

	public static void main (String args[]) 
	{

String opcion;

Scanner sc = new Scanner(System.in);

		System.out.println("\nEn que clase quieres introducir los datos?");
		System.out.println("\nEscribe (ayuntamiento), (terminar)");
opcion = sc.next();

		while(opcion!="ayuntamiento"&&opcion!="terminar"){

			System.out.println("\nNo has seleccionado ninguna de las opciones dadas ");
			System.out.println("\nPrueba otra vez...");
		}

		if(opcion=="ayuntamiento") 
		{

	int año;
	String alcalde;
	String localidad;


	System.out.println("\nIngresa el año del ayuntamiento");
	año = sc.nextInt();

	System.out.println("\nIngresa el alcalde del ayuntamiento");
	alcalde = sc.next();

	System.out.println("\nIngresa la localidad del ayuntamiento");
	localidad = sc.next();

	Ayuntamiento ayunta  = new Ayuntamiento(año, alcalde, localidad);

	ayunta.setAño(año);
	System.out.println("\nLos datos del ayuntamiento son los siguientes: " + ayunta.getAño() +" ," + ayunta.getAlcalde() + " ," + ayunta.getLocalidad());

		}





		if(opcion=="terminar") 
		{

			System.out.println("\nHas seleccionado terminar, hasta otra");
		 }

	}
}


