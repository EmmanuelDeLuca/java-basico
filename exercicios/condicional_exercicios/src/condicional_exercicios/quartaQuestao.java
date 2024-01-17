package condicional_exercicios;

import java.util.Scanner;

public class quartaQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroHorario, segundoHorario, tempo;
		
		primeiroHorario = sc.nextInt();
		segundoHorario = sc.nextInt();
		
		if (segundoHorario > primeiroHorario) {
			tempo = segundoHorario - primeiroHorario;
		}
		else {
			tempo = 24 - primeiroHorario + segundoHorario;
		}
		System.out.println("O JOGO DUROU "+ tempo +" HORA(S)");
		
		
		sc.close();
	}

}
