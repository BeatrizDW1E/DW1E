package repaso1;

abstract class SerVivo 
{
	String nombre;
	double altura;
	int edad;
	int patas;
	String clase;
	boolean extincion;
	String comida;
	String bebida;
	
	public  String comer (String comida)
	{
		return comida;
	}
	
	public String beber(String bebida)
	{
		return bebida;
	}
	
	public void deseoVivir()
	{
		System.out.println("Deseo vivir");
	}

}
