package exerciciosMetodos;

import java.util.Scanner;

public class exercicios25b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num=input.nextInt();
		exercicios25b.Primo(num);	
		
	}
	
	private static void Primo(int number) {
		for (int i = 2; i <=number; i++) {
			boolean primo = true;
			for (int j = 2; j <i; j++) {
				if (j%i==0) {
					primo=false;	
				}			
			}
			if(primo)
				System.out.println(i);
		}				
}

}

