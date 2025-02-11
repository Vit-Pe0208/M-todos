package exerciciosMetodos;

import java.util.Scanner;

public class ArredondandoNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor original: ");
		double x = scanner.nextDouble();
		double y=java.lang.Math.floor(x+0.5);
		System.out.printf("valor original: %.2f%n",x);
		System.out.println("valor arredondado para o inteiro mais próximo: "+y);
		
		
		
		}
	

}
