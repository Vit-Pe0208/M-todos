package exerciciosMetodos;

import java.util.Scanner;

public class exercicios32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primeira coordenada: ");
		double X1 = scanner.nextDouble();
		double Y1 = scanner.nextDouble();
		System.out.println("Digite a segunda coordenada: ");
		double X2 = scanner.nextDouble();
		double Y2 = scanner.nextDouble();
	    double distancia=	distance(X1,X2,Y1,Y2);
	    System.out.println(distancia);
		
		
		
		
		
	}
     public static double distance(double x1,double x2,double y1,double y2) {
    	 double distancia;
    	 distancia=java.lang.Math.sqrt(java.lang.Math.pow(x2-x1, 2)+java.lang.Math.pow(y2-y1, 2));
    	 return distancia;
    	 
     }
}
