package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class QuestaoTres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		aluno.nome = sc.nextLine();
		aluno.primeiraNota = sc.nextDouble();
		aluno.segundaNota = sc.nextDouble();
		aluno.terceiraNota = sc.nextDouble();
		
		double notalfinal = aluno.notalFinal();
		System.out.printf("FINAL GRADE = %.2f\n", notalfinal);
		String resultado = aluno.resultado();
		
		if (resultado == "PASS") {
			System.out.println(resultado);
		}
		else {
			System.out.println(resultado);
			System.out.printf("MISSING %.2f POINTS", 60 - notalfinal);
		}
		
		sc.close();
	}

}
