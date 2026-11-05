public class Cliente {

    public static void main(String[] args) {
        double valor = 250.00;

        // Simula as escolhas do usuário no checkout
        String[] escolhasUsuario = {"cartao", "paypal", "transferencia"};

        ContextoPagamento contexto = new ContextoPagamento(new PagamentoCartaoCredito("4111111111111234", "Gustavo Caceres"));

        for (String escolha : escolhasUsuario) {
            System.out.println("Usuário escolheu: " + escolha);
            contexto.setEstrategiaPagamento(escolherEstrategia(escolha));   // troca a estratégia em tempo de execução
            contexto.processarPagamento(valor);
            System.out.println();
        }
    }

    // O Cliente decide qual estratégia criar; o ContextoPagamento não conhece as classes concretas
    private static EstrategiaPagamento escolherEstrategia(String escolha) {
        return switch (escolha) {
            case "cartao" -> new PagamentoCartaoCredito("4111111111111234", "Gustavo Caceres");
            case "paypal" -> new PagamentoPayPal("gustavo@email.com");
            case "transferencia" -> new PagamentoTransferenciaBancaria("Banco do Brasil", "12345-6");
            default -> throw new IllegalArgumentException("Método de pagamento inválido: " + escolha);
        };
    }
}
