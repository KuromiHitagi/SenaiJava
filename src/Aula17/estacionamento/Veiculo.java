package Aula17.estacionamento;

public abstract class Veiculo {
    protected String tipo;
    protected String marca;
    protected String modelo;
    protected String placa;

    public Veiculo(String tipo, String marca, String modelo, String placa) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public void exibirDados() {
        System.out.println("Tipo: " + tipo + " | Marca: " + marca + " | Modelo: " + modelo + " | Placa: " + placa);
    }
}
