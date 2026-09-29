import java.util.HashMap;
import java.util.Map;

public class Seguradora {

    private Map<String, FabricaApolice> fabricas = new HashMap<>();

    public void registrarFabrica(String tipo, FabricaApolice fabrica) {
        fabricas.put(tipo, fabrica);
    }

    public String emitirApolice(String tipo) {
        FabricaApolice fabrica = fabricas.get(tipo);

        if (fabrica == null) {
            return "Tipo de apólice não encontrado: " + tipo;
        }

        return fabrica.processarContratacao();
    }
}