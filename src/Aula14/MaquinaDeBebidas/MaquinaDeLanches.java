package Aula14.MaquinaDeBebidas;

import java.util.Scanner;

public class MaquinaDeLanches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produtos produtoCadastrado = null;

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o tipo do produto (comida/bebida): ");
        String tipo = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        if(tipo.equalsIgnoreCase("comida")) {
            produtoCadastrado = new Comida(nome, valor);
        } else {
            produtoCadastrado = new Bebidas(nome, valor);
        }

        Produtos[] produtos = { produtoCadastrado };

        for(int i = 0; i < produtos.length; i++) {
            System.out.println("--------------------");
            System.out.println("id: " + (i + 1));
            System.out.println("Nome: " + produtos[i].nome);
            System.out.println("Tipo: " + produtos[i].tipo);
            System.out.println("Valor: R$ " + produtos[i].valor);
        }

        sc.close();
    }
}