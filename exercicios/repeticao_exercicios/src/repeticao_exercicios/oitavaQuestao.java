package repeticao_exercicios;

import java.util.Scanner;

public class oitavaQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= numero ; i++) {
			fatorial = fatorial * i; 
		}
		System.out.println(fatorial);
		
		
		sc.close();
	}

}
