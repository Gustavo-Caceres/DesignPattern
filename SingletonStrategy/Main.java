import java.util.Locale;

public class Main {

    private static final Locale PT_BR = Locale.of("pt", "BR");

    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, 2.0, 100.0, 200.00);
        CalculadoraDeFrete calculadora = new CalculadoraDeFrete();

        // (a) mesma calculadora, trocando a estratégia
        System.out.println("(a) Pedido 1: 2 kg, 100 km, R$ 200,00 em itens");
        calculadora.setEstrategia(new FretePac());
        imprimir("PAC", calculadora.calcular(pedido));
        calculadora.setEstrategia(new FreteSedex());
        imprimir("SEDEX", calculadora.calcular(pedido));
        calculadora.setEstrategia(new RetiradaNaLoja());
        imprimir("RETIRADA", calculadora.calcular(pedido));

        // (b) altera a tarifa do PAC por kg e calcula de novo
        System.out.println("\n(b) Tarifa PAC por kg alterada para R$ 5,00");
        ConfiguracaoLoja.getInstance().setPacPorKg(5.00);
        calculadora.setEstrategia(new FretePac());
        imprimir("PAC", calculadora.calcular(pedido));

        // (c) restaura as tarifas
        ConfiguracaoLoja.getInstance().restaurarPadroes();
        System.out.println(String.format(PT_BR, "\n(c) Tarifas restauradas: PAC por kg = R$ %.2f",
                ConfiguracaoLoja.getInstance().getPacPorKg()));

        // (d) mesma instância?
        ConfiguracaoLoja c1 = ConfiguracaoLoja.getInstance();
        ConfiguracaoLoja c2 = ConfiguracaoLoja.getInstance();
        System.out.println("\n(d) Mesma instância de ConfiguracaoLoja? " + (c1 == c2));

        // (e) histórico de auditoria
        System.out.println("\n(e) AuditLog:");
        for (String registro : AuditLog.getInstance().getRegistros()) {
            System.out.println("  " + registro);
        }
    }

    private static void imprimir(String modalidade, double valor) {
        System.out.println(String.format(PT_BR, "  %-9s R$ %.2f", modalidade, valor));
    }
}
