package Aula15.Sistema_de_Veiculos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        Veiculo[] garagem = new Veiculo[10];
        int qtdVeiculos = 0;

        while(op != 5) {
            pularLinha();

            System.out.println("--- MENU ---");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão");
            System.out.println("4 - Ver Garagem");
            System.out.println("5 - Get out");
            System.out.println("\nFaça sua escolha: ");
            op = sc.nextInt();

            while(op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
                System.out.println("Escolha entre 1 e 4: ");
                op = sc.nextInt();
            }
            sc.nextLine();

            if((op >= 1 && op <= 3) && qtdVeiculos >= garagem.length) {
                System.out.println("A garagem já está cheia! ");
                return;
            }

            switch (op) {
                case 1:
                    garagem[qtdVeiculos] = carro(sc);
                    qtdVeiculos++;
                    break;

                case 2:
                    garagem[qtdVeiculos] = moto(sc);
                    qtdVeiculos++;
                    break;

                case 3:
                    garagem[qtdVeiculos] = caminhao(sc);
                    qtdVeiculos++;
                    break;

                case 4:
                    mostrarGaragem(garagem, qtdVeiculos, sc);
                    break;

                case 5:
                    System.out.println("Desligando...");
                    return;
            }
        }
    }

    public static Veiculo carro(Scanner sc) {
        pularLinha();

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite a marca do carro: ");
        String marca = sc.nextLine();

        System.out.println("Digite a velocidade máxima do carro: ");
        int velocidade = sc.nextInt();
        sc.nextLine();

        Veiculo veiculo = new Carro(modelo, marca, velocidade);

        sc.nextLine();
        return veiculo;
    }

    public static Veiculo moto(Scanner sc) {
        pularLinha();

        System.out.println("Digite o modelo da moto: ");
        String modelo = sc.nextLine();

        System.out.println("Digite a marca da moto: ");
        String marca = sc.nextLine();

        System.out.println("Digite a velocidade máxima da moto: ");
        int velocidade = sc.nextInt();
        sc.nextLine();

        Veiculo veiculo = new Moto(modelo, marca, velocidade);

        sc.nextLine();
        return veiculo;
    }

    public static Veiculo caminhao(Scanner sc) {
        pularLinha();

        System.out.println("Digite o modelo do caminhão: ");
        String modelo = sc.nextLine();

        System.out.println("Digite a marca do caminhão: ");
        String marca = sc.nextLine();

        System.out.println("Digite a velocidade máxima do caminhão: ");
        int velocidade = sc.nextInt();
        sc.nextLine();

        Veiculo veiculo = new Caminhao(modelo, marca, velocidade);

        sc.nextLine();
        return veiculo;
    }

    public static void mostrarGaragem(Veiculo[] garagem, int qtdVeiculo, Scanner sc) {
        System.out.println("\n=== VEÍCULOS NA GARAGEM ===");

        if (qtdVeiculo == 0) {
            System.out.println("A garagem está vazia!");
            sc.nextLine();
            return;
        }

        // Percorre apenas até o total de veículos inseridos para evitar NullPointerException
        for (int i = 0; i < qtdVeiculo; i++) {
            System.out.println("\nVaga " + (i + 1) + ":");
            garagem[i].mostrarInformacoes();
            garagem[i].buzinar();
            System.out.println("-------------------------");
        }

        sc.nextLine();
    }

    public static void pularLinha() {
        for(int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
}
