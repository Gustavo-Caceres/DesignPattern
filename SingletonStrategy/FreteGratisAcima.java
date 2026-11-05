/**
 * Desafio extra: frete grátis para pedidos a partir de R$ 300,00.
 * Envolve outra FreteStrategy e acrescenta comportamento a ela sem alterá-la:
 * é o padrão Decorator aplicado sobre o Strategy.
 */
public class FreteGratisAcima implements FreteStrategy {

    private static final double VALOR_MINIMO = 300.00;

    private final FreteStrategy estrategia;

    public FreteGratisAcima(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public String getNome() {
        return estrategia.getNome() + "_GRATIS_ACIMA_300";
    }

    @Override
    public double calcular(Pedido pedido) {
        if (pedido.getValorItens() >= VALOR_MINIMO) {
            return 0.0;
        }
        return estrategia.calcular(pedido);
    }
}
