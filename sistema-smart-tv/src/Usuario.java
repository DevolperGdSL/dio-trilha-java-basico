public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Volume Atual : " + smartTv.volume);
        System.out.println("Canal Atual : " + smartTv.canal);    

        smartTv.ligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);


        smartTv.desligar();
        System.out.println("Tv ligada ? " + smartTv.ligada);
    }
}
