package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class QuestaoQuatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarValor = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.cotacao(dolarValor, quantidade));
		sc.close();
	}

}
