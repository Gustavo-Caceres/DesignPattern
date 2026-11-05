public class ClienteTransportadoraGama {
 
    public TarifaGama consultarTarifa(int cepOrigem, int cepDestino, double pesoKg, boolean expresso) {
        if (expresso) {
            return new TarifaGama(60.00, 0.20, 18);   // bruto R$ 60,00, 20% de desconto, 18 horas
        }
        return new TarifaGama(37.50, 0.20, 60);       // bruto R$ 37,50, 20% de desconto, 60 horas
    }
}