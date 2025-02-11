package exerciciosMetodos;

import java.util.Scanner;

public class exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número ou fim de arquivo para encerrar: ");
		do {
			
			int num1= input.nextInt();
			if (isEven(num1)) {
				System.out.println("O número é par");			
			} else {
				System.out.println("O número é impar");
			}
			System.out.println();
			System.out.println("Digite um número ou fim de arquivo para encerrar: ");
		}while(input.hasNext());
		System.out.println("Programa encerrado!!!");		
		
	}
	public static boolean isEven(int num) {
		return num%2==0;
	}

}
