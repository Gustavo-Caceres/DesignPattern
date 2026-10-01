public class DocumentoAlemanha implements Documento {

    private static final String VAT_ID = "DE123456789";

    @Override
    public String gerarDocumento(Pedido pedido) {
        // Umsatzsteuer: 7% para produtos essenciais, 19% para os demais
        double taxa = pedido.isEssencial() ? 0.07 : 0.19;
        double umsatzsteuer = pedido.getValor() * taxa;

        return "VAT Invoice | VAT-ID: " + VAT_ID +
               " | Umsatzsteuer (" + (int) (taxa * 100) + "%): € " + String.format("%.2f", umsatzsteuer);
    }
}