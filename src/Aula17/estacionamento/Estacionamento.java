package Aula17.estacionamento;

import java.util.ArrayList;

public class Estacionamento{
    private static  ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    public static void addVeiculo(Veiculo v) {
        listaVeiculos.add(v);

        System.out.println("Veiculo cadastrado com sucesso!");
    }

    public static void exibirVeiculos() {
        if (listaVeiculos.isEmpty()) {
            System.out.println("O estacionamento está vazio.");
            return;
        }
        System.out.println("--- VEÍCULOS ESTACIONADOS ---");
        for (Veiculo v : listaVeiculos) {
            v.exibirDados();
        }
    }

    // Requisito: Informar quantidade
    public static void quantidadeVeiculos() {
        System.out.println("Quantidade de veículos no estacionamento: " + listaVeiculos.size());
    }
}
