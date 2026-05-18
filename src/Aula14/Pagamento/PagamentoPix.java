package Aula14.Pagamento;

import jdk.jshell.Snippet;

public class PagamentoPix implements ProcessadorPagamento {
    private boolean pagamentoConfirmado = false;

    @Override
    public String iniciarPagamento(Pedido pedido) {
        System.out.println("Processandp PIX para o pedido " + pedido.getId() + " do valor de R$" + pedido.getValorTotal());
        System.out.println("QRcode gerado: (simulando código PIX copia-e-cola)");
        System.out.println("Aguardando pagamento pelo cliente...");

        if (Math.random() > 0.3) {
            this.pagamentoConfirmado = true;
        }

        return "PIX_" + new java.util.Random().nextInt(1000);
    }

    @Override
    public StatusPagamento verificarStatus(String idTransacao) {
        System.out.println("Consultando Banco Central para o PIX " + idTransacao);

        if (this.pagamentoConfirmado) {
            return StatusPagamento.APROVADO;
        }
        return StatusPagamento.PENDENTE;
    }
}
