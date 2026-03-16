package Aula3;
import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String escolha = menu(read);

        String escolhaF = formatarTexto(escolha);

        verify(escolhaF, read);
    }

    /// Função que exibe o menu de aulas
    public static String menu(Scanner Read) {
        System.out.println("\nAula 3\n");
        System.out.println("Digite qual lição você deseja visitar: ");
        System.out.println("[1]. Switch, Case e Default");
        System.out.println("[2]. Doação");
        System.out.println("[3]. Calçado");

        return Read.nextLine();
    }

    /// Função que verifica a escolha do usuário
    public static void verify(String escolhaF, Scanner read) {
        if(escolhaF.equals("switch, case e default") || escolhaF.equals("1")) {
            switchCase(read);
        } else if(escolhaF.equals("doacao") || escolhaF.equals("2")) {
            criancaEsperanca(read);
        } else if(escolhaF.equals("calcado") || escolhaF.equals("3")) {
            calcado(read);
        }

    }

    /// Função que gera a Aula 3
    public static void calcado(Scanner read) {
        limparConsole();

        System.out.println("Digite o modelo de calçado desejado: \n" +
                "[1]. Mocassim\n" +
                "[2]. Rasteirinha");
        String calcado = read.nextLine();
        String calcadoF = formatarTexto(calcado);

        switch (calcadoF) {
            case "1", "mocassim":
                System.out.println("Modelo Masculino!");
                break;
            case "2", "rasteirinha":
                System.out.println("Modelo Feminino!");
                break;
            default:
                System.out.println("O modelo pode ser Infantil!");
                break;
        }
    }

    /// Função que gera a Aula 2
    public static void criancaEsperanca(Scanner read) {
        Boolean ligar = true;
        String confirmar;
        String doacao;
        float valor = 0;

        limparConsole();
        System.out.println("\nLição 2 - Doação usando Switch\n");

        while(ligar) {
            System.out.println("Digite a quantidade desejada: \n" +
                    "[1]. $10\n" +
                    "[2]. $20\n" +
                    "[3]. $50\n" +
                    "[4]. Outro valor:");
            doacao = read.nextLine();

            switch (doacao) {
                case "1":
                    valor += 10;
                    break;

                case "2":
                    valor += 20;
                    break;

                case "3":
                    valor += 50;
                    break;

                case "4":
                    System.out.println("\nDigite o valor desejado:");
                    valor += read.nextFloat();
                    read.nextLine();
                    break;

                default:
                    break;
            }

            System.out.printf("%nO valor da doação foi de: %.2f%n", valor);
            System.out.println("Muito obrigado! A associação e as crianças agradecem!!");

            System.out.println("\nQuer continuar? \n" +
                    "[1]. sim \n" +
                    "[2]. nao");
            confirmar = read.nextLine();

            switch (confirmar) {
                case "2", "nao":
                    ligar = false;
                    break;

                default:
                    ligar = true;
                    break;
            }
        }
    }

    /// Função que gera a Aula 1
    public static void switchCase(Scanner read) {
        Boolean ligar = true;
        String confirmar;
        float n1, n2, res = 0;
        int op = 0;

        limparConsole();

        System.out.println("\nLição 1 - Calc usando Switch\n");

        while(ligar == true) {
            System.out.println("Digite o primeiro número:");
            n1 = read.nextFloat();

            System.out.println("Digite o segundo número:");
            n2 = read.nextFloat();

            System.out.println("Digite a operação desejada: \n" +
                    "[1]. +\n" +
                    "[2]. -\n" +
                    "[3]. *\n" +
                    "[4]. /");
            op = read.nextInt();
            read.nextLine();

            switch (op) {
                case 1:
                    res = n1 + n2;
                    break;

                case 2:
                    res = n1 - n2;
                    break;

                case 3:
                    res = n1 * n2;
                    break;

                case 4:
                    res = n1 / n2;
                    break;

                default:
                    break;
            }

            System.out.printf("O resultado é: %f%n%n", res);

            System.out.println("Quer continuar? \n" +
                    "[1]. Sim \n" +
                    "[2]. Não");
            confirmar = read.nextLine();

            String confirmarF = formatarTexto(confirmar);

            switch (confirmarF) {
                case "1", "sim", "s", "ss", "si", "sm", "im":
                    ligar = true;
                    break;

                default:
                    ligar = false;
                    break;
            }
        }
    }

    /// Função que formata a escolha do usuário
    public static String formatarTexto(String escolha) {
        // 1. Decompõe os acentos
        String normalizada = Normalizer.normalize(escolha, Normalizer.Form.NFD);

        // 2. Remove os acentos e salva o resultado na variável
        // O replaceAll gera uma nova String, por isso o "normalizada ="
        normalizada = normalizada.replaceAll("\\p{M}", "");

        // 3. Retorna tudo em minúsculo para facilitar a comparação depois
        return normalizada.toLowerCase().trim();
    }

    public static void limparConsole() {
        for(int i = 0; i < 49; i++) {
            System.out.println("");
        }
    }
}
