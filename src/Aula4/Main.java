package Aula4;

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
    public static String menu(Scanner read) {
        System.out.println("\nAula 4\n");
        System.out.println("Digite qual lição você deseja visitar: ");
        System.out.println("[1]. Temperatura com Do While");
        System.out.println("[2]. Nota");
        System.out.println("[3]. Valor");
        System.out.println("[4]. Fatorial");
        System.out.println("[5]. Tabuada");

        return read.nextLine();
    }

    /// Função que verifica a escolha do usuário
    public static void verify(String escolhaF, Scanner read) {
        if(escolhaF.equals("temperatura com do while") || escolhaF.equals("1")) {
            temperaturaDo(read);
        } else if(escolhaF.equals("nota") || escolhaF.equals("2")) {
            nota(read);
        } else if(escolhaF.equals("valor") || escolhaF.equals("3")) {
            valor(read);
        } else if(escolhaF.equals("fatorial") || escolhaF.equals("4")) {
            fatorial(read);
        } else if(escolhaF.equals("tabuada") || escolhaF.equals("5")) {
            tabuada(read);
        }
    }
    
    public static void tabuada(Scanner read) {
        char resp;
        
        do {
            int mult = 0;
            System.out.println("Digite um número para saber a tabuada: ");
            int x = read.nextInt();
            read.nextLine();
            
            for(int i = 1; i <= 10; i++) {
                mult = x * i;
                System.out.printf("%d x %d = %d%n", x, i, mult);
            }
            
            System.out.println("Deseja saber outra tabuada? (s/n)");
            resp = read.nextLine().charAt(0);
        } while(resp != 'n');
    }
    
    public static void fatorial(Scanner read) {
        System.out.println("Digite um valor para descobrir o fatorial: ");
        int n = read.nextInt();
        int fatorial = 1;
        
        for(int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.printf("o fatorial de %d é: %d", n, fatorial);
    }
    
    public static void temperaturaDo(Scanner read) {
        char resp;
        
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = read.nextDouble();
            read.nextLine();
            
            double F = (C * 1.8) + 32;
            System.out.printf("A temperatura em Fahrenheit é: %.1f%n%n", F);
            System.out.println("Deseja continuar (s/n)? ");
            resp = read.nextLine().charAt(0);
        } while(resp != 'n');
    }
    
    public static void valor(Scanner read) {
        System.out.println("Digite um valor: ");
        int valor = read.nextInt();
        
        for(int i = valor; i > 0; i--) {
            if(i % 2 != 0) {
                System.out.println("");
                System.out.println(i);
            }
        }
    }
    
    public static void nota(Scanner read) {
        double nota = 0;
        
        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = read.nextDouble();
            
            if(nota < 0 || nota > 10) {
                System.out.println("Valor incorreto!");
            }
        } while(nota < 0 || nota > 10);
        
        System.out.println("Correto!");
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
}