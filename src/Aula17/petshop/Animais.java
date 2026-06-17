package Aula17.petshop;

public abstract class Animais {
    protected String especie;
    protected String raca;
    protected String nome;
    protected int idade;

    public Animais(String especie, String raca, String nome, int idade) {
        this.especie = especie;
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();

    public void exibirDados() {
        System.out.println("\n | Espécie: " + this.especie + " | Raça: " + this.raca + " | Nome: " + this.nome + " | Idade: " + this.idade + " |");
        emitirSom();
    }
}
