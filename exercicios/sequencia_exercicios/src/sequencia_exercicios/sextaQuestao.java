package sequencia_exercicios;


import java.util.Locale;
import java.util.Scanner;

public class sextaQuestao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, trianguloArea, circuloArea, pi, trapezioArea, quadradoArea, retanguloArea;
		
		pi =  3.14159;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		trianguloArea = (a * c)/2;
		circuloArea =  pi * (Math.pow(c, 2));
		trapezioArea = ((a + b)*c)/2;
		quadradoArea = Math.pow(b, 2);
		retanguloArea = a * b;
		
		System.out.printf("TRIÂNGULO = %.3f\n", trianguloArea);
		System.out.printf("CIRCULO = %.3f\n", circuloArea);
		System.out.printf("TRAPÉZIO = %.3f\n", trapezioArea);
		System.out.printf("QUADRADO = %.3f\n", quadradoArea);
		System.out.printf("RETÂNGULO = %.3f", retanguloArea);
		
		
		sc.close();

	}

}
