import java.util.*;


public class Ayuntamiento {


	int año;

	String localidad, alcalde;

	public Ayuntamiento(int año, String localidad, String alcalde){

	this.año=año;
	this.localidad=localidad;
	this.alcalde=alcalde;

	}

	public void setAño(int año){

	this.año = año;
	}

	public int getAño()
	{
	return año;
	}

	public void setLocalidad(String localidad){

	this.localidad = localidad;
	}

	public String getLocalidad()
	{
	return localidad;
	}

	public void setAlcalde(String alcalde){

	this.alcalde = alcalde;
	}

	public String getAlcalde()
	{
	return alcalde;
	}


}

