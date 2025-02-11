package exerciciosMetodos;

import java.util.Iterator;
import java.util.Scanner;

public class exercicios18 {
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   System.out.println("Digite um valor inteiro: ");
	   int asteriscos = input.nextInt();
	   exercicios18.squareOfAsterisks(asteriscos);
	   
	   
	}
	public static void squareOfAsterisks(int side) {
		for (int i = 1; i <= side; i++) {
			 for (int j = 1; j <=side; j++) {
				  System.out.print("*");
			 }
			System.out.println();								
		}
		
	}

}
