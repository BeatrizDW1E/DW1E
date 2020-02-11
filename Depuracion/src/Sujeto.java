public class Sujeto 
{
	String nombre;
	String apellidos;
	int edad;
	boolean casado;
	String DNI;
	
	
public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getApellidos() 
	{
		return apellidos;
	}
	public void setApellidos(String apellidos) 
	{
		this.apellidos = apellidos;
	}
	public int getEdad() 
	{
		return edad;
	}
	public void setEdad(int edad) 
	{
		this.edad = edad;
	}
	public boolean isCasado() 
	{
		return casado;
	}
	public void setCasado(boolean casado) 
	{
		this.casado = casado;
	}
	public String getDNI() 
	{
		return DNI;
	}
	public void setDNI(String DNI) 
	{
		this.DNI = DNI;
	}
	
	public static void main(String[] args) 
	{
		Sujeto obj=new Sujeto();
		obj.setNombre("Juan Carlos");
		obj.setApellidos("Pérez García");
		obj.setEdad(58);
		obj.setCasado(true);
		obj.setDNI("05489125");
		
		System.out.println("Nombre: "+obj.getNombre()+"\nApellidos: "+obj.getApellidos()+"\nEdad: "+obj.getEdad()+"\nCasado: "+obj.isCasado()+"\nDNI: "+obj.getDNI());

	}
 

}
