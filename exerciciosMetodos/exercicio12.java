package exerciciosMetodos;

import java.security.SecureRandom;

public class exercicio12 {
	public static void main(String[] args) {
		SecureRandom randomnumbers = new SecureRandom();
		int a = 1+randomnumbers.nextInt(2);
		int b = 1 + randomnumbers.nextInt(100);
		int c = randomnumbers.nextInt(10);
		int d = 1000+randomnumbers.nextInt(113);
		int e = -1 + randomnumbers.nextInt(3);
		int f = -3 + randomnumbers.nextInt(15);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
