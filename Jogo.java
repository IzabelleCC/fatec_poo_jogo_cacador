import java.util.Random;

public class Jogo {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var personagem = new Personagem("John");
        var soneca = new Personagem("Soneca", 0,5,10);

        while(true){
            int oQueFazer = gerador.nextInt(3); //[0...3[
            switch(oQueFazer){
                case 0:
                personagem.dormir();
                break;
                case 1:
                personagem.cacar();
                break;
                case 2:
                personagem.dormir();
                break;
            }            
            personagem.exibirEstado();
            System.out.println("*************************");
            Thread.sleep(8000);         
        
            System.out.println("*************************");
            
            var oQueOSonecaVaiFazer = gerador.nextDouble();
            if( oQueOSonecaVaiFazer <= 0.8){
                soneca.dormir();
            }
            else if(oQueOSonecaVaiFazer <= 0.9){
                soneca.comer();
            }
            else {
                soneca.cacar();
            }       
            soneca.exibirEstado();
            System.out.println("*************************");
            Thread.sleep(8000);
        }
    }        
}
