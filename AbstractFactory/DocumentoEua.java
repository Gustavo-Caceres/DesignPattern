import java.util.Map;

public class DocumentoEua implements Documento {

    // Identificação fixa do vendedor (regra do RF02)
    private static final String EIN = "12-3456789";

    // Sales tax por estado de destino
    private static final Map<String, Double> SALES_TAX = Map.of(
        "CA", 0.0725,   // California
        "TX", 0.0625,   // Texas
        "OR", 0.0       // Oregon (isento)
    );

    @Override
    public String gerarDocumento(Pedido pedido) {
        String estado = pedido.getEstadoDestino().toUpperCase();

        // Estados fora da lista são tratados como isentos (simplificação do exercício)
        double taxa = SALES_TAX.getOrDefault(estado, 0.0);
        double salesTax = pedido.getValor() * taxa;

        return "Sales Invoice | EIN: " + EIN +
               " | State: " + estado +
               " | Sales tax (" + String.format("%.2f", taxa * 100) + "%): US$ " + String.format("%.2f", salesTax);
    }
}