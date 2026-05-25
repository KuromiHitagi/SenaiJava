package Aula15.Fazendinha;

import java.util.Scanner;

public class Fazendinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        while(op != 4) {
            pularLinha();
            
            System.out.println("--- MENU ---");
            System.out.println("1 - Gatin");
            System.out.println("2 - Doggo");
            System.out.println("3 - Vaquinha");
            System.out.println("4 - Get out");
            System.out.println("\nFaça sua escolha: ");
            op = sc.nextInt();

            while(op != 1 && op != 2 && op != 3 && op != 4) {
                System.out.println("Escolha entre 1 e 4: ");
                op = sc.nextInt();
            }
            sc.nextLine();

            switch (op) {
                case 1:
                    gato(sc);
                    break;

                case 2:
                    cachorro(sc);
                    break;

                case 3:
                    vaca(sc);
                    break;

                case 4:
                    System.out.println("Desligando...");
                    return;
            }
        }
    }

    public static void gato(Scanner sc) {
        pularLinha();

        System.out.println("Digite o nome do gatinho: ");
        String nome = sc.nextLine();

        Gato gatin = new Gato(nome);
        gatin.FazerSom();
        sc.nextLine();
    }

    public static void cachorro(Scanner sc) {
        pularLinha();

        System.out.println("Digite o nome do dogginho: ");
        String nome = sc.nextLine();

        Cachorro doggin = new Cachorro(nome);
        doggin.FazerSom();
        sc.nextLine();
    }

    public static void vaca(Scanner sc) {
        pularLinha();

        System.out.println("Digite o nome da vaquinha: ");
        String nome = sc.nextLine();

        Vaca vaquinha = new Vaca(nome);
        vaquinha.FazerSom();
        sc.nextLine();
    }

    public static void pularLinha() {
        for(int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
}
