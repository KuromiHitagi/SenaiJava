package Aula16.Delivery;

public class Pedido {
    private String nome;
    private String conteudo;
    private double valor;

    public Pedido(String nome, String conteudo, double valor) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public double getValor() {
        return this.valor;
    }
}
