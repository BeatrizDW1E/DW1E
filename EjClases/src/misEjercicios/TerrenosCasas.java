package misEjercicios;

public class TerrenosCasas 
{

	public static void main(String[] args) 
	{
	
    String nombre[]=new String[5];
    String terrenosCasas[][][]=new String [5][3][2];
    
    nombre[0]="María";
    nombre[1]="Juan";
    nombre[2]="Benito";
    nombre[3]="Alfonso";
    nombre[4]="Paulina";
    
    for(int i=0;i<terrenosCasas.length;i++)
    {
        for(int j=0;j<terrenosCasas[i].length;j++)
        {
            for(int z=0;z<terrenosCasas[i][j].length;z++)
            {
                terrenosCasas[i][j][z]=nombre[i].charAt(0)+"T"+j+"C"+z;
            }
        }
    }
    
    for(String [][] tc:terrenosCasas)
    {
        for (String[] t: tc)
        {
            for(String c:t)
                System.out.println(c);
        }
    }
}
    
}
