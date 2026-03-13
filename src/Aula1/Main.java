package Aula1;
import java.util.Scanner;

public class Main { //Estrutura do programa
    public static void main(String[] args) { //Onde executa o código
        Scanner leitor = new Scanner(System.in);
        int resultado = 0;

        System.out.println();
        System.out.println("Hello and welcome!"); // Printa no terminal
        System.out.println("We're playing with Java");

        int repeticao = Menu(leitor);

        for(int i = 0; i < repeticao; i++) {
            resultado = Escolha(leitor);
        }

        System.out.println(resultado);

        leitor.close(); // Fecha o leitor
    } // Fechamento do Public Void Mains

    public static int Menu(Scanner leitor) {
        System.out.println("*** Menu ***");
        System.out.println("Digite quantas vezes você deseja repetir: ");
        int Qtd = leitor.nextInt();

        return Qtd;
    }

    public static int Escolha(Scanner leitor) {
        System.out.println("\nChoose two letters:");
        System.out.println("A: 5");
        System.out.println("B: 6");
        System.out.println("C: 7");

        String letter1 = leitor.nextLine();
        String letter2 = leitor.nextLine();

        int soma = Verificar(letter1, letter2);

        return soma;
    }

    public static int Verificar(String letter1, String letter2) {
        int n1 = 0;
        int n2 = 0;

        if(letter1.equalsIgnoreCase("A")) {
            n1 = 5;
        } else if(letter1.equalsIgnoreCase("B")) {
            n1 = 6;
        } else if(letter1.equalsIgnoreCase("C")) {
            n1 = 7;
        } else {
            System.out.println("Only A, B or C :|");
        }

        if(letter2.equalsIgnoreCase("A")) {
            n2 = 5;
        } else if(letter2.equalsIgnoreCase("B")) {
            n2 = 6;
        } else if(letter2.equalsIgnoreCase("C")) {
            n2 = 7;
        } else {
            System.out.println("Only A, B or C :|");
        }

        return (n1 + n2);
    }
} // Fechamento da estrutura
