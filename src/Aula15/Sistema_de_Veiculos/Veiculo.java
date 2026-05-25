package Aula15.Sistema_de_Veiculos;

public abstract class Veiculo {
    private String modelo;
    private String marca;
    private String tipo;
    private int velocidade;

    public Veiculo(String modelo, String marca, String tipo, int velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public abstract void mostrarInformacoes();
    public abstract void buzinar();
}
