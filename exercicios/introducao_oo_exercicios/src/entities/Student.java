package entities;

public class Student {
	public String nome;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;
	public double media;
	
	public double notalFinal() {
		media =  primeiraNota + segundaNota + terceiraNota;
		return media;		
	}
	public String resultado() {
		if (media >= 60) {
			return "PASS";
		}
		else {
			return "FAILED";
		}
	}
}
