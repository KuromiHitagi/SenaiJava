package Aula17.petshop;

public class Gato extends Animais{
    public Gato(String raca, String nome, int idade) {
        super("Gato", raca, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gatinho faz: Miau!");
    }
}