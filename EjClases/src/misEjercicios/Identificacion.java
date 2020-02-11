package misEjercicios;

import clasesUtiles.IdentificacionPersona;

public class Identificacion extends IdentificacionPersona
{
	public Identificacion(String nomb, int id, String acceso)
	{
		super (nomb,id,acceso);
	}
	public Identificacion(String nomb)
	{
		super(nomb);
	}

	public static void main(String[] args) 
	{
		Identificacion obj=new Identificacion ("Pascuala",100,"Top");
		System.out.println("Nombre: "+obj.getNombre());
		System.out.println("Id: "+obj.getId());
		System.out.println("Acceso: "+obj.getAcceso());
	

	}

}
