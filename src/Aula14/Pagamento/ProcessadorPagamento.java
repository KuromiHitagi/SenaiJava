package Aula14.Pagamento;

public interface ProcessadorPagamento {
    String iniciarPagamento(Pedido pedido);
    StatusPagamento verificarStatus(String idTransacao);
}
