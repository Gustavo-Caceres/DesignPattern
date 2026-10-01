public class PagamentoBrasil implements Pagamento {

    @Override
    public String processarPagamento(Pedido pedido) {
        String forma = pedido.getFormaPagamento();

        if (forma.equalsIgnoreCase("PIX")) {
            double valorFinal = pedido.getValor() * 0.95;
            return "Pix | Valor com 5% de desconto: R$ " + String.format("%.2f", valorFinal);
        } else {
            return "Boleto | Valor: R$ " + String.format("%.2f", pedido.getValor()) +
                   " | Compensação em 3 dias úteis";
        }
    }
}