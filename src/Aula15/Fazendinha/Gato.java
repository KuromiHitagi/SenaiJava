package Aula15.Fazendinha;

public class Gato extends Animal{
    private String nome;

    public Gato(String nome) {
        super(nome, "Gato");
        this.nome = nome;
    }

    @Override
    public void FazerSom() {
            System.out.println("O gato: " + this.nome + " faz: miau!");
    }
}