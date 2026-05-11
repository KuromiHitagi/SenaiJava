package Aula12.Polimorfismo;

public class RadioAutomotivo extends DispositivoDeMidia{
    private double estacao;

    public RadioAutomotivo(String nome, double estacao) {
        super(nome);
        this.estacao = estacao;
    }

    @Override
    public void reproduzir() {
        System.out.println("O " + this.nomeDoDispositivo + " está na estação: " + this.estacao);
    }
}
