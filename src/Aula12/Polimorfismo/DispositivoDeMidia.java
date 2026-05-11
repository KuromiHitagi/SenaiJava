package Aula12.Polimorfismo;

public abstract class DispositivoDeMidia {
    protected String nomeDoDispositivo;

    public DispositivoDeMidia(String nome) {
        this.nomeDoDispositivo = nome;
    }

    public abstract void reproduzir();

    public void desligar() {
        System.out.println(this.nomeDoDispositivo + " está desligando.");
    }
}
