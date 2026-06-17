package Aula17.petshop;

import Aula17.estacionamento.Estacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while(op != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Exibir os Animais cadastrados");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (op) {
                case 1:
                    cadAnimal(sc);
                    break;
                case 2:
                    PetShop.exibirAnimais();
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

    public static void cadAnimal(Scanner sc) {
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("Digite a espécie desejada: ");
        String especie = sc.nextLine();

        System.out.println("Digite a raça do " + especie);
        String raca = sc.nextLine();

        System.out.println("Digite o nome do " + especie);
        String nome = sc.nextLine();

        System.out.println("Digite a idade do " + especie);
        int idade = sc.nextInt();

        sc.nextLine();

        switch (especie) {
            case "passaro", "ave":
                Passaro newBird = new Passaro(raca, nome, idade);
                PetShop.addAnimais(newBird);
                break;

            case "canino", "cachorro":
                Cachorro newDog = new Cachorro(raca, nome, idade);
                PetShop.addAnimais(newDog);
                break;

            case "gato", "felino":
                Gato newCat = new Gato(raca, nome, idade);
                PetShop.addAnimais(newCat);
                break;

            case "sapo", "anfíbio":
                Sapo newAnphibian = new Sapo(raca, nome, idade);
                PetShop.addAnimais(newAnphibian);
                break;

            default:
                System.out.println("Digitou errado ou não disponível!");
                break;
        }
    }
}
