package Aula11.Heranca;


public class Funcionario {
    protected String nome;
    protected double salario;
    //Atributos comuns entre as classes

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.println(this.nome + " está trabalhando... pelo visto!");
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }
}
