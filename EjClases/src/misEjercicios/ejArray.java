package misEjercicios;

public class ejArray {

	public static void main(String[] args) 
	{
		int array[]=new int [50];
		int primero=202;
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=primero;
			primero+=2;
		}
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		
		
		System.out.println("****************************");
		
		System.out.println("Elemento 26: "+array[25]);
		
		System.out.println(array.length);
		
		
		
		}
		

	}


