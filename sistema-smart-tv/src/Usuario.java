public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        //Verificando o estado atual da Tv
        System.out.println("A SmartTV está ligada ? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        //Mudando o estado atual da Tv
        smartTv.ligar();
        System.out.println("A SmartTV está ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A SmartTV está ligada ? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("A SmartTV está ligada ? " + smartTv.ligada);

        //Aumentando e Diminuindo o volume da TV
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
       
        //Mudando de Canal
        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(21);

    }
}
