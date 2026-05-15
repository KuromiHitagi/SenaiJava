package Aula13.rh;

import java.util.Scanner;

public class SistemaRH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        folhaPagamento rh = new folhaPagamento();

        System.out.println("Sistema de gestão de pessoas");
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o salário base: ");
        double salarioBase = sc.nextDouble();

        while (salarioBase <= 0.0) {
            System.out.println("Digite um salário maior que 0: ");
            salarioBase = sc.nextDouble();
        }

        System.out.println("Selecione o cargo: ");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        int op = sc.nextInt();

        while (op != 1 && op != 2) {
            System.out.println("Digite 1 ou 2: ");
            op = sc.nextInt();
        }

        Funcionario colaborador = null;

        if (op == 1) {
            colaborador = new Gerente(nome, salarioBase);
        }

        else{
            System.out.println("Digite quantas vendas houveram: ");
            int vendas = sc.nextInt();

            while (vendas < 0) {
                System.out.println("Digite realmente quantas vendas foram: ");
                vendas = sc.nextInt();
            }

            colaborador = new Vendedor(nome, salarioBase, vendas);
        }

        rh.imprimirContratoCheque(colaborador);

        sc.close();
    }
}
