package Aula17.petshop;

public class Passaro extends Animais{
    public Passaro(String raca, String nome, int idade) {
        super("Pássaro", raca, nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O pássaro faz: bem-te-vi!");
    }
}
