/**
 * Singleton com a técnica "initialization-on-demand holder".
 * A JVM só carrega a classe Holder no primeiro getInstance(), e a inicialização
 * de classes é garantidamente thread-safe, então não é preciso synchronized.
 */
public class ConfiguracaoLoja {

    private static final double PAC_POR_KG_PADRAO = 2.50;
    private static final double PAC_POR_KM_PADRAO = 0.05;
    private static final double SEDEX_POR_KG_PADRAO = 4.00;
    private static final double SEDEX_POR_KM_PADRAO = 0.12;
    private static final double SEDEX_TAXA_URGENCIA_PADRAO = 15.00;

    // volatile: uma alteração feita por uma thread fica visível para as outras
    private volatile double pacPorKg;
    private volatile double pacPorKm;
    private volatile double sedexPorKg;
    private volatile double sedexPorKm;
    private volatile double sedexTaxaUrgencia;

    private ConfiguracaoLoja() {
        restaurarPadroes();
    }

    private static class Holder {
        private static final ConfiguracaoLoja INSTANCE = new ConfiguracaoLoja();
    }

    public static ConfiguracaoLoja getInstance() {
        return Holder.INSTANCE;
    }

    public synchronized void restaurarPadroes() {
        pacPorKg = PAC_POR_KG_PADRAO;
        pacPorKm = PAC_POR_KM_PADRAO;
        sedexPorKg = SEDEX_POR_KG_PADRAO;
        sedexPorKm = SEDEX_POR_KM_PADRAO;
        sedexTaxaUrgencia = SEDEX_TAXA_URGENCIA_PADRAO;
    }

    public double getPacPorKg() { return pacPorKg; }
    public void setPacPorKg(double valor) { pacPorKg = valor; }

    public double getPacPorKm() { return pacPorKm; }
    public void setPacPorKm(double valor) { pacPorKm = valor; }

    public double getSedexPorKg() { return sedexPorKg; }
    public void setSedexPorKg(double valor) { sedexPorKg = valor; }

    public double getSedexPorKm() { return sedexPorKm; }
    public void setSedexPorKm(double valor) { sedexPorKm = valor; }

    public double getSedexTaxaUrgencia() { return sedexTaxaUrgencia; }
    public void setSedexTaxaUrgencia(double valor) { sedexTaxaUrgencia = valor; }
}
