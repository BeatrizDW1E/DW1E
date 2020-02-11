package misEjercicios;

public class Enum
{
	public enum Meses
	{
		//Elementos del enum
		Enero("January",31),Febrero("February",29),Marzo("March",31),Abril("April",30),Mayo("May",31),Junio("June",30),Julio("July",31),Agosto("August",31),Septiembre("September",30),Octubre("October",31),Noviembre("November",30),Diciembre("December",31);
		
		//Atributos del enum
		public String month;
		public int numberDays;
		
		//Constructor, en enum tieneqque ser privado
	    private Meses(String m, int d)
		{
			month=m;
			numberDays=d;
		}
		//Metodo para sacar info (getters)
	    public String getMonth()
	    {
	    	return month;
	    }
	    
	    //Funcion del enum, recibe un obj del tipo meses, va a recibir un objeto de tipo meses que se crea en el main.
	    public String toString(Meses obj)
	    {
	    	String mensaje="El nombre del elemento es: "+obj.name()+". El orden que ocupa es: "+obj.ordinal()+"\nEl mes en inglés es: "+obj.month+" y el número de días es: "+obj.numberDays;
	    	return mensaje;
	    }
		
		
	}
	public static void main(String[] args) 
	{
		//Creamos un objeto de tipo meses
		Meses miMes=Meses.Julio;
		
		//El objeto que nos creamos se lo metemos al toString para que imprima lo de ese metodo
		System.out.println(miMes.toString(miMes));
		
		Meses miMes2=Meses.Diciembre;
		
		System.out.println(miMes2.toString(miMes2));
		//para mostrar todos los elementos del enum. El metodo values se convierte en un array para que saque todos los elemtos, para el for each porque este recorre todos los elementos
		
		for(Meses x:Meses.values())
		System.out.println(x);
		System.out.println();
		System.out.println(miMes.getMonth());
		System.out.println(miMes2.getMonth());
		
	}

}
