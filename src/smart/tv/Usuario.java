package smart.tv;

public class Usuario {
    
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("volume Atual ? " + smartTv.volume);
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("volume Atual ? " + smartTv.volume);
        System.out.println(""+ smartTv);
       
        smartTv.ligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("TV Desligada ? " + smartTv.ligada);
    }
    
}
