import java.util.ArrayList;
import java.util.List;

public class Viagem extends absApolice {

    private int diasViagem;
    private boolean internacional;
    private double assistenciaMedica;
    private boolean passaporte;

    public Viagem(String segurado, int diasViagem, boolean internacional,
                  double assistenciaMedica, boolean passaporte) {
        super("VIA-", segurado);
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.assistenciaMedica = assistenciaMedica;
        this.passaporte = passaporte;
    }

    @Override
    public double calculatePremio() {
        premio = diasViagem * 15.0;
        if (internacional) {
            premio += 100.0;
        }
        return premio;
    }

    @Override
    public boolean validadeCobertura() {
        if (internacional && (!passaporte || assistenciaMedica < 30000.00)) {
            return false;
        }
        return true;
    }

    @Override
    public List<String> listagemDocumentos() {
        List<String> documentos = new ArrayList<>();
        documentos.add("itinerário de viagem");
        if (internacional) {
            documentos.add("Passaporte");
        }
        return documentos;
    }
    
}
