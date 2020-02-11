
public class Animal 
{
	
	public double velocidad;
	public String habitat;
	public String dieta;
	public int patas;
	public String especie;
	public String animal;
	public String bebida;
	public String dormir;
	public double salto;
	
	

	public static void main(String[] args)
	{

	    Animal elefantepaco=new Animal();
	    Animal elefantejulio=new Animal();
	    Animal boa=new Animal();  
	//doy valores a los atributos-propiedades
	 
        elefantepaco.velocidad=15.20;
        elefantepaco.habitat= "sabana";
        elefantepaco.dieta= "hierba";
        elefantepaco.patas=4;
        elefantepaco.especie= "mamífero";
        elefantepaco.dormir="bien";
        elefantepaco.bebida="agua";
        elefantepaco.salto=1.35;
        elefantepaco.animal="Paco";
        
    	elefantepaco.comer();
		elefantepaco.beber();
		elefantepaco.saltar();
		elefantepaco.dormir();
        elefantepaco.verInformacion();
        
        
        
        elefantejulio.velocidad=12;
        elefantejulio.habitat= "sabana";
        elefantejulio.dieta= "hierba";
        elefantejulio.patas=4;
        elefantejulio.especie= "mamífero";
        elefantejulio.bebida="vino";
        elefantejulio.dormir="de pena";
        elefantejulio.salto= 1.54;
        elefantejulio.animal="Julio";
        
        elefantejulio.comer();
		elefantejulio.beber();
		elefantejulio.saltar();
		elefantejulio.dormir();
		elefantejulio.verInformacion();
        
        
        boa.velocidad=30;
        boa.habitat= "jungla";
        boa.dieta= "carne";
        boa.patas=0;
        boa.especie= "reptil";
        boa.bebida="agua con gas";
        boa.dormir="mal";
        boa.salto=3.56;
        boa.animal="Boa";
        
        boa.comer();
		boa.beber();
		boa.saltar();
		boa.dormir();
		boa.verInformacion();
        
 
	
	
	}

	public void verInformacion()
	{
		System.out.println(animal+ " tiene las siguientes características\n");
	}
	
	
	
	public void comer() 
	{
		System.out.println ("\n" +animal+" come " + dieta);
	}
	
	public void beber()
	{
		System.out.println ( animal+" bebe " +bebida);
		
	}
	
	public void saltar()
	{
		System.out.println ( animal +" salta "+salto+ "cm ");
	}
	
	public void dormir ( )
	{
		System.out.println (animal+ " duerme " +dormir);
	}


}






