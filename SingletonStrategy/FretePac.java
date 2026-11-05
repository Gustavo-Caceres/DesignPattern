public class FretePac implements FreteStrategy {

    @Override
    public String getNome() {
        return "PAC";
    }

    @Override
    public double calcular(Pedido pedido) {
        ConfiguracaoLoja config = ConfiguracaoLoja.getInstance();   // lê a tarifa atual a cada cálculo
        return pedido.getPesoKg() * config.getPacPorKg()
             + pedido.getDistanciaKm() * config.getPacPorKm();
    }
}
