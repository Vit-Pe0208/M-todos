package exerciciosMetodos;

import java.util.Scanner;

public class Rascunho2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Digite o raio da esfera: ");
		double raio=scanner.nextDouble();
		double volume=esferaVolume(raio);
		System.out.printf("O volume da esfera,de raio %.1f, é %.2f",raio,volume);
		
		
		
	}
	public static double esferaVolume(double radius) {
		double volume=(4.0/3.0)*java.lang.Math.PI*java.lang.Math.pow(radius, 3);
		return volume;
	}

}
