package entities;

public class Conta {
	private String nome;
	private int numero;
	private double saldo;
	
	
	
	public Conta(String nome, int numero, double valorInicial) {

		this.nome = nome;
		this.numero = numero;
		deposito(valorInicial);
	}
	
	public Conta(String nome, int numero) {

		this.nome = nome;
		this.numero = numero;
	
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		 this.saldo += valor; 
	}
	
	public void saque(double valor) {
		this.saldo -= valor + 5.0; 
	}
	public String toString() {
		return "Account " 
				+ numero 
				+ ", Holder: " 
				+ nome 
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
}
