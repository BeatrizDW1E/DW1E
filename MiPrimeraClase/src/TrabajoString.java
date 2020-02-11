
public class TrabajoString 
{

	public static void main(String[] args)
	{
		String cadena1=new String ("Hoy es viernes");
		String cadena2=". Y mañana es sábado";
		String cadena3=".Bien!";
		
		System.out.println(cadena1.length()+" "+cadena1+cadena2);
		System.out.println(cadena1.concat(cadena2.concat(cadena3)));
	}

}
