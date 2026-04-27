package Aula10.Carro;

import java.util.Scanner;

public class TesteCarro {
     void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        double velocidade = 0.0;

        //Criamos uma instância (um objeto real) da classe Carro.
        Carro fusca = new Carro();

        while(on) {
            System.out.println("\n\n\n\n\n");
            System.out.println("=== MENU ===");
            System.out.println("[1]. Ligar o carro");
            System.out.println("[2]. Acelerar");
            System.out.println("[3]. Frear");
            System.out.println("[4]. Exibir velocidade");
            System.out.println("[5]. Desligar e Sair");
            System.out.println("Escolha seu número: ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1":
                    fusca.ligar(sc);
                    break;

                case "2":
                    fusca.acelerar(sc);
                    break;

                case "3":
                    fusca.frear(sc);
                    break;

                case "4":
                    System.out.println(fusca.getVelocidade() + "km/h");
                    System.out.println("Pressione algo para continuar...");
                    sc.nextLine();
                    break;

                case "5":
                    on = fusca.desligar(sc);
                    break;
            }
            System.out.println("\n\n\n\n\n");
        }
        sc.close();
    }
}
