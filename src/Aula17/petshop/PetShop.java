package Aula17.petshop;

import java.util.ArrayList;

public class PetShop {
    private static ArrayList<Animais> listaAnimal = new ArrayList<>();

    public static void addAnimais(Animais a) {
        listaAnimal.add(a);

        System.out.println("Animal cadastrado com sucesso!");
    }

    public static void exibirAnimais() {
        if (listaAnimal.isEmpty()) {
            System.out.println("O petshop está vazio!");
            return;
        }
        System.out.println("\n--- Animais Cadastrados ---");
        for (Animais a : listaAnimal) {
            a.exibirDados();
        }
    }
}
