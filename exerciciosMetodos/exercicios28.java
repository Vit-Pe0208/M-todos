package exerciciosMetodos;

import java.util.Scanner;

public class exercicios28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a sua média: ");
		int Média=scanner.nextInt();
		int resultado=exercicios28.qualityPoints(Média);
		System.out.println(resultado);
		
		
	}
	public static int qualityPoints(int media) {
		int valor=0;
		if(media>=90 && media <=100)valor=4;
		if (media>=80 && media<=89)valor=3;
		if (media>=70 && media<=79)valor=2;
		if(media>=60 && media<=69)valor=1;
		return valor;	
		
			
		
           
		
		
	}

}
