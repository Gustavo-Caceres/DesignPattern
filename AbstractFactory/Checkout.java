public class Checkout {

    private FabricaPais fabrica;

    public Checkout(FabricaPais fabrica) {
        this.fabrica = fabrica;
    }

    public String gerarRelatorio(Pedido pedido) {
        Documento documento = fabrica.criarDocumento();
        Pagamento pagamento = fabrica.criarPagamento();
        Etiqueta etiqueta   = fabrica.criarEtiqueta();

        return "===== RELATORIO DO PEDIDO =====\n" +
               "Documento fiscal: " + documento.gerarDocumento(pedido) + "\n" +
               "Pagamento:        " + pagamento.processarPagamento(pedido) + "\n" +
               "Envio:            " + etiqueta.gerarEtiqueta(pedido) + "\n";
    }
}