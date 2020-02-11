import java.util.Random;

import java.io.IOException;
public class NumeroAleatorio 
{

	public static void main(String[] args) throws IOException
	{
		int v;
		Random numAleatorio=new Random(System.currentTimeMillis());
		
		
		
		
		do
		{
			v=15+numAleatorio.nextInt(106);
			System.out.println(v);
		}while (v!=32);
		System.out.println("Lo último:  "+v);
		
		switch(v)
		{
		case 1: case 2: case 3:
			System.out.println(v);
			break;
		default:
		    v+=8;
		}

	}

}
