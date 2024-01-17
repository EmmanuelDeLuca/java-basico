package sequencia_exercicios;

import java.util.Scanner;

public class primeiraQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, resultado;
		
		System.out.println("Entrada:");
		primeiroNumero = sc.nextInt();
		
		segundoNumero = sc.nextInt();
		
		resultado = primeiroNumero + segundoNumero;
		
		System.out.println("Saída:");
		System.out.println("SOMA = " + resultado);
		
		sc.close();

	}

}
