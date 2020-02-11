package misEjercicios;

public class Matrices123Dimensiones {

	public static void main(String[] args) 
	{
		//1 DIMENSIÓN

		int unaD[]= new int[5]; //dimension del array
		 
		for (int i=0;i<unaD.length;i++)
			unaD[i]=i*5;
		for(int v: unaD)
			System.out.println(v);
		//2 DIMENSIONES
		
		int dosD[][]=new int [5][4];
		System.out.println(dosD.length);
		
		for (int i=0;i<dosD.length;i++)
		{
			for(int j=0;j<4;j++)
				dosD[i][j]=i*j;
		}
		
		for (int[] v:dosD)
		{
		   for (int x:v)
			    System.out.println(x);
		}
		
		//3 DIMENSIONES 
		int tresD[][][]=new int [5][3][2];
		
		for(int i=0;i<tresD.length;i++)
		{
			for (int j=0;j<3;j++)
			{
				for (int z=0;z<2;z++)
					tresD[i][j][z]=(i*j)+z;

			}
		}
				
				
	
	
	}

}
