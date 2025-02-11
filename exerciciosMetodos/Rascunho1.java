package exerciciosMetodos;

public class Rascunho1 {
	
	
	void f(float a)
	{
		//float a;
		System.out.println(a);
	}
	void product()
	{
		int a=6,b=5,c=4,result;
		result=a*b*c;
		System.out.printf("Resultado é %d%n",result);
		
	}
	
		void g()
		{
			System.out.println("Inserir método g");
			Rascunho1 metodoh = new Rascunho1();
			metodoh.h();	
		}
		void h()
		{
			System.out.println("Inserir método h");
		}
		public static void main(String[] args) {
			Rascunho1 metodog=new Rascunho1();
			metodog.g();
			}
	//public static void main(String[] args) {
	//	Rascunho1 produto = new Rascunho1();
		//produto.product();
		
		
		
		
		
		
	//}
	}



