public class PagamentoPayPal implements EstrategiaPagamento {

    private String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$ %.2f via PayPal na conta %s%n", valor, email);
    }
}
