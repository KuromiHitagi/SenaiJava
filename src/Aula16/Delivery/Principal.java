package Aula16.Delivery;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pedido[] pedidos = {
                new Pedido("Batata Frita Média", "Batata Frita", 20.0),
                new Pedido("Hambúrguer Genérico", "Pão, Carne, Alface, Cebola, Queijo e Tomate",30.0),
                new Pedido("Combo Batata Média + Hambúrguer", "Batata Frita - Pão, Carne, Alface, Cebola, Queijo e Tomate",45.0)
        };

        int op = 0;
        Local morada = null;
        Pedido[] carrinho = new Pedido[10];
        int qtdCarrinho = 0;

        while(op != 3) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Definir endereço");
            System.out.println("2 - Escolher pedidos (Adicionar ao Carrinho)");
            System.out.println("3 - Finalizar Compra e Vazar");
            System.out.print("Escolha: ");
            op = sc.nextInt();

            while(op <= 0 || op >= 4) {
                System.out.println("Escolha entre 1 e 3");
                op = sc.nextInt();
            }
            sc.nextLine(); // Limpa o buffer

            switch (op) {
                case 1:
                    morada = definirEndereco(sc);
                    break;

                case 2:
                    if(qtdCarrinho >= 10) {
                        System.out.println("Carrinho lotado! Não dá para adicionar mais itens.");
                    } else {
                        Pedido itemEscolhido = escolherPedido(pedidos, sc);

                        if (itemEscolhido != null) {
                            carrinho[qtdCarrinho] = itemEscolhido;
                            qtdCarrinho++;
                            System.out.println(itemEscolhido.getNome() + " adicionado ao carrinho!");
                        }
                    }
                    break;

                default:
                    System.out.println("Finalizando o seu pedido...");
                    break;
            }
        }

        if (qtdCarrinho > 0) {
            System.out.println("\n--- RESUMO DO SEU CARRINHO ---");
            double totalGeral = 0;
            for (int i = 0; i < qtdCarrinho; i++) {
                System.out.println("- " + carrinho[i].getNome() + " | R$ " + carrinho[i].getValor());
                totalGeral += carrinho[i].getValor();
            }
            System.out.println("Total da Compras: R$ " + totalGeral);

            if(morada != null) {
                System.out.print("\nDeseja que entreguemos ao mister you? (sim/nao): ");
                String confirm = sc.nextLine();

                if(confirm.equalsIgnoreCase("sim")) {
                    morada.entrega();
                } else {
                    System.out.println("Fechou! Retire no balcão.");
                }
            } else {
                System.out.println("\nComo nenhum endereço foi cadastrado, retire seu pedido no balcão!");
            }
        } else {
            System.out.println("\nVocê saiu sem comprar nada. Yare Yare Daze... 🌟");
        }

        sc.close();
    }

    public static Local definirEndereco(Scanner sc) {
        System.out.println("\nDefina o bairro em que mora: ");
        String bairro = sc.nextLine();

        System.out.println("Defina a rua em que reside: ");
        String rua = sc.nextLine();

        System.out.println("Defina o numero no qual representa vossa moradia: ");
        int numero = sc.nextInt();
        sc.nextLine(); // limpa buffer

        System.out.println("gg, endereço salvo!");
        return new Local(rua, bairro, numero);
    }

    public static Pedido escolherPedido(Pedido[] pedidos, Scanner sc) {
        System.out.println("\n--- CARDÁPIO ---");
        for(Pedido pedido : pedidos) {
            System.out.println("Item: " + pedido.getNome());
            System.out.println("Ingredientes: " + pedido.getConteudo());
            System.out.println("Valor: R$ " + pedido.getValor());
            System.out.println("---------------------------------");
        }

        System.out.print("Digite exatamente o nome do pedido: ");
        String op = sc.nextLine();

        for(Pedido pedido : pedidos) {
            if(pedido.getNome().equalsIgnoreCase(op)) {
                return pedido;
            }
        }

        System.out.println("Digitou errado ou n tem esse item no cardápio.");
        return null;
    }
}