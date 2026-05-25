package Aula15.Sistema_de_Veiculos;

public class Caminhao extends Veiculo{

    public Caminhao(String modelo, String marca, int velocidade) {
        super(modelo, marca, "caminhão", velocidade);
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
        System.out.println("O caminhão buzina: bom bomm!");
    }
}
