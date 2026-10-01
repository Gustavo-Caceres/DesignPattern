import java.util.HashMap;
import java.util.Map;

public class Seletor {

    // País -> fábrica responsável pelos artefatos daquele país
    private Map<String, FabricaPais> fabricas = new HashMap<>();

    public void registrarFabrica(String pais, FabricaPais fabrica) {
        fabricas.put(pais, fabrica);
    }

    public FabricaPais obterFabrica(String pais) {
        FabricaPais fabrica = fabricas.get(pais);

        if (fabrica == null) {
            throw new IllegalArgumentException("País não suportado: " + pais);
        }
        return fabrica;
    }
}