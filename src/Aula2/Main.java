package Aula2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Renderiza o Menu de Lições
        String escolha = menu(leitor);

        // Chama a função de Verificação
        verify(escolha, leitor);

    }

    public static String menu(Scanner leitor) {
        System.out.println("Escolha qual lição deseja ver: ");
        System.out.println("[1]. Media");
        System.out.println("[2]. Teste Boolean");
        System.out.println("[3]. Utilizar Scanner");
        System.out.println("[4]. Email Senha de Portugol para Java");
        String escolha = leitor.nextLine();

        return escolha;
    }

    public static void verify(String escolha, Scanner leitor) {
        // Verifica qual lição foi escolhida
        if (escolha.equalsIgnoreCase("media") || escolha.equals("1")) {
            licao1(leitor);
        } else if (escolha.equalsIgnoreCase("teste boolean") || escolha.equals("2")) {
            licao2();
        } else if (escolha.equalsIgnoreCase("utilizar scanner") || escolha.equals("3")) {
            licao3(leitor);
        } else if (escolha.equalsIgnoreCase("email senha de portugol para java") || escolha.equals("4")) {
            licao4(leitor);
        } else {
            System.out.println("Opção não disponível");
            return;
        }
    }

    public static void licao1(Scanner leitor) {
        double media, n1, n2, n3, n4;

        System.out.println("Digite as 4 notas do aluno: ");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        n4 = leitor.nextInt();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média é de: " + media);
    }

    public static void licao2() {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x < y && y < z);

        System.out.println("int x, y, z;\n" +
                "x = 4;\n" +
                "y = 7;\n" +
                "z = 12;\n" +
                "boolean r;\n" +
                "r = (x < y && y < z);\n" +
                "System.out.println(r);");
        System.out.println(r);
    }

    public static void licao3(Scanner leitor) {
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();

        System.out.println("Olá! " + nome + ", certo? Você tem " + idade + " anos de idade não é?");
    }

    public static void licao4(Scanner leitor) {
        System.out.println("Digite seu email:");
        String email = leitor.nextLine();

        System.out.println("Digite sua senha:");
        String senha = leitor.nextLine();

        if(!senha.equalsIgnoreCase("")) {
            System.out.println("\nLogin efetuado com sucesso! \n" +
                    "E-mail: " + email + "\n" +
                    "Senha: " + senha.replaceAll(".", "*"));
        }
    }
}
