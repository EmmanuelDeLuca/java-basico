package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class QuestaoCinco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Conta conta;
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		System.out.println();
		
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposito = sc.nextDouble();
			conta = new Conta(nome, numero, deposito);
		}
		else {
			conta = new Conta(nome, numero);
		}
		
	
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta.toString());
		
		System.out.print("Enter a deposit value: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println(" ");
		
		System.out.println("Update account data: ");
		System.out.println(conta.toString());
		
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		System.out.println(" ");
		
		System.out.println("Update account data: ");
		System.out.println(conta.toString());
		
		
		sc.close();
	}

}
