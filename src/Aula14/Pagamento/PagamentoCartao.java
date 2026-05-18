package Aula14.Pagamento;

public class PagamentoCartao implements ProcessadorPagamento{
    private final TipoCartao tipo;
    private StatusPagamento statusAtual = StatusPagamento.PENDENTE;

    public PagamentoCartao(TipoCartao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String iniciarPagamento(Pedido pedido) {
        System.out.println("Processando Car~tao de " + this.tipo + " para o pedido " + pedido.getId() + " no valor de R$" + pedido.getValorTotal());
        String numeroCartaoSimulado = "4444-5555-6666-1234";

        if(numeroCartaoSimulado.endsWith("1234")) {
            System.out.println("Validação inicial do cartão OK. Aguardando confimação da operadora...");
            this.statusAtual = StatusPagamento.APROVADO;
        } else {
            System.out.println("Dados do cartão inválidos.");
            this.statusAtual = StatusPagamento.REPROVADO;
        }

        return "CARTAO_" + new java.util.Random().nextInt(1000);
    }

    @Override
    public StatusPagamento verificarStatus(String idTransacao) {
        System.out.println("Verificando status da transação de cartão (" + this.tipo + "): " + idTransacao);
        return this.statusAtual;
    }
}
