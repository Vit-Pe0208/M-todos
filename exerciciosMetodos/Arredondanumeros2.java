package exerciciosMetodos;

import java.util.Scanner;

public class Arredondanumeros2 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor original: ");
		double x= input.nextDouble();
		double inteiro=arredondaParaInteiro(x);
		double decimos=arredondaParaDecimos(x);
		double centesimos=arredondaParacentesimos(x);
		double milesimos=arredondaParamilesimos(x);
		
		System.out.printf("Valor original: %.2f%n",x);
		System.out.println("Valores mais próximos");
		System.out.printf("Valor arredondado para inteiro: %.0f%nValor arredondado para casa dos decimos: %.1f%nValor arredondado para casa do centesimo: %.2f%nValor arredondado para casa do milesimos: %.3f"
				+ "",inteiro,decimos,centesimos,milesimos);
		
	}
	public static double arredondaParaInteiro(double number) {
		return java.lang.Math.floor(number);		
	}
	public static double arredondaParaDecimos(double number) {
		return java.lang.Math.floor(number*10 + 0.5)/10;		
	}
	public static double arredondaParacentesimos(double number) {
		return java.lang.Math.floor(number*100 + 0.5)/100;		
	}
	public static double arredondaParamilesimos(double number) {
		return java.lang.Math.floor(number*1000 + 0.5)/1000;		
	}
	
	
}
