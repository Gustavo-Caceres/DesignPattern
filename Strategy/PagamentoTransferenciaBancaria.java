public class PagamentoTransferenciaBancaria implements EstrategiaPagamento {

    private String banco;
    private String conta;

    public PagamentoTransferenciaBancaria(String banco, String conta) {
        this.banco = banco;
        this.conta = conta;
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f por transferência bancária (%s, conta %s)%n",
                valor, banco, conta);
    }
}
