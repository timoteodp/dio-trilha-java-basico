public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTV smartTV = new SmartTV();
       System.out.println();
       System.out.println("*******************************");
       System.out.println("TV Ligada? "+ smartTV.ligada);
       System.out.println("Canal Atual: " + smartTV.canal);
       System.out.println("Volume "+ smartTV.volume);
       System.out.println();


       smartTV.aumentarVolume();
       smartTV.aumentarVolume();
       smartTV.aumentarVolume();
       smartTV.aumentarVolume();
       smartTV.aumentarVolume();
       smartTV.diminuirVolume();
       smartTV.diminuirVolume();
       smartTV.diminuirVolume();
       smartTV.diminuirVolume();


       smartTV.ligar();
         System.out.println("Novo status de TV -> TV Ligada ? "+ smartTV.ligada);

       smartTV.desligar();

       System.out.println();
        System.out.println("Novo status de TV -> TV Ligada ? "+ smartTV.ligada);

        System.out.println( "Volume Atual "+ smartTV.volume);
    }
}
