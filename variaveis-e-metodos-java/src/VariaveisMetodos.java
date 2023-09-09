public class VariaveisMetodos {
  
  public static void main(String[] args) {
    // -----------------------------------Variáveis-----------------------------------
    // Estrutura = Tipo nomeBemDefinido = Atribuição (opcional em alguns casos)
    // Exemplo
    String meuNome = "Emmanuel";
    int anoDeNascimento = 2001;
    boolean verdadeiroOuFalso = true;

    System.out.println(meuNome);
    System.out.println(anoDeNascimento);
    System.out.println(verdadeiroOuFalso);
    

    // -----------------------------------Métodos-----------------------------------    
    //Estrutura TipoRetorno nomeObjetivoNoInfinitivo Parametro(s)
    //Exemplo
    String primeiroNome = "Emmanuel";
    String segundoNome = "De Luca";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
