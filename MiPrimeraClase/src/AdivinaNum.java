import java.util.Scanner;
import java.io.*;

public class AdivinaNum {

	private static Scanner leer;

	public static void main(String args[]) throws IOException {
	    int intentos;
		int num;
		intentos = 1; 
        int numSecreto=(int)(Math.random()*100+50);
        System.in.read();
       

		System.out.println("Bienvenido a AdivinaNum");
		System.out.println("Este juego consiste en adivinar un n�mero entre 50 y 150");
		System.out.println("Dispones de 10 intentos para adivinarlo");
		System.out.println("Si lo consigues en los 3 primeros intentos GANA LA PARTIDA");
		System.out.println("Si lo consigues entre el 4� y 6� intento quedar� SEGUNDO");
		System.out.println("Si lo consigues entre el 7� y 9� intento quedar� TERCERO");
		System.out.println("Si no lo consigues en el 10� intento PIERDE LA PARTIDA");
		System.out.println("Para abandonar la partida pulse 0");
		System.out.println("Introduce un n�mero");
	    leer = new Scanner(System.in);
	    num=leer.nextInt();
		
		
		do {
			if (num==0) 
			{
				System.out.println("Finalizar programa");
			} else {
				if (num>=1 && num<=49 || num<0 || num>150) 
				{
					System.out.println("El n�mero introducido no se encuentra entre el rango");
					System.out.println("Introduce un n�mero dentro de los se�alados");
				} else {
					if (numSecreto>num)
					{
						System.out.println("El n�mero secreto es m�s alto");
					} else {
						System.out.println("El n�mero secreto es m�s bajo");
					}
					intentos = intentos+1;
					System.out.println("Llevas "+intentos+" intentos:");
					
					if (num==numSecreto) {
						switch (intentos) {
						case 1: case 2: case 3:
							System.out.println("HAS GANADO LA PARTIDA!!!!");
							break;
						case 4: case 5: case 6:
							System.out.println("Has quedado SEGUNDO!!!");
							break;
						case 7: case 8: case 9:
							System.out.println("Has quedado TERCERO!!");
							break;
						case 10:
							System.out.println("EN EL �LTIMO INTENTO, TE LLEVAS UNA MEDALLA DE CONSOLACI�N!");
							break;
						}
					}
				}
			}
		} while (!(num==0 || intentos==10 || numSecreto==num));
		System.out.println("Se termin� el juego");
	}


}
	