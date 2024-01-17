package repeticao_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class setimaQuestao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			double numerador = sc.nextDouble();
			double denominador = sc.nextDouble();
			
			if (denominador == 0) {
				System.out.println("Divisão Impossivel");
			}
			else {
				double resultado = numerador / denominador ;
				System.out.printf("%.1f\n", resultado);
			}
		}
		
		sc.close();
	}

}
