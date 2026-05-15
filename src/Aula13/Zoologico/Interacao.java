package Aula13.Zoologico;

import java.util.Scanner;

public class Interacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal[] jaulas = {
                new leao("Simba"),
                new macaco("Rafiki"),
                new pinguim("Kowalski")
        };

        Animal animalSelecionado = null;
        int op = 0;

        while(op != jaulas.length + 1) {
            System.out.println("\n Bem vindo ao Zoo");
            System.out.println("Escolha um animal para visitar:");

            for(int i = 0; i < jaulas.length; i++) {
                System.out.println((i + 1) + " - " + jaulas[i].getNome() + " (" + jaulas[i].getClass().getSimpleName() + ").");
            }

            System.out.println((jaulas.length + 1) + " - Sair");
            System.out.println("Sua escolha: ");
            op = sc.nextInt();

            if(op > 0 && op <= jaulas.length) {

            }
        }
    }
}
