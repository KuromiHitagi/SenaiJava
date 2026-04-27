package Aula10.Celular;

import java.util.Scanner;

public class TesteCelular {
    void main(String[] args){
        boolean on = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Gerenciando a bateria do meu Celular ===");
        Celular cell = new Celular();

        while(on) {
            System.out.println("\n\n\n\n\n");
            System.out.println("=== MENU ===");
            System.out.println("[1]. YouTube");
            System.out.println("[2]. Jogo leve");
            System.out.println("[3]. Jogo pesado");
            System.out.println("[4]. Música");
            System.out.println("[5]. Carregar");
            System.out.println("[0]. Sair");
            System.out.println("Escolha seu número: ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1":
                    cell.youtube();
                    prosseguir(sc);
                    break;

                case "2":
                    cell.leve();
                    prosseguir(sc);
                    break;

                case "3":
                    cell.pesado();
                    prosseguir(sc);
                    break;

                case "4":
                    cell.musga();
                    prosseguir(sc);
                    break;

                case "5":
                    cell.carregar(sc);
                    prosseguir(sc);
                    break;

                case "0":
                    on = false;
                    break;
            }
            System.out.println("\n\n\n\n\n");
        }
    }

    void prosseguir(Scanner sc) {
        System.out.println("Digite algo para prosseguir...");
        sc.nextLine();
    }
}
