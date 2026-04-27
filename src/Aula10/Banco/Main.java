package Aula10.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria(100.0);

        boolean on = true;
        double valor = 0.0;

        while(on) {
            System.out.println("=== MENU ===");
            System.out.println("[1]. Sacar");
            System.out.println("[2]. Depositar");
            System.out.println("[3]. Ver saldo");
            System.out.println("[0]. Sair");
            System.out.println("Digite o número desejado: ");
            String opt = sc.nextLine();

            System.out.println("\n\n\n\n");
            switch (opt) {
                case "1":
                    System.out.println("Digite o valor que deseja sacar: ");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    minhaConta.sacar(valor);
                    break;

                case "2":
                    System.out.println("Digite o valor que deseja depositar: ");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    minhaConta.depositar(valor);
                    break;

                case "3":
                    System.out.println("Saldo: " + minhaConta.getSaldo());
                    break;

                case "0":
                    on = false;
                    break;
            }
            System.out.println("\n\n\n\n");
        }

        System.out.println("Saldo final: " + minhaConta.getSaldo());
    }
}
