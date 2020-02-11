
public class Persona
{ 
	public String colorPelo;
	public int altura;
	//float peso;
	public double peso;
	public String nombre;
	public boolean barba;
	public int calzado;
	
	
		
	
	public static void main(String[] args)
	{
		Persona luisa=new Persona();
		Persona paco=new Persona();
		
		
		luisa.altura=178;
		luisa.colorPelo="moreno";
		luisa.peso=68;
		luisa.barba=false;
		luisa.nombre="Luisa";
		
		paco.altura=169;
		paco.colorPelo="rubio";
		paco.peso=78;
		paco.barba=true;
		paco.nombre="Paco";
		
		luisa.andar(15);
		luisa.enseñaPropiedades();
		paco.andar(10);
		paco.enseñaPropiedades();
		


	}
	
	public void andar (int km)
	{
		System.out.println (nombre+" ha andado 20 km"+km);
	}
	
	public int peso( int kilos)
	{
		int totalKilos;
		totalKilos=kilos+15;
		return totalKilos;		
	}
	
	public boolean fichado()
	{
		return true;
	}
	
	public void enseñaPropiedades()
	{
		System.out.println("La altura de "+nombre+" es de " +altura);
		
	}
  
}
