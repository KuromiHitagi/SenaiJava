package Aula7;
import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String escolha = menu(sc);

        verify(escolha, sc);
    }

    public static String menu(Scanner sc) {
        System.out.println("Bem Vindo a Revisão!\n");
        System.out.println("[1]. Bom Dia Pessoal");
        System.out.println("[2]. Nome");
        System.out.println("[3]. Apresentação");
        System.out.println("[4]. Média");
        System.out.println("[5]. TV/Internet");
        System.out.println("[6]. TV/Internet V2");
        System.out.println("[7]. Tabuada com While");
        System.out.println("[8]. Média com Vetor\n");
        String texto = sc.nextLine();
        return format(texto);
    }

    public static void verify(String escolha, Scanner sc){
        if(escolha.equals("1") || escolha.equals("bom dia pessoal")) {
            bomDia();
        } else if(escolha.equals("2") || escolha.equals("nome")) {
            nome(sc);
        } else if(escolha.equals("3") || escolha.equals("apresentacao")) {
            apresentacao(sc);
        } else if(escolha.equals("4") || escolha.equals("media")) {
            media(sc);
        } else if(escolha.equals("5") || escolha.equals("tv/internet")) {
            tv1(sc);
        } else if(escolha.equals("6") || escolha.equals("tv/internet v2")) {
            tv2(sc);
        } else if(escolha.equals("7") || escolha.equals("tabuada com while")) {
            tabuada(sc);
        } else if(escolha.equals("8") || escolha.equals("media com vetor")) {
            mVetor(sc);
        } else{
            System.out.println("Você digitou errado manin!");
        }
    }

    public static void mVetor(Scanner sc) {
        limpar();

        System.out.println("Digite o nome do(a) aluno(a): ");
        String Aluno = sc.nextLine();

        double [] Notas = new double[4];
        double media = 0;
        String situacao;

        for(int i = 0; i < 4; i++) {
            System.out.printf("Digite a %dº nota: %n", i+1);
            Notas[i] = sc.nextDouble();
            media += Notas[i];
        }

        media /= 4;

        if(media >= 7) {
            situacao = "aprovado";
        } else {
            situacao = "reprovado";
        }

        System.out.printf("%nO(A) aluno(a) %s está: %s %nCom a média final de: %.2f", Aluno, situacao, media);
    }

    public static void tabuada(Scanner sc) {
        limpar();

        System.out.println("Digite o número que deseja multiplicar: ");
        int number = sc.nextInt();

        System.out.println("\nDigite quantas vezes você deseja multiplicar: ");
        int qtd = sc.nextInt();

        int i = 1;

        while(i <= qtd) {
            System.out.printf("%d x %d = %d%n", number, i, (number*i));
            i++;
        }
    }

    public static void tv2(Scanner sc) {
        limpar();

        String escolha;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("[1]. Jornal Nacional");
            System.out.println("[2]. Cartoon Network");
            System.out.println("[3]. Netflix");
            System.out.println("[0]. Sair");
            escolha = sc.nextLine();

            String escolhaF = format(escolha);

            switch (escolhaF) {
                case "1", "jornal nacional":
                    System.out.println("O Jornal Nacional é um programa para exibir notícias. ");
                    break;

                case "2", "cartoon network":
                    System.out.println("A Cartoon Network (melhor canal que existia) é um programa de desenhos infantis e juvenil. ");
                    break;

                case "3", "Netflix":
                    System.out.println("A Netflix é um canal de Streaming, que contém diversas séries e filmes no seu catálogo. ");
                    break;

                case "0", "sair":
                    System.out.println("Bye bye...");

                default:
                    System.out.println("Eita, você digitou algo errado... ");
                    break;
            }

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while(!escolha.equals("0") && !escolha.equalsIgnoreCase("sair"));
    }

    public static void tv1(Scanner sc) {
        limpar();

        String escolha;
        boolean ligar = true;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("[1]. Jornal Nacional");
            System.out.println("[2]. Cartoon Network");
            System.out.println("[3]. Netflix");
            escolha = sc.nextLine();

            String escolhaF = format(escolha);

            switch (escolhaF) {
                case "1", "jornal nacional":
                    System.out.println("O Jornal Nacional é um programa para exibir notícias. ");
                    break;

                case "2", "cartoon network":
                    System.out.println("A Cartoon Network (melhor canal que existia) é um programa de desenhos infantis e juvenil. ");
                    break;

                case "3", "Netflix":
                    System.out.println("A Netflix é um canal de Streaming, que contém diversas séries e filmes no seu catálogo. ");
                    break;

                default:
                    System.out.println("Eita, você digitou algo errado... ");
                    break;
            }

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while(ligar);
    }

    public static void media(Scanner sc) {
        limpar();

        System.out.println("Digite o nome do Aluno: ");
        String aluno = sc.nextLine();

        double n1, n2, n3, n4 = 0;

        System.out.println("Digite a 1º nota: ");
        n1 = sc.nextDouble();

        System.out.println("Digite a 2º nota: ");
        n2 = sc.nextDouble();

        System.out.println("Digite a 3º nota: ");
        n3 = sc.nextDouble();

        System.out.println("Digite a 4º nota: ");
        n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;
        String situacao;

        if(media >= 7) {
            situacao = "aprovado(a)";
        } else {
            situacao = "reprovado(a)";
        }

        System.out.printf("%n%nO(A) Aluno(a) %s está: %s %nE teve a média final de: %f", aluno, situacao, media);
    }

    public static void apresentacao(Scanner sc) {
        limpar();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.printf("Seja Bem-Vindo(a) %s! Você tem %d anos certo?", nome, idade);
    }

    public static void nome(Scanner sc) {
        limpar();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.printf("Seu nome é: %s!", nome);
    }

    public static void bomDia() {
        limpar();

        System.out.println("Bom dia Pessoal!: ");
    }

    public static void limpar() {
        for(int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }

    public static String format(String texto) {
        String normalizada = Normalizer.normalize(texto, Normalizer.Form.NFD);
        normalizada = normalizada.replaceAll("\\p{M}", "");
        return normalizada.toLowerCase().trim();
    }
}
