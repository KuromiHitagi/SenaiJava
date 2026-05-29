package Aula16.Delivery;

public class Local {
    private String rua;
    private int numero;
    private String bairro;

    public Local(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public void entrega() {
        System.out.println("Saindo para a entrega na residência: ");
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Rua: " + this.rua);
        System.out.println("Numero: " + this.numero);

        System.out.println("30 minutos depois...");
        System.out.println("beep! beep!! beep!!!");
        System.out.println("Entrega para o senhor.. ugh, Johnny Joestar?");
    }
}
