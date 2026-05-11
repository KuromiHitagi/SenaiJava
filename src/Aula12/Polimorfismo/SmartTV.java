package Aula12.Polimorfismo;

public class SmartTV extends DispositivoDeMidia{
    private String filme;

    public SmartTV(String nome, String filme) {
        super(nome);
        this.filme = filme;
    }

    @Override
    public void reproduzir() {
        System.out.println("A " + this.nomeDoDispositivo + " está reproduzindo o filme: " + this.filme);
    }
}
