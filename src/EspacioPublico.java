import java.util.*;


public class EspacioPublico {


	int metros;

	String nombreparcela;

	public EspacioPublico(int metros, String nombreparcela){

	this.metros=metros;
	this.nombreparcela=nombreparcela;
	}

	public void setMetros(int metros){

	this.metros = metros;
	}

	public int getMetros()
	{
	return metros;
	}

	public void setNombreparcela(String nombreparcela){

	this.nombreparcela = nombreparcela;
	}

	public String getNombreparcela()
	{
	return nombreparcela;
	}
}



