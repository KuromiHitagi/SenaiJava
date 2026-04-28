package Aula11.Garagem;

import java.util.Scanner;

public class Garagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on = true;

        while (on) {
            System.out.println("==== MENU ====");
            System.out.println("[1]. Carro");
            System.out.println("[2]. Moto");
            System.out.println("[0]. Sair");
            System.out.println("Digite o número que deseja: ");
            String opt = sc.nextLine();
            on = verify(opt, sc, on);
        }
    }

    public static boolean verify(String opt, Scanner sc, boolean on) {
        switch (opt) {
            case "1":
                carroo(sc);
                break;

            case "2":
                motoo(sc);
                break;

            case "0":
                on = false;
                break;

            default:
                System.out.println("Digitou errado burro!");
                break;
        }
        return on;
    }

    public static void carroo(Scanner sc) {
        boolean on = true;
        Carro carro;

        while(on) {
            System.out.println("==== MENU CARRO ====");
            System.out.println("[1]. Cadastrar carro");
            System.out.println("[0]. Sair");
            System.out.println("Escolha um número: ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1":
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Digite a marca do carro: ");
                    String marca = sc.nextLine();

                    System.out.println("Digite a cor do carro: ");
                    String cor = sc.nextLine();

                    System.out.println("Digite o modelo do carro: ");
                    String modelo = sc.nextLine();

                    System.out.println("Digite a quantidade de cavalos do carro: ");
                    int cavalos = sc.nextInt();
                    sc.nextLine();

                    carro = new Carro("Carro", marca, cor, modelo, cavalos);

                    System.out.println("==== MENU CARRO 2 ====");
                    System.out.println("[1]. Ligar");
                    System.out.println("[2]. Desligar");
                    System.out.println("Escolha um número: ");
                    String opt2 = sc.nextLine();

                    switch (opt2) {
                        case "1":
                            ligarC(carro);
                            break;

                        case "2":
                            desligarC(carro);
                            break;

                        default:
                            System.out.println("Escolheu errado jumento!");
                            break;
                    }
                    break;

                case "0":
                    on = false;
                    break;

                default:
                    System.out.println("Digitou errado burro!");
                    break;
            }
        }
    }
    public static void ligarC(Carro carro){
        carro.ligar();
    }
    public static void desligarC(Carro carro) {
        carro.desligar();
    }

    public static void motoo(Scanner sc) {
        boolean on = true;
        Moto moto;

        while(on) {
            System.out.println("==== MENU MOTO ====");
            System.out.println("[1]. Cadastrar moto");
            System.out.println("[0]. Sair");
            System.out.println("Escolha um número: ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1":
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Digite a marca da moto: ");
                    String marca = sc.nextLine();

                    System.out.println("Digite a cor da moto: ");
                    String cor = sc.nextLine();

                    System.out.println("Digite o modelo da moto: ");
                    String modelo = sc.nextLine();

                    System.out.println("Digite as cilindradas da moto: ");
                    int cilindradas = sc.nextInt();
                    sc.nextLine();


                    moto = new Moto("Moto", marca, cor, modelo, cilindradas);

                    System.out.println("==== MENU MOTO 2 ====");
                    System.out.println("[1]. Ligar");
                    System.out.println("[2]. Desligar");
                    System.out.println("Escolha um número: ");
                    String opt2 = sc.nextLine();

                    switch (opt2) {
                        case "1":
                            ligarM(moto);
                            break;

                        case "2":
                            desligarM(moto);
                            break;

                        case "3":
                            grau(moto);
                            break;

                        default:
                            System.out.println("Escolheu errado jumento!");
                            break;
                    }
                    break;

                case "0":
                    on = false;
                    break;

                default:
                    System.out.println("Digitou errado burro!");
                    break;
            }
        }
    }
    public static void ligarM(Moto moto){
        moto.ligar();
    }
    public static void desligarM(Moto moto) {
        moto.desligar();
    }
    public static void grau(Moto moto) {
        moto.grau();
    }
}
