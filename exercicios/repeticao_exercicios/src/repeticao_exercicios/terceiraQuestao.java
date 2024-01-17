package repeticao_exercicios;

import java.util.Scanner;

public class terceiraQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcoolQuantidade = 0;
		int gasolinaQuantidade = 0;
		int dieselQuantidade = 0;
		int valorFinal = sc.nextInt();
		
		while (valorFinal != 4) {
			if (valorFinal == 1) {
				alcoolQuantidade ++;
				
			}
			else if(valorFinal == 2) {
				gasolinaQuantidade ++;
				
			}
			else if(valorFinal == 3) {
				dieselQuantidade ++;
				
			}
			valorFinal = sc.nextInt();
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcoolQuantidade);
		System.out.println("Gasolina: " + gasolinaQuantidade);
		System.out.println("Diesel: " + dieselQuantidade);
		
		sc.close();
	}

}
