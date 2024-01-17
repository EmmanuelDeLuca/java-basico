package sequencia_exercicios;

import java.util.Scanner;
import java.util.Locale;

public class quintaQuestao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigoUm, quantidadeUm, codigoDois, quantidadeDois;
		String valorUnitarioStrUm, valorUnitarioStrDois;
		double valorUnitarioUm , valorUnitarioDois, valorAPagar;
		
		codigoUm = sc.nextInt();
		quantidadeUm = sc.nextInt();
		valorUnitarioStrUm = sc.next();
		valorUnitarioUm = Double.parseDouble(valorUnitarioStrUm);
		
		codigoDois = sc.nextInt();
		quantidadeDois = sc.nextInt();
		valorUnitarioStrDois = sc.next();
		valorUnitarioDois = Double.parseDouble(valorUnitarioStrDois);
		
		
		valorAPagar = (valorUnitarioUm * quantidadeUm) + (valorUnitarioDois * quantidadeDois);
		
		System.out.printf("VALOR A PAGAR: %.2f", valorAPagar);
		
		
		
		
		
		sc.close();
	}

}
