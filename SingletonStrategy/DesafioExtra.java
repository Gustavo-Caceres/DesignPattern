import java.util.Locale;

// Demonstração separada para não mexer no Main nem no AuditLog esperado do exercício
public class DesafioExtra {
    public static void main(String[] args) {
        Locale ptBr = Locale.of("pt", "BR");
        CalculadoraDeFrete calculadora = new CalculadoraDeFrete(new FreteGratisAcima(new FreteSedex()));

        Pedido barato = new Pedido(2, 2.0, 100.0, 200.00);
        Pedido caro = new Pedido(3, 2.0, 100.0, 300.00);

        System.out.println(String.format(ptBr, "SEDEX grátis acima de R$ 300 | itens R$ 200,00 -> R$ %.2f", calculadora.calcular(barato)));
        System.out.println(String.format(ptBr, "SEDEX grátis acima de R$ 300 | itens R$ 300,00 -> R$ %.2f", calculadora.calcular(caro)));
        System.out.println("\nAuditLog:");
        AuditLog.getInstance().getRegistros().forEach(r -> System.out.println("  " + r));
    }
}
