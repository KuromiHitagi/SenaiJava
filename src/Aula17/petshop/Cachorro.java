package Aula17.petshop;

public class Cachorro extends Animais{
    public Cachorro(String raca, String nome, int idade) {
        super("Cachorro", raca, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}