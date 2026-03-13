package Aula2;

// Importa a função de Scanner

import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Renderiza o Menu de Lições
        String escolha = menu(leitor);

        // Formatar a escolha
        String escolhaF = FormatarTexto(escolha);

        // Chama a função de Verificação
        verify(escolhaF, leitor);
    }

    public static String menu(Scanner leitor) {
        System.out.println("Escolha qual lição deseja ver: ");
        System.out.println("[1]. Média");
        System.out.println("[2]. Teste Boolean");
        System.out.println("[3]. Utilizar Scanner");
        System.out.println("[4]. Email e Senha de Portugol para Java");
        System.out.println("[5]. Sugestões de TV ou Cinema");
        String escolha = leitor.nextLine();

        return escolha; // Volta a lição escolhida
    }

    public static void verify(String escolhaF, Scanner leitor) {
        // Verifica qual lição foi escolhida
        if (escolhaF.equals("media") || escolhaF.equals("1")) {
            licao1(leitor);
        } else if (escolhaF.equals("teste boolean") || escolhaF.equals("2")) {
            licao2();
        } else if (escolhaF.equals("utilizar scanner") || escolhaF.equals("3")) {
            licao3(leitor);
        } else if (escolhaF.equals("email e senha de portugol para java") || escolhaF.equals("4")) {
            licao4(leitor);
        } else if (escolhaF.equals("sugestoes de tv ou cinema") || escolhaF.equals("5")) {
            licao5(leitor);
        } else {
            System.out.println("Opção não disponível");
        }
    }

    public static void licao5(Scanner leitor) {
        System.out.println("Digite quanto de money você tem:");
        double money = leitor.nextDouble();

        if (money >= 100) {
            System.out.println("Vá para o cinema");
        } else {
            System.out.println("Fique em casa assistindo TV Globinho");
        }
    }

    public static void licao4(Scanner leitor) {
        System.out.println("Digite seu email:");
        String email = leitor.nextLine();

        System.out.println("Digite sua senha:");
        String senha = leitor.nextLine();

        if (!senha.equalsIgnoreCase("")) {
            System.out.println("\nLogin efetuado com sucesso! \n" +
                    "E-mail: " + email + "\n" +
                    "Senha: " + senha.replaceAll(".", "*")); // Substitui todos os caracteres da senha por * "asteriscos"
        }
    }

    public static void licao3(Scanner leitor) {
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade:");
        int idade = leitor.nextInt();

        System.out.println("Olá! " + nome + ", certo? Você tem " + idade + " anos de idade não é?");
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

    // Função para formatar as strings
    public static String FormatarTexto(String texto) {
        // 1. Decompõe os acentos
        String normalizada = Normalizer.normalize(texto, Normalizer.Form.NFD);

        // 2. Remove os acentos e salva o resultado na variável
        // O replaceAll gera uma nova String, por isso o "normalizada ="
        normalizada = normalizada.replaceAll("\\p{M}", "");

        // 3. Retorna tudo em minúsculo para facilitar a comparação depois
        return normalizada.toLowerCase().trim();
    }
}
