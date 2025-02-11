package exerciciosMetodos;

import java.util.Scanner;

public class exercicios27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite dois valores: ");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		exercicios27.mdc(numero1,numero2);
		
		
	}
	public static void mdc(int a,int b) {
		if (a==0) {
			System.out.println(b);			
		}else
			if(b==0) {
				System.out.println(a);
			}else 
				if(a==0 && b==0) {
					System.out.println(0);
				}
				else {
					while(a!=0 || b!=0) {
						int quociente=a/b;
						int resto=a%b;
						a=b;
						b=resto;
						if(a==0) {
							System.out.println(b);
							break;
						}
						if(b==0) {
							System.out.println(a);
							break;
						}
						
					}
					
				}
			
		
		
	}

}
