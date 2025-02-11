package exerciciosMetodos;

import java.io.PrintStream;
import java.util.Scanner;

public class exercicios21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o número: ");
		int numero=input.nextInt();
		if (numero>1 && numero<=99999) {
			displayDigits(numero);		
		}else {
			System.out.println("Número Inválido");
		}
				    
	}
	
	public static void displayDigits(int integer) {	
		int num1,num2,num3,num4,num5;
		if (integer>=1 && integer<=9) {
			num5=resto(integer,10);
			System.out.println(num5);
			
		}
		if (integer>=10 && integer<=99) {
			num5=resto(integer,10);
			integer=quociente(integer,10);
			num4=resto(integer,10);
			System.out.printf("%d  %d",num4,num5);		
		}
		if (integer>=100 && integer<=999) {
			num5=resto(integer,10);
			integer=quociente(integer,10);
			num4=resto(integer,10);
			integer=quociente(integer,10);
			num3=resto(integer,10);
			System.out.printf("%d  %d  %d",num3,num4,num5);		
		}
		if (integer>=1000 && integer<=9999) {
			num5=resto(integer,10);
			integer=quociente(integer,10);
			num4=resto(integer,10);
			integer=quociente(integer,10);
			num3=resto(integer,10);
			integer=quociente(integer,10);
			num2=resto(integer,10);
			System.out.printf("%d  %d  %d  %d",num2,num3,num4,num5);		
		}
		if (integer>=10000 && integer<=99999) {
			num5=resto(integer,10);
			integer=quociente(integer,10);
			num4=resto(integer,10);
			integer=quociente(integer,10);
			num3=resto(integer,10);
			integer=quociente(integer,10);
			num2=resto(integer,10);
			integer=quociente(integer,10);
			num1=resto(integer,10);
			System.out.printf("%d  %d  %d  %d  %d",num1,num2,num3,num4,num5);		
		}		
	}
	public static int quociente(int a,int b) {
		 int result = a/b;
	     return result;
	}
	public static int resto(int a, int b) {
		int result= a%b;
		return result;
	}
	

}
