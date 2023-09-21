public class Personagem{
    // atributos
    String nome;
    int energia;
    int fome;
    int sono;

    // comportamentos
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " esta cacando...");
            energia -= 2;
        }
        else{
            System.out.println(nome + " esta sem energia para cacar...");
        }
        fome = Math.min(fome + 1,10);
        sono = Math.min(sono + 1,10);
    }

    void comer(){
        if(fome >= 1){
            System.out.println(nome + " esta comendo....");
            fome -= 1;
            energia = Math.min(energia + 1,10);
        }
        else{
            System.out.println(nome + " nao esta com fome para comer...");
        }  
    }

    void dormir(){
        if(sono > 0){
            System.out.println(nome + " esta dormindo....");
            sono -= 1;
            energia = energia++ > 10 ? 10 : energia++;
        }
        else{
            System.out.println(nome + " nao esta com sono para dormir...");
        }
}