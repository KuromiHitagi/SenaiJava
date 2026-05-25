package Aula15.Fazendinha;

public class Vaca extends Animal{
    private String nome;

    public Vaca(String nome) {
        super(nome, "Vaca");
        this.nome = nome;
    }

    @Override
    public void FazerSom() {
        System.out.println("A vaca: " + this.nome + " faz: mumu!");
    }
}
