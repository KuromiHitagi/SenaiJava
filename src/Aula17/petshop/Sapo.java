package Aula17.petshop;

public class Sapo extends Animais{
    public Sapo(String raca, String nome, int idade) {
        super("Sapo", raca, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O sapinho faz: wuebit!");
    }
}