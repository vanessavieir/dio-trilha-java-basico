
public class usuario {
    public static void main(String[] args) throws Exception{
        
        smartTv smartTv= new smartTv();

        System.out.println("A Tv está ligada? " + smartTv.ligada);

        System.out.println("Qual o canal que a Tv está transmitindo no momento? "+ smartTv.canal);

        System.out.println("Qual o volume da Tv? "+smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status > Tv ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status> Tv desligada? "+smartTv.ligada);


        smartTv.aumentarVolume();
        System.out.println("volume aumentado "+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("volume diminuído "+smartTv.volume);
    }


}
