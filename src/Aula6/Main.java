package Aula6;

import java.text.Normalizer;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        String escolha = menu(rd);

        verify(escolha, rd);
    }

    public static String menu(Scanner rd) {
        System.out.println("Digite em qual aula você deseja entrar: ");
        System.out.println("[1]. Matrizes");
        System.out.println("[2]. Matrizes 2");
        System.out.println("[3]. Matrizes 3");
        System.out.println("[4]. Bingo");
        System.out.println("[5]. Soma de Matrizes");
        System.out.println("[6]. Media 5 Alunos");
        String texto = rd.nextLine();
        return format(texto);
    }

    public static void verify(String escolha, Scanner rd) {
        if(escolha.equals("matrizes") || escolha.equals("1")) {
            matrizes(rd);
        } else if(escolha.equals("matrizes 2") || escolha.equals("2")) {
            matrizes2(rd);
        } else if(escolha.equals("matrizes 3") || escolha.equals("3")) {
            matrizes3(rd);
        } else if(escolha.equals("bingo") || escolha.equals("4")) {
            bingo();
        } else if(escolha.equals("soma de matrizes") || escolha.equals("5")) {
            somaMatrizes(rd);
        } else if(escolha.equals("media 5 alunos") || escolha.equals("6")) {
            media5Alunos(rd);
        }
    }

    public static void media5Alunos(Scanner rd) {
        String[] nomes = new String[5];
        Double[][] notas = new Double[5][4];
        Double[] medias = new Double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o nome do %dº Aluno: %n", i + 1);
            nomes[i] = rd.nextLine(); // Agora lerá corretamente

            double soma = 0; // Variável auxiliar para somar as notas
            for (int j = 0; j < 4; j++) { // Usei 4 fixo pois notas[i] tem tamanho 4
                System.out.printf("Digite a %dº nota de %s: %n", j + 1, nomes[i]);
                notas[i][j] = rd.nextDouble();
                soma += notas[i][j];
            }

            // Limpeza do buffer: consome o "Enter" que sobrou do nextDouble
            rd.nextLine();

            medias[i] = soma / 4;
            System.out.println("-----------------------------------------");
        }

        // Exibição dos resultados
        System.out.println("\n=== RESULTADOS FINAIS ===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Aluno: %-15s | Média: %.2f | Status: ", nomes[i], medias[i]);
            if (medias[i] >= 7) {
                System.out.println("APROVADO");
            } else if (medias[i] >= 4) {
                System.out.println("RECUPERAÇÃO");
            } else {
                System.out.println("REPROVADO");
            }
        }
    }

    public static void somaMatrizes(Scanner rd) {
        int m, n;

        System.out.println("Quantas linhas vai ter cada matriz? ");
        m = rd.nextInt();

        System.out.println("Quantas colunas vai ter cada matriz? ");
        n = rd.nextInt();

        int [][] A = new int[m][n];
        int [][] B = new int[m][n];
        int [][] C = new int[m][n];

        // Define os valores da matriz A
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                System.out.printf("Digite os valores da matriz A [%d,%d]: %n", A[i][j], A[i][j]);
                A[i][j] = rd.nextInt();
            }
        }

        // Define os valores da matriz B
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B[i].length; j++) {
                System.out.printf("Digite os valores da matriz B [%d,%d]: %n", B[i][j], B[i][j]);
                B[i][j] = rd.nextInt();
            }
        }

        // Define os valores da matriz C
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Valores da matriz A ");
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length; j++) {
                System.out.printf("%d\t\t", A[i][j]);
            }
            System.out.println();
        }


        System.out.println("\n\nValores da matriz B ");
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B[i].length; j++) {
                System.out.printf("%d\t\t", B[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\nValores da matriz B ");
        for(int i = 0; i < C.length; i++) {
            for(int j = 0; j < C[i].length; j++) {
                System.out.printf("%d\t\t", C[i][j]);
            }
            System.out.println();
        }
    }

    public static void matrizes3(Scanner rd) {
        int m, n;

        System.out.println("Qual a quantidade de linhas da matriz? ");
        m = rd.nextInt();

        System.out.println("Qual a quantidade de colunas da matriz? ");
        n = rd.nextInt();

        int [][] matriz = new int[m][n];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("Elemento [%d,%d] :", i, j);
                matriz[i][j] = rd.nextInt();
                rd.nextLine();
            }
        }

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void bingo() {
        int [][] cartela = new int[5][5];
        Random sorteador = new Random();

        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela.length; coluna++) {
                cartela[linha][coluna] = sorteador.nextInt(75) + 1;
            }
        }

        System.out.println("=========================");
        System.out.println("B    I     N     G     O");
        System.out.println("=========================");

        for(int linha = 0; linha < cartela.length; linha++) {
            for(int coluna = 0; coluna < cartela[linha].length; coluna++) {
                System.out.print(cartela[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void matrizes2(Scanner rd) {
        int [][] teclado = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int linha = 0; linha < teclado.length; linha++) {
            for(int coluna = 0; coluna < teclado[linha].length; coluna++) {
                System.out.print(teclado[linha][coluna] + " ");
            }
            System.out.println();
        }
    }

    public static void matrizes(Scanner rd) {
        String [][] pessoas = new String[3][3]; //Gera uma matriz com 3 linhas e 2 colunas

        System.out.println("=== Cadastro de pessoas ===");

        for(int linha = 0; linha < pessoas.length; linha++) {
            System.out.printf("Digite o nome da %dº pessoa: %n", linha+1);
            pessoas[linha][0] = rd.nextLine();

            System.out.printf("Digite a idade de %s:%n", pessoas[linha][0]);
            pessoas[linha][1] = rd.nextLine();

            System.out.printf("Digite a nacionalidade de %s%n", pessoas[linha][0]);
            pessoas[linha][2] = rd.nextLine();
            System.out.println("-----------------------------------------");
        }

        System.out.printf("%n=== Tabela final de cadastros ===%n");
        System.out.println("Nome\t\t\t\tIdade\t\t\t\tNacionalidade");

        for(int linha = 0; linha < pessoas.length; linha++) {
            System.out.printf("%s\t\t\t\t%s\t\t\t\t%s%n", pessoas[linha][0], pessoas[linha][1], pessoas[linha][2]);
        }
    }

    public static String format(String texto) {
        String normalizada = Normalizer.normalize(texto, Normalizer.Form.NFD);
        normalizada = normalizada.replaceAll("\\p{M}", "");
        return normalizada.toLowerCase().trim();
    }
}
