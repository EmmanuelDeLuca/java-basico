package condicional_exercicios;

import java.util.Scanner;

public class primeiraQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int negativoOuPositivo = sc.nextInt();
		
		if (negativoOuPositivo >= 0) {
			System.out.println("NÃO NEAGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();

	}

}
