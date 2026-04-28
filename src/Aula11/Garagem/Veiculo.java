package Aula11.Garagem;

public class Veiculo {
    protected String tipo;
    protected String marca;
    protected String cor;
    protected String modelo;

    public Veiculo(String tipo, String marca, String cor, String modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println("O(A) " + this.tipo
                + " " + this.marca
                + " " + this.modelo
                + " ligou!");
    }

    public void desligar() {
        System.out.println("O(A) " + this.tipo
                + " " + this.marca
                + " " + this.modelo
                + " desligou!");
    }
}
