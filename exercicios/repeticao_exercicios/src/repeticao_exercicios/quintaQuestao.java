package repeticao_exercicios;


import java.util.Scanner;

public class quintaQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroN = sc.nextInt();
		int inQuantidade = 0;
		int outQuantidade = 0;
		
		for (int i = 1; i <= numeroN; i++ ) {
			int valores = sc.nextInt();
			if (valores >= 10 && valores <= 20) {
				inQuantidade ++;
			}
			else {
				outQuantidade ++;
			}
		}
		System.out.println(inQuantidade + " in");
		System.out.println(outQuantidade + " out");
		
		
		sc.close();
	}

}
