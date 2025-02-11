package exerciciosMetodos;

import java.util.Scanner;

public class exercicios25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("Digite um número: ");
		//int num=input.nextInt();
		//exercicios25.Primo(num);	
		for (int i = 1; i < 10000; i++) {
			exercicios25.Primo(i);			
		}
		
	}
	
	
	public static void Primo(int number) {
		
  if(number<=1) {
	  System.out.print("");
  }
  		
  else
	  if (number==2 || number==3 || number==5 || number==7) {
		System.out.printf(" %d PRIMO%n",number);	
		} 
	 else
		if(number%2==0 || number%3==0 || number%5==0 || number%7==0) {
		System.out.print("");
		}
		else {
			boolean primo=true;
			
			for (int i = 11; i*i<=number; i+=2) {
				if (number%i==0) {
					primo=false;
					break;
				}
			}
			if (primo) {
				System.out.printf("%d PRIMO%n",number);
				
			}else {
				System.out.print("");
						
			}
		}
			
	}
}
