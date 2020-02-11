package misEjercicios;
//atributos estáticos
public class EjecutarPrueba 
{

	public static void main(String[] args)
	{
		Prueba.setNombre("Manuel");
		Prueba.setSueldo(1200);
		System.out.println(Prueba.getNombre());
		System.out.println(Prueba.getSueldo());
		
	}
	public String nombre()
	{
		return Prueba.getNombre();
	}
}
