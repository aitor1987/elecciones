import java.util.*;


public class Habitante {


    String nombre, apellido1, apellido2, direccion;
    int edad;
    public Habitante(String nombre,String apellido1,String apellido2,int edad ,String direccion){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;
        this.direccion=direccion;
    }


	public void setNombre(String nombre){

	this.nombre = nombre;
	}

	public String getNombre()
	{
	return nombre;
	}

	public void setApellido1(String apellido1){

	this.apellido1 = apellido1;
	}

	public String getApellido1()
	{
	return apellido1;
	}

	public void setApellido2(String apellido2){

	this.apellido2 = apellido2;
	}

	public String getApellido2()
	{
	return apellido2;
	}

	public void setEdad(int edad){

	this.edad = edad;
	}

	public int getEdad()
	{
	return edad;
	}

	public void setDireccion(String direccion){

	this.direccion = direccion;
	}

	public String getDireccion()
	{
	return direccion;
	}

}
