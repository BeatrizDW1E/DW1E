package misEjercicios;
import java.math.*;
import java.util.Scanner;

public class Calculadora implements CalculadoraBaseI,ClaseAvanzadoI 
{
	
	
	public static void main(String[] args) 
	{
	
		Calculadora obj=new Calculadora();
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Elige una calculadora");
		
		
		
		


	}

	@Override
	public double sumar(double a, double b) 
	{
		
		return a+b;
	}

	@Override
	public double restar(double a, double b) 
	{
		
		return a-b;
	}

	@Override
	public double multiplicar(double a, double b) 
	{
		
		return a*b;
	}

	@Override
	public double dividir(double a, double b) 
	{
		 
		return a/b;
	}

	@Override
	public double sumarPI(double a) 
	{
		
		return a+Math.PI;
	}

	@Override
	public double restarPI(double a) 
	{
		return  a-Math.PI;
	}

	@Override
	public double logartimo(int a, int b) 
	{
		return Math.log(a)/Math.log(b);
	}

	

}
