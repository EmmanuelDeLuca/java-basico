package condicional_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class quintaQuestao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double valor;
		
		switch (codigo) {
		case 1: {
			valor = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f", valor);
			break;
					
		}
		case 2: {
			valor = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f", valor);
			break;
		}
		case 3: {
			valor = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f", valor);
			break;
		}
		case 4: {
			valor = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f", valor);
			break;
		}
		case 5: {
			valor = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f", valor);
			break;
		}
		default:
			System.out.println("Esse produto não existe");
		}
		
		sc.close();
	}

}
