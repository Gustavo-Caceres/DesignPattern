public class PagamentoEua implements Pagamento {

    @Override
    public String processarPagamento(Pedido pedido) {
        // AVS simulado: confere se o ZIP+4 informado tem os 9 dígitos esperados
        String zip = pedido.getCodigoPostal().replaceAll("[^0-9]", "");
        boolean avsAprovado = zip.length() == 9;

        return "Credit Card | Amount: US$ " + String.format("%.2f", pedido.getValor()) +
               " | AVS: " + (avsAprovado ? "approved" : "failed");
    }
}