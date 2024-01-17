package repeticao_exercicios;

import java.util.Scanner;

public class nonaQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (numero%i ==0) {
				System.out.println(i);
			}
		} 
		
		
		
		sc.close();
	}

}
