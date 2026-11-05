import java.util.Locale;

// Contexto do Strategy: não conhece nenhuma modalidade concreta
public class CalculadoraDeFrete {

    private FreteStrategy estrategia;

    public CalculadoraDeFrete() { }

    public CalculadoraDeFrete(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(Pedido pedido) {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete foi definida");
        }
        double frete = estrategia.calcular(pedido);
        // Só chega aqui se o cálculo não lançou exceção
        AuditLog.getInstance().registrar(String.format(Locale.US,
                "pedido=%d estrategia=%s frete=%.2f", pedido.getId(), estrategia.getNome(), frete));
        return frete;
    }
}
