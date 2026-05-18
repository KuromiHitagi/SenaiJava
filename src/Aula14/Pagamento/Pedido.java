package Aula14.Pagamento;

public class Pedido {
    private final int id;
    private final double valorTotal;
    private StatusPagamento status;

    public Pedido(int id, double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.status = StatusPagamento.PENDENTE;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }
}
