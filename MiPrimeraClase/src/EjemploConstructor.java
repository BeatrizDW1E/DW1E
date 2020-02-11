import java.util.Scanner;
public class EjemploConstructor {

	public static void main(String[] args) 
	{
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca un nombre");
		String teclado= entrada.nextLine();
		System.out.println("Introduzca un numero con decimales");
		double numeroDoble=entrada.nextDouble();	
		System.out.println(numeroDoble);
		System.out.println(teclado);
		entrada.close();
	
		
		
		
		
		
		Alumno al1=new Alumno(1200);
		Alumno al2= new Alumno();
		al2.nombre="Pedro";
		al2.pais="Chile";
		al2.carrera="Fisicas";
				
		Alumno al3=new Alumno("Marina","Francia","Informatica");	
		
		System.out.println("Primero: "+al1.nombre+" , Segundo: "+al2.nombre+" , Tercero: "+al3.nombre);
		
	}

}


class Alumno
{
	String nombre;
	String pais;
	String carrera;
	
	public Alumno() {};
	
	public Alumno(String nombre,String pais,String carrera)
	{
		this.nombre=nombre;
		this.pais=pais;
		this.carrera=carrera;
		
	}
	
	public Alumno(int valor)
	{
		System.out.println(valor);
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getPais()
	{
		return pais;
	}
	
	public String getCarrera()
	{
		return carrera;
	}
}
