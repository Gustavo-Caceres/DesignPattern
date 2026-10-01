public class PagamentoAlemanha implements Pagamento {

    @Override
    public String processarPagamento(Pedido pedido) {
        return "SEPA Direct Debit | Betrag: € " + String.format("%.2f", pedido.getValor());
    }
}