package Aula11.Garagem;

public class Moto extends Veiculo{
    private int cilindradas;


    public Moto(String tipo, String marca, String cor, String modelo, int cilindradas) {
        super(tipo, marca, cor, modelo);
        this.cilindradas = cilindradas;
    }

    public void grau() {
        System.out.println("Sua " + this.marca
                + " " + this.modelo
                + " de " + this.cilindradas
                + " deu grau!");
    }
}
