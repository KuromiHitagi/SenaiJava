package Aula10.Banco;

public class ContaBancaria {
    private double saldo;
    /// ATRIBUTO DA CLASSE 'ContaBancaroa'

    public ContaBancaria(double saldoInicial) {
        if(saldoInicial > 0.0) {
            this.saldo = saldoInicial;
        } else{
            this.saldo = 0.0;
        }
    } /// MÉTODO CONSTRUTOR DA CLASSE 'ContaBancaria'


    public void depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! \nNovo valor: " + this.saldo);
        } else{
            System.out.println("Falha no depósito, valor inválido!");
        }
    } /// MÉTODO QUE DEPOSITA UM VALOR NO SALDO


    public void sacar(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! \nNovo saldo: " + this.saldo);
        } else if(valor > 0.0 && valor > this.saldo) {
            System.out.println("Valor desejado maior do que disponível no saldo!");
        } else{
            System.out.println("Saque de valor inválido!");
        }
    } /// MÉTODO QUE REALIZA O SAQUE DO SALDO


    public double getSaldo() {
        return this.saldo;
    } /// MÉTODO QUE INFORMA O SALDO
}
