package repaso1;

public class Viviente extends SerVivo implements Pendientes
{
	
	
	public static void main(String[] args) 
	{
		Viviente ser1=new Viviente();
		
		ser1.nombre="Pedro";
		ser1.altura=6.25;
		ser1.edad=23;
		ser1.patas=4;
		ser1.clase="Carnívoro";
		ser1.extincion=false;
		ser1.comida="Carne";
		ser1.bebida="Sangre";
		
		Viviente ser2=new Viviente();
		
		ser2.nombre="Maria";
		ser2.altura=5.30;
		ser2.edad=17;
		ser2.patas=4;
		ser2.clase="Hervívoro";
		ser2.extincion=true;
		ser2.comida="vegetales";
		ser2.bebida="Agua";
		
		
		Viviente ser3=new Viviente();
		
		ser3.nombre="Gilberto";
		ser3.altura=8.45;
		ser3.edad=57;
		ser3.patas=0;
		ser3.clase="Planta";
		ser3.extincion=true;
		ser3.comida="Vegetales";
		ser3.bebida="Agua";
		
		Viviente ser4=new Viviente();
		
		ser4.nombre="Luisa";
		ser4.altura=12.52;
		ser4.edad=42;
		ser4.patas=0;
		ser4.clase="Planta";
		ser4.extincion=false;
		ser4.comida="Vegetales";
		ser4.bebida="Agua";

		Viviente listaAnimal []= new Viviente [4];
		
		listaAnimal[0]=ser1;
		listaAnimal[1]=ser2;
		listaAnimal[2]=ser3;
		listaAnimal[3]=ser4;
		
		for(Viviente animal:listaAnimal)
			System.out.println("El nombre es "+animal.nombre);
		
		for (int i=0;i<4;i++)
		{
			switch(i)
			{
			case 0:
				                                                               ser1.nombre="Pedro";
				ser1.altura=6.25;
				ser1.edad=23;
				ser1.patas=4;
				ser1.clase="Carnívoro";
				ser1.extincion=false;
				ser1.comida="Carne";
				ser1.bebida="Sangre";
				
			}
		}

	}

	@Override
	public String recordarPastillas(String x) 
	{
		return null;
	}

	@Override
	public String visitarParientes(String a, String b) 
	{
		return null;
	}

}
