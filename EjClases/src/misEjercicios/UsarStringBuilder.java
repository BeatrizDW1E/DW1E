package misEjercicios;

public class UsarStringBuilder 
{

	public static void main(String[] args) 
	{
		StringBuilder cadena= new StringBuilder ("Hoy es viernes");
		
		cadena.append("día 8");
		
		System.out.println(cadena);
		
		cadena.append(23.45);
		
		System.out.println(cadena);
		
		cadena.insert(20,";");
		
		System.out.println(cadena);
		
		
		cadena.insert(0,"Clase DW1E");
		
		
		System.out.println(cadena);
		
		System.out.println(cadena.reverse ());
		
		cadena.reverse();
		
		cadena.delete(24,cadena.length());

	}

}
