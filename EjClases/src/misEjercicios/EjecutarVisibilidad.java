package misEjercicios;

public class EjecutarVisibilidad 
{

	public static void main(String[] args) 
	{
		Visibilidad obj=new Visibilidad();
		obj.setSueldo(1205.56);
		obj.setFrase("Hoy es miércoles");
		System.out.println(toString (obj));

	}
	public static String toString(Visibilidad obj)
	{
		String mensaje="El sueldo es"+obj.getSueldo()+".\n La frase es: " +obj.getFrase();
		return mensaje;
	}

}
