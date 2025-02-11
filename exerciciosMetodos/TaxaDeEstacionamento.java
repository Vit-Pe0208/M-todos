package exerciciosMetodos;

import java.util.Scanner;

public class TaxaDeEstacionamento {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int clientes=1;
		double totalRecibo=0;
		System.out.println("Digite a quantidade de horas(inteiros) estacionados do  cliente , ou digite o indicador de fim de arquivo");
		while(scanner.hasNext())  {
			double cobrança = 0;
			int hora = scanner.nextInt();
			 if (hora<0 || hora> 24) {
				 System.out.println("Hora inválida");	
				 System.out.println();
			}else {
			cobrança = calculateCharges(hora);
			System.out.println("cobrança do cliente :R$  "+cobrança);
			System.out.println();
			
			}
			 totalRecibo+=cobrança;	
			 
			 System.out.println("Digite a quantidade de horas(inteiros) estacionados do  cliente , ou digite o indicador de fim de arquivo");
		}
		System.out.println();
		System.out.println("O total dos recibos de ontem foi: "+totalRecibo);
		
					
	}
	public static double calculateCharges(int hora) {
		double tarifa = 0;
		if (hora>0 && hora<=3) {
			tarifa=2.00;
			
		}
		if (hora>=3 && hora<=19) {
			tarifa = 0.50+hora*0.50;
				
		}
		if (hora>19 && hora <=24) {
			tarifa = 10.00;		
		}
		return tarifa;
		
		
		
		
	}
		

}
