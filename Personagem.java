public class Personagem{
    // atributos
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    Personagem(String nome){
        this.nome = nome;
    }

    Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome;
        if(energia >0 && energia <=10){
            this.energia = energia;
        }
        if(fome >0 && fome <=10){
            this.fome = fome;
        }
        if(sono >0 && sono <=10){
            this.sono = sono;
        }
    }
    // comportamentos
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " caçou");
            energia -= 2;
        }
        else{
            System.out.println(nome + " esta sem energia para cacar");
        }
        fome = Math.min(fome + 1,10);
        sono = Math.min(sono + 1,10);
    }
    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comeu");
            fome -= 1;
            energia = Math.min(energia + 1,10);
        }
        else{
            System.out.println(nome + " nao esta com fome para comer");
        }  
    }
    void dormir(){
        if(sono > 0){
            System.out.println(nome + " dormiu");
            sono -= 1;
            energia = energia++ > 10 ? 10 : energia++;
        }
        else{
            System.out.println(nome + " nao esta com sono para dormir");
        }
    }
    void exibirEstado(){
        System.out.printf("%s-> e: %d, f: %d, s: %d\n",nome, energia, fome, sono);
    }

}