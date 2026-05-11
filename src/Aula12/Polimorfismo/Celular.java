package Aula12.Polimorfismo;

public class Celular extends DispositivoDeMidia{
    private String musica;
    private String artista;

    public Celular(String nome, String musica, String artista) {
        super(nome);
        this.musica = musica;
        this.artista = artista;
    }

    @Override
    public void reproduzir() {
        System.out.println("O " + this.nomeDoDispositivo + " está tocando a música: " + this.musica + " de " + this.artista);
    }
}
