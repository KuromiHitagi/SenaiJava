package Aula15.Sistema_de_Veiculos;

public class Carro extends Veiculo{

    public Carro(String modelo, String marca, int velocidade) {
        super(modelo, marca, "carro", velocidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Tipo: Carro");
        System.out.println("Velocidade Máxima: " + getVelocidade() + "km/h");
    }

    @Override
    public void buzinar() {
        System.out.println("O carro buzina: beep beep!");
    }
}
