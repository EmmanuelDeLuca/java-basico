import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BancoApp {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;
        
        String resultado = " ";

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        BancoApp calcular = new BancoApp();
        valorFinal = calcular.investimento(valorFinal, taxaJuros, periodo);
        resultado = df.format(valorFinal);
        


        System.out.println("Valor final do investimento: R$ " + resultado);
        
        scanner.close();
    }
    public Double investimento(double valorInicial, double taxaJuros, int periodo){
       return valorInicial * Math.pow(1 + taxaJuros, periodo);
  
    }
}
