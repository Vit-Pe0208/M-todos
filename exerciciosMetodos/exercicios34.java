package exerciciosMetodos;

import java.util.Scanner;

public class exercicios34 {
	public static void main(String[] args) {
		System.out.println("Decimal octal hexadecimal binário ");
		System.out.println("---------------------------------------");
		for (int i = 1; i <=256; i++) {
			System.out.printf("%d",i);
			System.out.print("\t");
			System.out.printf("  %s",Integer.toOctalString(i));
			System.out.print("\t");
			System.out.printf("  %s",Integer.toHexString(i));
			System.out.print("\t");
			System.out.printf("   %s%n",Integer.toBinaryString(i));
		
	}
	}
}
