public class FreteSedex implements FreteStrategy {

    @Override
    public String getNome() {
        return "SEDEX";
    }

    @Override
    public double calcular(Pedido pedido) {
        ConfiguracaoLoja config = ConfiguracaoLoja.getInstance();
        return pedido.getPesoKg() * config.getSedexPorKg()
             + pedido.getDistanciaKm() * config.getSedexPorKm()
             + config.getSedexTaxaUrgencia();
    }
}
