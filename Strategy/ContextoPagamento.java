public class ContextoPagamento {

    private EstrategiaPagamento estrategiaPagamento;

    public ContextoPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    // Permite trocar o método de pagamento em tempo de execução
    public void setEstrategiaPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void processarPagamento(double valor) {
        estrategiaPagamento.pagar(valor);
    }
}
