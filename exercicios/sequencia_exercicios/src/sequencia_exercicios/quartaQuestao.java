package sequencia_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class quartaQuestao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int numeroDoFuncionario, numeroDeHoras;
		String valorTrabalhadasStr;
		double valorTrabalhadas, resultado;
		
		numeroDoFuncionario = sc.nextInt();
		numeroDeHoras = sc.nextInt();
		valorTrabalhadasStr = sc.next();
		valorTrabalhadas = Double.parseDouble(valorTrabalhadasStr);
		
		resultado = valorTrabalhadas * numeroDeHoras;
		
		System.out.println("NUMBER : " + numeroDoFuncionario);
		
		System.out.printf("SALARY = U$ %.2f", resultado);
		
		
		
		sc.close();
	}

}
