public class FreteGamaAdapter implements CalculadoraFrete {

    private ClienteTransportadoraGama gama;
    private boolean expresso;

    public FreteGamaAdapter(ClienteTransportadoraGama gama, boolean expresso) {
        this.gama = gama;
        this.expresso = expresso;
    }

    public FreteGamaAdapter(ClienteTransportadoraGama gama) {
        this(gama, false);
    }

    @Override
    public double calcular(String cepOrigem, String cepDestino, double pesoKg) {
        TarifaGama tarifa = consultar(cepOrigem, cepDestino, pesoKg);
        return tarifa.getValorBruto() * (1 - tarifa.getDesconto());   // bruto menos desconto
    }

    @Override
    public int prazoDias(String cepOrigem, String cepDestino) {
        // O prazo da Gama não depende do peso; usamos 1 kg só para consultar a tarifa
        TarifaGama tarifa = consultar(cepOrigem, cepDestino, 1.0);
        return (int) Math.ceil(tarifa.getPrazoHoras() / 24.0);       // horas -> dias, arredondando para cima
    }

    @Override
    public String nomeTransportadora() {
        return expresso ? "Gama Expresso" : "Gama";
    }

    private TarifaGama consultar(String cepOrigem, String cepDestino, double pesoKg) {
        return gama.consultarTarifa(cepParaInt(cepOrigem), cepParaInt(cepDestino), pesoKg, expresso);
    }

    private int cepParaInt(String cep) {
        String digitos = cep == null ? "" : cep.replace("-", "");
        if (!digitos.matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP inválido (precisa ter 8 dígitos): " + cep);
        }
        return Integer.parseInt(digitos);
    }
}
