package Aula11.Garagem;

public class Carro extends Veiculo{
    private int cavalos;

    public Carro(String tipo, String marca, String cor, String modelo, int cavalos) {
        super(tipo, marca, cor, modelo);
        this.cavalos = cavalos;
    }
}
