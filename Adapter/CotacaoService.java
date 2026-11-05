import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Client: conhece apenas a interface CalculadoraFrete
public class CotacaoService {

    private static final Locale PT_BR = Locale.of("pt", "BR");

    private List<CalculadoraFrete> transportadoras = new ArrayList<>();

    public void adicionar(CalculadoraFrete transportadora) {
        transportadoras.add(transportadora);
    }

    public CalculadoraFrete maisBarata(String origem, String destino, double pesoKg) {
        CalculadoraFrete melhor = null;
        double menorValor = Double.MAX_VALUE;
        for (CalculadoraFrete t : transportadoras) {
            double valor = t.calcular(origem, destino, pesoKg);
            if (valor < menorValor) {
                menorValor = valor;
                melhor = t;
            }
        }
        return melhor;
    }

    public void imprimirCotacoes(String origem, String destino, double pesoKg) {
        for (CalculadoraFrete t : transportadoras) {
            double valor = t.calcular(origem, destino, pesoKg);
            int prazo = t.prazoDias(origem, destino);
            System.out.println(String.format(PT_BR, "%-14s R$ %6.2f  (%d %s)",
                    t.nomeTransportadora(), valor, prazo, prazo == 1 ? "dia" : "dias"));
        }
    }
}
