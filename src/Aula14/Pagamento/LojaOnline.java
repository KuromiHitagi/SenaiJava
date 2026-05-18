package Aula14.Pagamento;

import java.util.Scanner;

public class LojaOnline {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        Pedido meuPedido = new Pedido(101, 250.75);

        System.out.println("--- Bem-Vindo à Loja Xopis ---");
        System.out.println("Seu pedido de R$" + meuPedido.getValorTotal() + " está pronto para pagamento.");
        System.out.println("\nEscolha a forma de pagamento: ");
        System.out.println("1 - Cartão");
        System.out.println("2 - PIX");
        System.out.println("3 - Boleto");
        int op = sc.nextInt();

        ProcessadorPagamento processador = null;

        if(op == 1) {
            System.out.println("Escolha o tipo de cartão: ");
            System.out.println("1 - Crédito");
            System.out.println("2 - Débito");
            int tipoCartao = sc.nextInt();

            if(tipoCartao == 1) {
                processador = new PagamentoCartao(TipoCartao.CREDITO);
            } else{
                processador = new PagamentoCartao(TipoCartao.DEBITO);
            }
        } else if(op == 2) {
            processador = new PagamentoPix();
        } else if(op == 3) {
            processador = new PagamentoBoleto();
        }

        if(processador != null) {
            System.out.println("\nIniciando processo de pagamento...");
            String transacaoId = processador.iniciarPagamento(meuPedido);

            System.out.println("\n--- Verificando Status da Transação ---");

            while(meuPedido.getStatus() == StatusPagamento.PENDENTE) {
                System.out.println("Aguarde, consultando status...");
                Thread.sleep(2000);

                StatusPagamento statusAtual = processador.verificarStatus(transacaoId);
                meuPedido.setStatus(statusAtual);
            }

            System.out.println("\n--- Resultado Final ---");
            System.out.println("Status do Pedido: " + meuPedido.getId() + ": " + meuPedido.getStatus());

            if(meuPedido.getStatus() == StatusPagamento.APROVADO) {
                System.out.println("Obrigado pela sua compra! Seu produto será enviado.");
            } else{
                System.out.println("Houve um problema com seu pagamento. Por favor, tente novamente.");
            }
        } else {
            System.out.println("Forma de pagamento inválida.");
        }
        sc.close();
    }
}
