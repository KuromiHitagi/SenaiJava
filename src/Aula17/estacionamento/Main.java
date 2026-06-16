package Aula17.estacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Veiculo");
            System.out.println("2. Exibir Veiculos");
            System.out.println("3. Quantidade de Veiculos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (op) {
                case 1:
                    cadVeiculo(sc);
                    break;
                case 2:
                    Estacionamento.exibirVeiculos();
                    break;
                case 3:
                    Estacionamento.quantidadeVeiculos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema... (Jojo é muito bom mesmo!)");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        sc.close();
    }

    public static void cadVeiculo(Scanner sc) {
        System.out.println("Digite o tipo de veículo (Ex: Carro, Moto, Caminhão): ");
        String tipo = sc.nextLine();

        System.out.println("Digite a marca do veículo: ");
        String marca = sc.nextLine();

        System.out.println("Digite a modelo do veículo: ");
        String modelo = sc.nextLine();

        System.out.println("Digite a placa do veículo: ");
        String placa = sc.nextLine();

        switch (tipo) {
            case "carro", "Carro":
                Carro novoCarro = new Carro(marca, modelo, placa);
                Estacionamento.addVeiculo(novoCarro);
                break;

            case "moto", "Moto":
                Moto novaMoto = new Moto(marca, modelo, placa);
                Estacionamento.addVeiculo(novaMoto);
                break;

            case "caminhão", "Caminhão":
                Caminhao novoCaminhao = new Caminhao(marca, modelo, placa);
                Estacionamento.addVeiculo(novoCaminhao);
                break;

            default:
                System.out.println("Você digitou algo errado!");
                break;
        }
    }
}