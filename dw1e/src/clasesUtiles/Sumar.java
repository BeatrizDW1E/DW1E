package clasesUtiles;

public class Sumar 
{
	public int n1,n2,n3;
	public double nd1,nd2,nd3;
	
	
	public int sumas(int a, int b)
	{
	    n1=a;
	    n2=b;
		return n1+n2;
	}
	//EL METODO ESTA SOBRECARGADO, PUEDE HACER VARIAS COSAS
	public int sumas(int a, int b, int c)
	{
		n1=a;n2=b;n3=c;
		return n1+n2+n3;
	}

	
	public double sumas(double a, double b)
	{
	    nd1=a;
	    nd2=b;
		return nd1+nd2;
	}
	
	public double sumas(double a, double b, double c)
	{
		nd1=a;nd2=b;nd3=c;
		return nd1+nd2+nd3;
	}
}
