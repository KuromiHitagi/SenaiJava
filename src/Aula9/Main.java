package Aula9;

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
        System.out.println("=== Aula 9 - manipulação de Arquivos ===");
        System.out.println("[1]. Vendas");
        System.out.println("[0]. Sair");
        System.out.println("\nDigite o que deseja: ");
        String escolha = sc.nextLine();

        return format(escolha);
    }

    public static void verify(Scanner sc, String escolha) {
        switch (escolha){
            case "1", "vendas":
                vendas(sc);
                break;

            case "kill":
                kill(sc);
                break;
        }
    }

    public static void vendas(Scanner sc) {
        System.out.println("Digite o nome do arquivo: ");
        String arquivoEntrada = (sc.nextLine() + ".csv");
        //String arquivoEntrada = "vendas.csv";
        String arquivoSaida = "relatorio_final.txt";

        double totalGeral = 0.0;

        try (BufferedReader l = new BufferedReader(new FileReader(arquivoEntrada));
             BufferedWriter e = new BufferedWriter(new FileWriter(arquivoSaida))) {

            String line = l.readLine();

            e.write("==== Relatório de Vendas ====\n");
            System.out.println("Processando arquivo... \n");

            while ((line = l.readLine()) != null) {
                String[] colunas = line.split(";");
                String produto = colunas[0];
                int quantidade = Integer.parseInt(colunas[1]);
                double preco = Double.parseDouble(colunas[2]);

                double totalProduto = quantidade * preco;
                totalGeral += totalProduto;

                String registro = String.format("Produto: %s | Qtd: %d | Preço: R$%.2f | Total: R$%.2f\n", produto, quantidade, preco, totalProduto);

                e.write(registro);
                System.out.print(registro);
            }

            String footer = "\n-----------------------------\n";
            footer += String.format("TOTAL GERAL ARRECADADO: R$%.2f\n", totalGeral);
            footer += "=========================================\n";

            e.write(footer);
            System.out.println(footer);

            System.out.println("\nSucesso! Arquivo 'relatorio_final.txt' gerado!");

        } catch (IOException e_erro) {
            System.out.println("Erro ao tentar ler ou escrever o arquivo: " + e_erro.getMessage());
        } catch (NumberFormatException e_erro) {
            System.out.println("Erro nos dados! O csv contém letras onde deveriam ter números.");
        } catch (ArrayIndexOutOfBoundsException e_erro) {
            System.out.println("Erro na estrutura! O csv está faltando colunas em alguma linha.");
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
