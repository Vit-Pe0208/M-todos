package exerciciosMetodos;

import java.util.Scanner;

public class exercicios22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura: ");
		double temperatura=input.nextDouble();
		
		System.out.println("Digite se é celsius(digite apenas c) ou em fahrenheit(digite apenas f) que queira converter: ");
		String tipoTemperatura=input.next();
		
		
		if (tipoTemperatura.equalsIgnoreCase("c")) {
			System.out.println("Temperatura convertida de celsius para fahrenheit: "+fahrenheit(temperatura));
		}
		
		else 
			if (tipoTemperatura.equalsIgnoreCase("f")) {	
			System.out.println("Temperatura convertida de fahrenheit para celsius: "+celsius(temperatura));
		}else {
			System.out.println("Tipo de temperatura incorreto, digite c ou f !!!!");
		}
		
		
	}
	
	public static double celsius(double fahrenheit) {
		return 5.0/9.0*(fahrenheit-32);
	}
	public static double fahrenheit(double celsius) {
		return 9.0/5.0*celsius+32;
	}
	
	
	

}
