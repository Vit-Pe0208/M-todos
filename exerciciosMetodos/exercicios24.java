package exerciciosMetodos;

import java.util.Iterator;
import java.util.Scanner;

public class exercicios24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 1000; i++) {
			isPerfect(i);
			//System.out.println();
		}
			
	}
	public static void isPerfect(int number) {
		int total=0;
		
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				total+=i;	
			}				
		}
		if (total==number) {
				
			for (int i = 1; i < number; i++) {
				if (number%i==0) {
					System.out.printf("%d ",i);				
				}			
			}
			System.out.printf("-->%d%n",total);
		
			
			
		}
		
		
		
	}
	

}
