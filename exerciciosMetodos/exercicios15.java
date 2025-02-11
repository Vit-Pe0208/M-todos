package exerciciosMetodos;

import java.util.Scanner;

public class exercicios15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro cateto: ");
		double cateto1 = input.nextDouble();
		System.out.println("Digite o segundo cateto: ");
		double cateto2 = input.nextDouble();
	    double hipotenusa=Hypotenuse(cateto1,cateto2);
	    System.out.println("Valor da hipotenusa: "+hipotenusa);		
	}
	public static double Hypotenuse(double side1,double side2) {
		double hipotenusa=java.lang.Math.sqrt(java.lang.Math.pow(side1, 2)+java.lang.Math.pow(side2, 2));	
		return hipotenusa;		
	}

}
