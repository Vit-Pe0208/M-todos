package exerciciosMetodos;

import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Scanner;

public class exercicios29 {
	static Scanner scanner = new Scanner(System.in);
	private static final SecureRandom random= new SecureRandom();
	private enum Coin{CARA,COROA};
	
	
	public static void main(String[] args) {
		int cara = 0,coroa=0;
		Coin status;
		
		System.out.println("Escolha Toss Coin para jogar ou continuar jogando; ou qualquer caractere para terminar o jogo ");
		
	    String estadoJogo=scanner.nextLine();
			while(estadoJogo.equalsIgnoreCase("Toss Coin")) {
				
				System.out.println(flip());
				if (flip()==Coin.CARA)cara++;
				if(flip()==Coin.COROA)coroa++;		
				System.out.println("Escolha Toss Coin para jogar ou continuar jogando; ou qualquer caractere para terminar o jogo");
				 estadoJogo=scanner.nextLine();
				
			}
			
			System.out.println("Cara: "+cara);
			System.out.println("Coroa: "+coroa);
			
			
		
		
		
	}
	public static Coin flip() {
		Coin status;
		int jogada = random.nextInt(2);
		if (jogada==0) { 
			status=Coin.CARA;
		}else {
			status=Coin.COROA;
		}
					
		return status;
	}

}
