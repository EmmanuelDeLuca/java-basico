public class Conta {
    //Variável da classe conta
    double saldo = 10.0;
    
    public void sacar( double valor) {
        // Variável local de método
        double novoValor = saldo - valor;
    }

    public void imprimirSaldo() {
        //A variável saldo está disponível em toda classe
        System.out.println(saldo);
        //Somente o método sacar reconhece essa variável
        //System.out.println(novoValor);
    }

    public void calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x=1; x<=5; x++){
            //esta variável será reiniciada a cada execução
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        //escopo de fluxo
        // x e valorCalculado nunca estarão disponíveis fora do método
    }
}
