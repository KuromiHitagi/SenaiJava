package Aula15.Sistema_de_Veiculos;

public class Moto extends Veiculo{

    public Moto(String modelo, String marca, int velocidade) {
        super(modelo, marca, "moto", velocidade);
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
        System.out.println("A moto buzina: bip bip!");
    }
}
