package exerciciosMetodos;

import java.security.SecureRandom;
import java.util.Scanner;

public class exercicios33 {
	static Scanner scanner = new Scanner(System.in);
	private static final SecureRandom randomNumbers = new SecureRandom();
	private enum Status{CONTINUE,WON,LOST};
	private static final int SNAKE_EYES = 2;
	private static final int TREY =3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS =12;
	static double bankBalance = 1000;
	
	public static void main(String[] args) {
		
		System.out.println("Insira um wager: ");
		double wager = scanner.nextDouble();
			while (wager>bankBalance) {
				System.out.println("Reinsira um wager até ser válido");
				 wager = scanner.nextDouble();
				if(wager<bankBalance)
					break;
			}
		bankBalance-=wager;	
		int myPoint = 0;
		Status gameStatus;
		int sumOfDice = rollDice();
		
		switch(sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus=Status.WON;
			break;
		case SNAKE_EYES:	
		case TREY:
		case BOX_CARS:
			gameStatus=Status.LOST;
			break;
		default:
			gameStatus=Status.CONTINUE;
			myPoint=sumOfDice;
			System.out.printf("Ponto é %d%n",myPoint);
			break;
		}
		while(gameStatus==Status.CONTINUE)
		{
			sumOfDice=rollDice();
			if(sumOfDice == myPoint)
				gameStatus= Status.WON;
			else
				if(sumOfDice == SEVEN)
					gameStatus= Status.LOST;	
		}
		if(gameStatus == Status.WON) {
			System.out.println("Venceu!");
			System.out.println("Você está montando na grana, Agora é hora de trocar essas fichas e embolsar o dinheiro!!");
			bankBalance+=wager*2;
		}
		else
		    {
			System.out.println("Ah, vamos lá, dê uma chance para sua sorte");
			System.out.println("Perdeu!!");
			
			bankBalance-=wager;
			
		}
		if(bankBalance==0) {
			System.out.println("Desculpe, você faliu!!!");
		}
		System.out.println("novo valor do saldo: "+bankBalance);
		
		
		
		}
	public static int rollDice() {
		int die1 = 1 +randomNumbers.nextInt(6);
		int die2 = 1 +randomNumbers.nextInt(6);
		int sum = die1+die2;
		System.out.printf("Jogador jogou %d + %d = %d%n",die1,die2,sum);
		return sum;
	}
	
	
	
	

}
