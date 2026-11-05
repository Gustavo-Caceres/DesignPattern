public class PagamentoCartaoCredito implements EstrategiaPagamento {

    private String numeroCartao;
    private String nomeTitular;

    public PagamentoCartaoCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void pagar(double valor) {
        String finalCartao = numeroCartao.substring(numeroCartao.length() - 4);
        System.out.printf("Pagamento de R$ %.2f no cartão de crédito final %s (%s)%n",
                valor, finalCartao, nomeTitular);
    }
}
