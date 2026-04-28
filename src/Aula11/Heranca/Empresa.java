package Aula11.Heranca;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on = true;

        while(on) {
            System.out.println("==== MENU ====");
            System.out.println("[1]. Gerente");
            System.out.println("[2]. Dev Back");
            System.out.println("[3]. Dev Front");
            System.out.println("[0]. Sair");
            System.out.println("Digite o número que deseja: ");
            String opt = sc.nextLine();
            on = verify(opt, sc, on);

        }
    }

    public static boolean verify(String opt, Scanner sc, boolean on) {
        switch (opt) {
            case "1":
                gerentee(sc);
                break;

            case "2":
                devBacke(sc);
                break;

            case "3":
                devFronte(sc);
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

    public static void gerentee(Scanner sc) {
        boolean on = true;
        Gerente gerente;

        while(on) {
            System.out.println("==== MENU GERENTE ====");
            System.out.println("[1]. Cadastrar gerente");
            System.out.println("[0]. Sair");
            System.out.println("Escolha um número: ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1":
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Digite o nome do gerente: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o salário do gerente: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite o departamento do gerente: ");
                    String departamento = sc.nextLine();

                    gerente = new Gerente(nome, salario, departamento);

                    System.out.println("==== MENU GERENTE 2 ====");
                    System.out.println("[1]. Aprovar verba");
                    System.out.println("[2]. Verificar trabalho");
                    System.out.println("Escolha um número: ");
                    String opt2 = sc.nextLine();

                    switch (opt2) {
                        case "1":
                            aprovarVerba(gerente);
                            break;

                        case "2":
                            trabalharG(gerente);
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
    public static void aprovarVerba(Gerente gerente){
        gerente.aprovarVerba();
    }
    public static void trabalharG(Gerente gerente) {
        gerente.trabalhar();
    }

    public static void devBacke(Scanner sc) {
        boolean on = true;
        DevBackend devBack;

        while (on) {
            System.out.println("==== MENU BACKEND ====");
            System.out.println("[1]. Cadastrar dev");
            System.out.println("[0]. Sair");
            System.out.println("Escolha um número: ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1":
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Digite o nome do dev: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o salário do dev: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a linguagem do dev: ");
                    String linguagem = sc.nextLine();

                    devBack = new DevBackend(nome, salario, linguagem);

                    System.out.println("==== MENU BACKEND 2 ====");
                    System.out.println("[1]. Programar");
                    System.out.println("[2]. Verificar trabalho");
                    System.out.println("Escolha um número: ");
                    String opt2 = sc.nextLine();

                    switch (opt2) {
                        case "1":
                            programarB(devBack);
                            break;

                        case "2":
                            trabalharB(devBack);
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
    public static void programarB(DevBackend devBack){
        devBack.programar();
    }
    public static void trabalharB(DevBackend devBack) {
        devBack.trabalhar();
    }

    public static void devFronte(Scanner sc) {
        boolean on = true;
        DevFrontend devFront;

        while (on) {
            System.out.println("==== MENU FRONTEND ====");
            System.out.println("[1]. Cadastrar dev");
            System.out.println("[0]. Sair");
            System.out.println("Escolha um número: ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1":
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Digite o nome do dev: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o salário do dev: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a linguagem do dev: ");
                    String linguagem = sc.nextLine();

                    devFront = new DevFrontend(nome, salario, linguagem);
                        System.out.println("==== MENU FRONTEND 2 ====");
                    System.out.println("[1]. Programar");
                    System.out.println("[2]. Verificar trabalho");
                    System.out.println("Escolha um número: ");
                    String opt2 = sc.nextLine();

                    switch (opt2) {
                        case "1":
                            programarF(devFront);
                            break;

                        case "2":
                            trabalharF(devFront);
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
    public static void programarF(DevFrontend devFront){
        devFront.programar();
    }
    public static void trabalharF(DevFrontend devFront) {
        devFront.trabalhar();
    }
}
