package exerciciosMetodos;

import java.util.Scanner;

public class exercicios16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite dois valores ou digite ou o fim de arquivo: ");
		do  {			
			int num1 = input.nextInt();
			int num2 = input.nextInt();	
			if (isMultiple(num1, num2)) {
				System.out.printf("o número %d é múltiplo de %d%n",num2,num1);
				
			} else {
				System.out.printf("O número %d não é multiplo de %d%n",num2,num1);

			}
			System.out.println("Digite dois valores ou digite ou o fim de arquivo : ");			
		
		
		}while(input.hasNext())	;	
		System.out.println("Programa encerrado!!!!");
	}
	
	
	
	public static boolean isMultiple(int a, int b) {
		return b%a==0;		
	}

}
