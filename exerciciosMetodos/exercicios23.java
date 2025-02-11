package exerciciosMetodos;

import java.util.Scanner;

public class exercicios23 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite três valores: ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		double menorValor=minimum3(num1,num2,num3);
		System.out.println(menorValor);		
	}
	public static double minimum3(double a,double b, double c) {
		return java.lang.Math.min(java.lang.Math.min(a, b), c);
	}

}
