package repeticao_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class sextaQuestao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroTeste = sc.nextInt();
		
		for (int i = 1; i <= numeroTeste; i++) {
			double notaUm = sc.nextDouble();
			double notaDois = sc.nextDouble();
			double notaTres = sc.nextDouble();
			
			double nota = ((notaUm * 2) + (notaDois * 3) + (notaTres * 5))/10;
			
			System.out.printf("%.1f\n", nota);
		}
		
		
		sc.close();
	}

}
