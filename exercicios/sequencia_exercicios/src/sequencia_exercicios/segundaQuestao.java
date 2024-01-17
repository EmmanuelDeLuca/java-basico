package sequencia_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class segundaQuestao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		System.out.println("Entrada:");
		
		String raioStr = sc.next();
        double raio = Double.parseDouble(raioStr);
		double pi = 3.14159;
		double area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A = %.4f", area);
		
		sc.close();
		

	}

}
