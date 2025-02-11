package exerciciosMetodos;

import java.util.Scanner;

public class exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do raio: ");
		double num1 = input.nextDouble();
	    circleArea(num1);
	    
		
		
		
	}
	public static void circleArea(double raio) {
		double area= java.lang.Math.PI*java.lang.Math.pow(raio, 2);
		System.out.println(area);
	}

}
