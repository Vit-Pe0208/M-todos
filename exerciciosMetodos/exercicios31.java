package exerciciosMetodos;

import java.util.Random;
import java.util.Scanner;

public class exercicios31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=1;
		int contador=1;
		do{
		Random random = new Random();
		int sorte = 1+random.nextInt(1000-1+1);
		int digitado;		
		do {
		System.out.println("Adivinhe um número entre 1 e 1000: ");
		 digitado=scanner.nextInt();
		
		if (digitado>sorte && digitado<=1000) {
			System.out.println("Muito alto.Tente Novamente");			
		}
		else
		   if (digitado<sorte && digitado>1) {
			System.out.println("Muito baixo.Tente Novamente");		
		}else
			if(digitado==sorte) {
				System.out.println("Parabéns, este é um número da sorte");
				break;			
			}else {
				System.out.println("Número inválido");
				break;
			}
		contador++;
		
		}while(digitado!=sorte);
		
		System.out.println("deseja jogar novamente? responda sim ou não:  ");
		String estado=scanner.next();
		if (estado.equalsIgnoreCase("Sim"))i=1;
		if(estado.equalsIgnoreCase("Não"))i++;
		
		
		
	}while(i!=2);
	
	System.out.println("Fim de jogo");
	if (contador<=10) {
		System.out.println("Você sabe o segredo ou tem muita sorte!!!");		
	}
	else
		if(contador==10) {
			System.out.println("Aha! Você sabe o segredo!");
		}else {
			System.out.println("Você deve ser capaz de fazer melhor!!!");
		}
	

}
	

}
