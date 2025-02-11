package exerciciosMetodos;

import java.util.Scanner;

public class exercicios14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		int Base= input.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int expoente = input.nextInt();
		int resultado=integerPower(Base,expoente);
		System.out.println(resultado);
		
	}
	private static int integerPower(int base, int exponent) {
		int i=0;
		int j=0;
		int produto=1;
		
			while (i!=exponent) {
				while(j!=1) {
					 produto=produto*base;
					j++;
				}
	            j=0;	            
				i++;
			}
			return produto;
		}

}
