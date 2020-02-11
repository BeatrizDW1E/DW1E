
public class opreaciones {
	
	public static void mayorMenor ()
	{
		//Definimos las variables que vamos a utilizar
		int a = 13;
		a = 18;//Reemplaza el valor anterior de a
		a = 8;//Reemplaza el valor anterior de a
		int b= 10;
		boolean ejemplo = a > b;
		
		
		 if(ejemplo) //Si condicion entonces
	
	{
		System.out.println ("El primero es mayor" +a); //Escribir "Texto" +variable
	}
	else
	{
		System.out.println("El segundo es mayor" +b); //println escribe un texto y hace un salto de línea
	}
	
	}//Fin del metodo mayorMenor

	public static void tablaMultiplicar()
	{
		int n = 13;
		int contador = 1;
		int resultado = 0;
		
		
		while (contador <= 10);
		{
		
			resultado = n*contador;
			System.out.println(resultado);
			contador++;
		}
	}
	public static void main(String[] args) 
	{
	//	System.out.println("Esta clase promete :)");
		//mayorMenor ();
		tablaMultiplicar();
		}

}
