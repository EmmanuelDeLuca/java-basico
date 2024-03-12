package entities;

public class CurrencyConverter {

	public static final double IMPOSTO = 0.06;
	
	public static double cotacao(double dolarValor, double quantidade) {
		double resultado = dolarValor * quantidade;
		return resultado += resultado * IMPOSTO;
		
	}
	
}
