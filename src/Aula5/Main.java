package Aula5;
import java.util.Scanner;
import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String escolhaF = menu(read);
        verify(read, escolhaF);

        read.close();
    }

    public static String menu(Scanner read) {
        System.out.println("*** Bem Vindo à Aula 5***");
        System.out.println("[1]. Vetores Nome");
        System.out.println("[2]. Vetores Número");
        System.out.println("[3]. Vetores Cor");
        System.out.println("[4]. Vetores Nota");
        System.out.println("[5]. Menu VIP");

        String escolha = read.nextLine();
        return formatarTexto(escolha);
    }

    public static void verify(Scanner read, String escolhaF) {
        if(escolhaF.equals("vetores nome") || escolhaF.equals("1")) {
            vetoresNom(read);
        } else if(escolhaF.equals("vetores numero") || escolhaF.equals("2")) {
            vetoresNum(read);
        } else if(escolhaF.equals("vetores cor") || escolhaF.equals("3")) {
            vetoresCor(read);
        } else if(escolhaF.equals("vetores nota") || escolhaF.equals("4")) {
            vetoresNota(read);
        } else if(escolhaF.equals("menu vip") || escolhaF.equals("5")) {
            vip(read);
        }
    }

    public static void vip(Scanner read) {
        String [] convidados = new String[10];
        int opt;

        do {
            System.out.println("\n === MENU VIP === \n");
            System.out.println("1 - Cadastrar convidado");
            System.out.println("2 - Listar convidado");
            System.out.println("3 - Remover convidado");
            System.out.println("0 - Sair");
            System.out.println("\nEscolha uma opção: ");
            opt = read.nextInt();
            read.nextLine();

            switch(opt) {
                case 1:
                    boolean cadastrado = false;

                    for(int i = 0; i < convidados.length; i++) {

                        if(convidados[i] == null) {
                            System.out.println("\nDigite o nome do convidado: ");
                            convidados[i] = read.nextLine();

                            System.out.println("Convidado adicionado com sucesso!");
                            cadastrado = true;
                            break;
                        }
                        if(!cadastrado) {
                            System.out.println("Capacidade máxima atingida");
                        }
                    }

                    break;

                case 2:
                    for(int i = 0; i < convidados.length; i++) {
                        if(convidados[i] != null) {
                            System.out.printf("%dº convidado: %s%n", i + 1, convidados[i]);
                        }
                    }

                    try {
                        Thread.sleep(2500); // Dá 1,5 segundos para o usuário ler
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    char sair = 'n';
                    do {
                        System.out.println("Digite o nome exato para remover: ");
                        String texto = read.nextLine();
                        boolean removido = false;

                        for (int i = 0; i < convidados.length; i++) {
                            if (convidados[i] != null && convidados[i].equalsIgnoreCase(texto)) {
                                convidados[i] = null;
                                System.out.println("Convidado removido!");
                                removido = true;
                                break;
                            }
                        }
                        if (!removido) System.out.println("Convidado não encontrado.");

                        try {
                            Thread.sleep(2500); // Dá 1,5 segundos para o usuário ler
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("Digite 's' para sair e 'n' para tirar mais alguém: ");
                        sair = read.nextLine().charAt(0);
                    } while(sair == 'n');

                    break;

                case 0:
                    opt = 0;
                    break;
            }
        } while (opt != 0);
    }

    public static void vetoresNota(Scanner read) {
        double [] notas = {8.5, 7.0, 9.0, 6.5};
        double soma = 0;

        System.out.println("Notas Bimestrais");

        for(int i = 0; i < notas.length; i++) {
            System.out.println(i+1 + "º Bimestre: " + notas[i]);
            soma = soma + notas[i];
        }

        double media = soma / notas.length;
        System.out.println("-----------------------------");
        System.out.printf("%nSoma Total: %.2f", soma);
        System.out.printf("%nMédia Final: %.2f", media);
    }

    public static void vetoresCor(Scanner read) {
        String [] cores = {"Ciano", "Amarelo", "Azul", "Vermelho", "Verde", "Roxo"};

        System.out.println("A primeira cor é: " + cores[0]);
        System.out.println("A última cor é: " + cores[5]);
        System.out.println("\n --- Lista completa de cores --- \n");

        for(int i = 0; i < cores.length; i++) {
            System.out.printf("%n%dª cor: %s", i+1, cores[i]);
        }
    }

    public static void vetoresNom(Scanner read) {
        String [] Joestars = new String[8];

        for(int i = 0; i < Joestars.length; i++) {
            System.out.println("\nDigite um nome: ");
            Joestars[i] = read.nextLine();
        }

        for(int i = 0; i < Joestars.length; i++) {
            System.out.printf("%nNome %d: %s", i+1, Joestars[i]);
        }
    }

    public static void vetoresNum(Scanner read) {
        int [] Numbers = new int[10];

        for(int i = 0; i < Numbers.length; i++) {
            System.out.println("\nDigite um número: ");
            Numbers[i] = read.nextInt();
            read.nextLine();
        }

        for(int i = 0; i < Numbers.length; i++) {
            System.out.printf("%nNumero %d: %d", i+1, Numbers[i]);
        }
    }

    public static String formatarTexto(String escolha) {
        String normalizada = Normalizer.normalize(escolha, Normalizer.Form.NFD);
        normalizada = normalizada.replaceAll("\\p{M}", "");
        return normalizada.toLowerCase().trim();
    }
}
