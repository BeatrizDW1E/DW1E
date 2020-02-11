package misEjercicios;

public abstract class ClaseEspecial //uno de los metodos tiene que ser abstracto
{
	private String nombre;
	
	public ClaseEspecial() {}
	public ClaseEspecial(String n)
	{
		nombre=n;
	}
	
	//metodo abstracto
	abstract public void impresion (String x);
	//no hace nada, se puede heredar, la clase que hereda va a tener que implementar obligatoriamente el metodo abstracto
	
	public String devolver ()
	{
		return nombre;
	}

}
