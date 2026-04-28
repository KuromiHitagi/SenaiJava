package Aula11.Banco;

public class Conta {
    protected int numero;
    protected Cliente titular;
    protected double saldo;
    private static int totalDeContas = 0;

    public Conta(Cliente titular) {
        Conta.totalDeContas++;
        this.numero = totalDeContas;
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else{
            System.out.println("Por favor insira um valor acima de $0");
        }
    }
}
