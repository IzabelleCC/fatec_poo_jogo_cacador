public class Personagem{
    // atributos
    String nome;
    int energia;
    int fome;
    int sono;

    // comportamentos
    void cacar(){
        System.out.println(nome + " está caçando...");
    }

    void comer(){
        System.out.println(nome + " está comendo....");
    }

    void dormir(){
        System.out.println(nome + " está dormindo...");
    }

}