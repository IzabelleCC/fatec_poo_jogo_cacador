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
            System.out.println(nome + " esta sem enrgia para cacar...");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        System.out.println(nome + " está comendo....");
    }

    void dormir(){
        System.out.println(nome + " está dormindo...");
    }

}