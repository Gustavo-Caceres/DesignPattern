public class FreteBetaAdapter implements CalculadoraFrete {

    private ApiTransportadoraBeta beta;

    public FreteBetaAdapter(ApiTransportadoraBeta beta) {
        this.beta = beta;
    }

    @Override
    public double calcular(String cepOrigem, String cepDestino, double pesoKg) {
        String valor = beta.simular(comHifen(cepOrigem), comHifen(cepDestino), pesoKg); // "R$ 36,15"
        String numero = valor.replace("R$", "")
                             .trim()
                             .replace(".", "")    // separador de milhar
                             .replace(",", ".");  // vírgula decimal -> ponto
        return Double.parseDouble(numero);
    }

    @Override
    public int prazoDias(String cepOrigem, String cepDestino) {
        String prazo = beta.previsaoEntrega(comHifen(cepOrigem), comHifen(cepDestino)); // "5 dias uteis"
        return Integer.parseInt(prazo.replaceAll("\\D+", ""));
    }

    @Override
    public String nomeTransportadora() {
        return "Beta";
    }

    // A Beta espera o CEP no formato 00000-000
    private String comHifen(String cep) {
        String digitos = cep.replace("-", "");
        return digitos.substring(0, 5) + "-" + digitos.substring(5);
    }
}
