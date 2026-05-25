package Aula15.Fazendinha;

public class Cachorro extends Animal{
    private String nome;

    public Cachorro(String nome) {
        super(nome, "Cachorro");
        this.nome = nome;
    }

    @Override
    public void FazerSom() {
        System.out.println("O doggo " + this.nome + " faz: au au!");
    }
}