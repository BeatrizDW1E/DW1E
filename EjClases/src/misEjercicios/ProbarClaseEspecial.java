package misEjercicios;

public class ProbarClaseEspecial extends ClaseEspecial
{

	public static void main(String[] args) 
	{
		ProbarClaseEspecial obj= new ProbarClaseEspecial ();
		obj.impresion("Paula");		
		System.out.println(obj.devolver());

	}
	
	public ProbarClaseEspecial()
	{
		super("Pepe");
	}
	public void impresion (String z)
	{
		System.out.println(z); 
	}

}
