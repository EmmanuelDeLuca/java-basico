import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    
    // Criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    // Solicitando informações do usuário
    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();

    //Imprimindo os dados informados pelo usuário
    System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm");

  }
}
