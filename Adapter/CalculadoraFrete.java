public interface CalculadoraFrete {
    double calcular(String cepOrigem, String cepDestino, double pesoKg);   // valor em reais
    int prazoDias(String cepOrigem, String cepDestino);
    String nomeTransportadora();
}