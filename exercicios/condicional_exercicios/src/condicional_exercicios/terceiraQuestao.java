package condicional_exercicios;

import java.util.Scanner;

public class terceiraQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroA = sc.nextInt();
		int numeroB = sc.nextInt();
		
		if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
		
		
		sc.close();
	}

}
