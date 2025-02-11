package exerciciosMetodos;

import java.util.Scanner;

public class exercicios26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um número: ");
		int numero=scanner.nextInt();
		inverter(numero);
		
		
		
	}
	public static void inverter(int number) {
		while (number!=0) {
			int num1=number%10;
			number=number/10;
			System.out.printf("%d",num1);
		}
		
	}
	

}
