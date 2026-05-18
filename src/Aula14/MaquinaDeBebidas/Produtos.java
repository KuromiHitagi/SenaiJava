package Aula14.MaquinaDeBebidas;

public abstract class Produtos {
    protected String nome;
    protected String tipo;
    protected double valor;

    public Produtos(String nome, String tipo, double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }
}

class Bebidas extends Produtos {
    public Bebidas(String nome, double valor) {
        super(nome, "Bebida", valor);
    }
}

class Comida extends Produtos {
    public Comida(String nome, double valor) {
        super(nome, "Comida", valor);
    }

    public void Comer() {

    }
}