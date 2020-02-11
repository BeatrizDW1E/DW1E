 package misEjercicios;

public class arrayConWhile {

	public static void main(String[] args) {
		PersonaArray obj1= new PersonaArray();
		
		
		obj1.nombre="Juan";
		obj1.sueldo=1500.60;
		obj1.casado= false;
		
		PersonaArray obj2= new PersonaArray();
		
		obj2.nombre="Bartolo";
		obj2.sueldo=1001.32;
		obj2.casado= false;
		
		PersonaArray obj3= new PersonaArray();
		
		obj3.nombre="Pedro";
		obj3.sueldo=3000.86;
		obj3.casado= true;
		
		PersonaArray obj4= new PersonaArray("Felipe",2100.80,false); 
		
		
		PersonaArray listaPersonas[]=new PersonaArray[4];
		
		listaPersonas[0]=obj1;
		listaPersonas[1]=obj2;
		listaPersonas[2]=obj3;
		listaPersonas[3]=obj4;
		

		for(PersonaArray people:listaPersonas)
			System.out.println("El nombre es "+people.nombre+", tiene un sueldo de: "+people.sueldo+" y "+people.getEC());
		
		
	}

}
 class PersonaArray
 {
	 public String nombre;
	 public double sueldo;
	 public boolean casado;
	 
	 public PersonaArray() {};
	 public PersonaArray(String nombre, double sueldo, boolean casado)
	 {
		 this.nombre=nombre;
		 this.sueldo=sueldo;
		 this.casado=casado;
	 }
	 

	 public String getNombre()
	 { 
		 return nombre;
	 }
	 public String getEC()
	 {
		 
		 if(casado== true)
		 {
			 return "está casado";
			
		 }
		 else {return "está soltero";}
		 
		 
	 }
 }