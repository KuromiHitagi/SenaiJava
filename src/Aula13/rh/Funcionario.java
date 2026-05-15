package Aula13.rh;

import java.util.Scanner;

class Funcionario {
    private String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 2000.0;
    }
}

class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor(String nome, double salarioBase, double totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * 0.1);
    }
}

class folhaPagamento {
    public void imprimirContratoCheque(Funcionario f) {
        System.out.println("Nome: " + f.getNome());
        System.out.println("Cargo: " + f.getClass().getSimpleName());
        System.out.printf("Total a receber: R$%.2f", f.calcularSalario());
    }
}