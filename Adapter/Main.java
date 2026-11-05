public class Main {
    public static void main(String[] args) {
        String origem = "80010-000";   // Curitiba
        String destino = "01310-100";  // São Paulo
        double pesoKg = 2.5;

        CotacaoService cotacao = new CotacaoService();

        // Parte 2: Alfa e Beta
        cotacao.adicionar(new FreteAlfaAdapter(new ServicoTransportadoraAlfa()));
        cotacao.adicionar(new FreteBetaAdapter(new ApiTransportadoraBeta()));

        // Parte 3: Gama entra sem alterar nenhuma classe existente
        ClienteTransportadoraGama gama = new ClienteTransportadoraGama();
        cotacao.adicionar(new FreteGamaAdapter(gama, false));
        cotacao.adicionar(new FreteGamaAdapter(gama, true));

        System.out.println("Cotação de frete: " + pesoKg + " kg | " + origem + " -> " + destino);
        System.out.println("--------------------------------------------");
        cotacao.imprimirCotacoes(origem, destino, pesoKg);
        System.out.println("--------------------------------------------");
        System.out.println("Mais barata: " + cotacao.maisBarata(origem, destino, pesoKg).nomeTransportadora());

        // Validação de CEP da Gama
        try {
            new FreteGamaAdapter(gama).calcular("8001-000", destino, pesoKg);
        } catch (IllegalArgumentException e) {
            System.out.println("\nTeste de CEP inválido -> " + e.getMessage());
        }
    }
}
