package condicional_exercicios;

import java.util.Scanner;

public class segundaQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int  numeroImparOuPar = sc.nextInt();
		
		if (numeroImparOuPar % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
