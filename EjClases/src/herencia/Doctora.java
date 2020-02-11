package herencia;

public class Doctora extends Persona
{

	public static void main(String[] args) 
	{
		Doctora obj=new Doctora();
		obj.setNombre("Josefina");
		obj.setApellido("Pérez");
		obj.setCalle("Cardoso,3");
		obj.setEdad(25);
		obj.setTelefono("918563634");
		
		System.out.println(obj.edadAmpliada());
		System.out.println("Nombre: "+obj.getNombre()+"\nCalle: "+obj.getCalle());

	}

}


