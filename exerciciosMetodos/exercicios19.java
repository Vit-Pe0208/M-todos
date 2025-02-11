package exerciciosMetodos;

import java.util.Scanner;

public class exercicios19 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		   System.out.println("Digite um valor inteiro: ");
		   int quadrado = input.nextInt();
		   System.out.println("Digite um de caracter que queira: ");
		   char fill=input.next().charAt(0);
		   exercicios19.squareOfAsterisks(quadrado,fill);
		   
		   
		   
		   
		   
		}
		public static void squareOfAsterisks(int side,char fillCharacter) {
			for (int i = 1; i <= side; i++) {
				 for (int j = 1; j <=side; j++) {
					  System.out.print(fillCharacter);
				 }
				System.out.println();								
			}
			
		}
	}


