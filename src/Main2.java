import java.util.*;
import java.io.*;
public class Main2 
{ 
    public static void main( String[] args )  throws IOException 
    { 

        Scanner sc = new Scanner( System.in ); 

        int contador=0;
        String file;
        char terminar='n';

        while (terminar!='s')
        {
        	
            System.out.print("elije un archivo de texto:");
            file = sc.next();

    
            System.out.println();
            

            FileReader fr = new FileReader(file); 
            

            char [] a = new char[50];
            fr.read(a);
            System.out.println(a);

            fr.close();
    
            System.out.println();
    
            System.out.print("para salir escriba s");
            System.out.println();
            
            terminar = (char)System.in.read();

        } 


            System.out.print("\nahora se mostraran en pantalla los archivos añadidos en un arraylist\n");

			BufferedReader br = new BufferedReader(new FileReader("ListadoPartidos.txt"));

			ArrayList <String> partidos = new ArrayList <String> ();


			String linea = br.readLine();
			while(linea != null)
			{
				//System.out.println(linea);
				partidos.add(linea);
				linea = br.readLine();
			}

			for(int i=0; i<partidos.size(); i++)
			{
				System.out.println(partidos.get(i));
			}

			// Vaciar el ArrayList
			partidos.clear();
			// Comprobamos que se haya vaciado
			System.out.println("\nVaciado correctamente. (" + partidos.size() + ")");





    }
}
