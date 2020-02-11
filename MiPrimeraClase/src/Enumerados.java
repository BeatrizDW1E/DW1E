
public class Enumerados 
{
	public enum Personas{María,Jesús,Diego,José,Bea}
	

	
	
	
	public static void main(String[] args) 
	{
		String nombre=String.valueOf(Personas.María);
		System.out.println(nombre+"\n'Hola'");
		
		
		int i=2;
		//int j=i++; // Primero asigno valor de i a j. Luego incremento i.
		
		int j=++i; //Primero incremento i y luego se lo asigno a j.
		
		
        i=i+20;
		
		//i+=20; Es lo mismo que la línea de arriba.
		System.out.println("Jota: "+j+" i: "+i);
		
		int num=20;
		int numDespla=num<<3;
		int numDesplaz=num>>2;
		
		System.out.println(num+" "+numDespla+" "+numDesplaz);
		
	}

}
