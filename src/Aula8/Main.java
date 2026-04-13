package Aula8;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.text.Normalizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolha;

        do {
            escolha = menu(sc);
            if (escolha.equals("0") || escolha.equals("sair")) {
                break;
            }
            verify(sc, escolha);
        } while (true);

        System.out.println("Programa encerrado. Valeu!");
    }

    public static String menu(Scanner sc) {
        System.out.println("=== Aula 8 - manipulação de Arquivos ===");
        System.out.println("[1]. Escrita TXT");
        System.out.println("[2]. Leitura TXT (apenas se o 'Escrita TXT' já tiver sido executado)");
        System.out.println("[3]. Escrita e Leitura");
        System.out.println("[4]. Janela");
        System.out.println("[0]. Sair");
        System.out.println("\nDigite o que deseja: ");
        String escolha = sc.nextLine();

        return format(escolha);
    }

    public static void verify(Scanner sc, String escolha) {
        switch (escolha){
            case "1", "escrita txt":
                escritaTxt(sc);
                break;

            case "2", "leitura txt":
                leituraTxt(sc);
                break;

            case "3", "escrita e leitura":
                fullStack(sc);
                break;

            case "4", "janela":
                janela(sc);
                break;

            case "html":
                HTML();
                break;

            case "kill":
                kill(sc);
                break;
        }
    }

    public static void fullStack(Scanner sc) {
        limpar();
        byte op = 1;

        do {
            System.out.println("=== Menu ===");
            System.out.println("[1]. Escrever no arquivo. ");
            System.out.println("[2]. Ler o arquivo. ");
            System.out.println("[0]. Sair");
            System.out.println();

            op = sc.nextByte();
            sc.nextLine();

            switch (op) {
                case 1:
                    escritaTxt(sc);
                    break;

                case 2:
                    leituraTxt(sc);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while(op != 0);
    }

    public static void janela(Scanner sc) {
        int escolha;
        String[] op = {"Escrever", "Ler", "Sair"};

        do{
            escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção: ",
                "Menu do Arquivo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                op,
                op[0]
            );

            switch (escolha) {
                case 0 -> escreverArquivo(sc);
                case 1 -> lerArquivo(sc);
                default -> JOptionPane.showMessageDialog(null, "Encerrando programa. ");
            }
        } while(escolha == 0 || escolha == 1);
    }

    public static void escreverArquivo(Scanner sc) {
        String caminhoArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo (.txt no final): ");
        String texto = JOptionPane.showInputDialog("Digite o texto para salvar: ");

        if(texto != null && !texto.isBlank()) {
            try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {

                escritor.write(texto);
                escritor.newLine();
                JOptionPane.showMessageDialog(null, "Texto salvo com sucesso! ");

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
    }

    public static void lerArquivo(Scanner sc) {
        String caminhoArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo (.txt no final): ");
        StringBuilder texto = new StringBuilder();

        try(BufferedReader cont = new BufferedReader(new FileReader(caminhoArquivo))) {

            String l;
            while((l = cont.readLine()) != null) {
                texto.append(l).append("\n");
            }

            JOptionPane.showMessageDialog(null, texto.length() > 0 ? texto.toString() : "Arquivo vazio.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public static void leituraTxt(Scanner sc) {
        limpar();

        System.out.println("Digite o nome do arquivo que deseja ler: ");
        String caminhoArquivo = sc.nextLine(); //cria um novo arquivo (se não existir)

        try(BufferedReader l = new BufferedReader(new FileReader(caminhoArquivo))) {
            // BufferedWriter: Grava os dados em blocos
            // FileReader: Lê o arquivo
            // Try Catch: If Else para erros

            String linha;

            while((linha = l.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            // IOException: erros de entrada e saída
            // getMessage: Exibe mensagem de erro, se houver
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void kill(Scanner sc) {
        System.out.println(".");

        String confirm = "t";

        do {
            System.out.println("..");
            String escolha = sc.nextLine();
            File arquivo = new File(escolha);

            if(arquivo.exists()) {
                if (arquivo.delete()) {
                    System.out.println("O arquivo: " + arquivo + " foi neutralizado com sucesso!");
                } else {
                    System.out.println("O arquivo: " + arquivo + " não pode ser neutralizado.");
                }
            } else {
                System.out.println("Arquivo: " + arquivo + " não foi encontrado no sistema.");
            }

            System.out.println("...?");
            confirm = sc.nextLine();
        } while(!confirm.equalsIgnoreCase("f"));

    }

    public static void HTML() {
        limpar();

        String ELAVAMOSNOS = "index.html";

        try(BufferedWriter e = new BufferedWriter(new FileWriter(ELAVAMOSNOS))) {
            e.write("<!DOCTYPE HTML>");
            e.newLine();
            e.write("<html>");
            e.newLine();
            e.write("  <head>");
            e.newLine();
            e.write("    <title>HTML feito em JAVA</title>");
            e.newLine();
            e.write("  </head>");
            e.newLine();
            e.write("  <body>");
            e.newLine();
            e.write("    <h1>Jojo</h1>");
            e.newLine();
            e.write("  </body>");
            e.newLine();
            e.write("</html>");
            e.newLine();
        } catch (IOException es) {
            System.out.println("Erro man: " + es.getMessage());
        }
    }

    public static void escritaTxt(Scanner sc) {
        limpar();

        System.out.println("Digite o nome do arquivo: (ponha .txt no final)");
        String caminhoArquivo = sc.nextLine(); //cria um novo arquivo (se não existir)

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            // BufferedWriter: Grava os dados em blocos
            // FileWriter: Abre ou cria o arquivo
            // Try Catch: If Else para erros

            System.out.println("Digite quantas linhas você deseja escrever: ");
            int qtd = sc.nextInt();
            sc.nextLine();

            System.out.println("\n\n---===+++ . +++===---\n");

            for(int i = 0; i < qtd; i++) {
                System.out.print(i+1 + " ");
                escritor.write(sc.nextLine());
                escritor.newLine();
            }

        } catch (IOException e) {
            // IOException: erros de entrada e saída
            // getMessage: Exibe mensagem de erro, se houver
            System.out.println("Erro ao escrever no arquivo" + e.getMessage());
        }
    }

    public static void limpar() {
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static String format(String texto) {
        String normalizada = Normalizer.normalize(texto, Normalizer.Form.NFD);
        normalizada = normalizada.replaceAll("\\p{M}", "");
        return normalizada.toLowerCase().trim();
    }
}
