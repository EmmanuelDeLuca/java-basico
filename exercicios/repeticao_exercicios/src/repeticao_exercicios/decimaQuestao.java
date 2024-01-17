package repeticao_exercicios;


import java.util.Scanner;

public class decimaQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int quadrado, cubo;
		for (int i = 1; i <= numero; i++) {
			quadrado = i * i;
			cubo = i * i * i;
			
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();
	}

}
