
public class Lista {


	public static void main(String[] args){
	
 
	
    /*Una forma de asignar valores
     miLista[0]=100;
     miLista[1]=200;
     miLista[2]=300;
     miLista[3]=400;
     miLista[4]=500;
     miLista[5]=600;
     */
     
     /*Segunda forma
     int miLista2[]= {100,200,300,400,500,600};
     */
     
     //Tercera forma
		
	int miLista[]= new int[26];
		// char miListaCaracter[]= new char[10];
		
     int primero=1000;
     for(int i=0;i<26;i++)
     {
    	 miLista[i]=primero;
         primero++;
     }
     
     for(int i=0;i<26;i++)
      System.out.println (miLista[i]);
     
	}
}


    

     
   
	
