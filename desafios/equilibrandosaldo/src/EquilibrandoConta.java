import java.util.Locale;
import java.util.Scanner;

public class EquilibrandoConta {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       double saldoAtualizado = (saldoAtual + valorDeposito) - valorRetirada;

      //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
      System.out.println("Saldo atualizado na conta: " + saldoAtualizado);
    }
}
