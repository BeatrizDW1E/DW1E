package misEjercicios;

public class MetodoToString 
{
	public int valor;
	public MetodoToString (int valor)
	{
		this.valor=valor;
	}

	public static void main(String[] args) 
	{
		MetodoToString obj=new MetodoToString(100);
		
		System.out.println(obj);

	}
	
	public String ToString (String c, int z)
	{
		String mensaje="El valor de mi parámetro es "+valor+ "parámetros";
		return mensaje;
				
	}
	public String toString()
	{
		String mensaje="Valor: "+valor;
		return mensaje;
	}

}
