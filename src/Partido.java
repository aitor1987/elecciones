import java.util.*;


public class Partido {


	int añocreacion;

	String politica, lider, nombre;

	public Partido(int añocreacion, String politica, String lider, String nombre){

	this.añocreacion=añocreacion;
	this.politica=politica;
	this.lider=lider;
	}

	public void setAñocreacion(int añocreacion){

	this.añocreacion = añocreacion;
	}

	public int getAñocreacion()
	{
	return añocreacion;
	}

	public void setPolitica(String politica){

	this.politica = politica;
	}

	public String getPolitica()
	{
	return politica;
	}

	public void setLider(String lider){

	this.lider = lider;
	}

	public String getLider()
	{
	return lider;
	}

	public void setNombre(String nombre){

	this.nombre = nombre;
	}

	public String getNombre()
	{
	return nombre;
	}
}

