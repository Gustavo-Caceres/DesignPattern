public class Main {
    public static void main(String[] args) {

        // 1. Registra uma fábrica para cada país
        Seletor seletor = new Seletor();
        seletor.registrarFabrica("BR", new FabricaBrasil());
        seletor.registrarFabrica("US", new FabricaEua());
        seletor.registrarFabrica("DE", new FabricaAlemanha());

        // 2. Um pedido para cada país
        Pedido pedidoBrasil   = new Pedido(1000.00, "01310100", "SP", false, true, "PIX");
        Pedido pedidoEua      = new Pedido(1000.00, "902101234", "CA", false, false, "CARTAO");
        Pedido pedidoAlemanha = new Pedido(1000.00, "10115", "BE", true, false, "SEPA");

        // 3. O checkout recebe a fábrica escolhida pelo seletor, sem nenhum if
        Checkout checkoutBrasil   = new Checkout(seletor.obterFabrica("BR"));
        Checkout checkoutEua      = new Checkout(seletor.obterFabrica("US"));
        Checkout checkoutAlemanha = new Checkout(seletor.obterFabrica("DE"));

        System.out.println(checkoutBrasil.gerarRelatorio(pedidoBrasil));
        System.out.println(checkoutEua.gerarRelatorio(pedidoEua));
        System.out.println(checkoutAlemanha.gerarRelatorio(pedidoAlemanha));
    }
}