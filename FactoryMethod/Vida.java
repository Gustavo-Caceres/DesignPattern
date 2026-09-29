import java.util.ArrayList;
import java.util.List;

public class Vida extends absApolice {
    private int idade;
    private double capital;
    private boolean fumante;
    private boolean atestadoMedico;

    public Vida(String segurado, int idade, double capital, boolean fumante, boolean atestadoMedico) {
        super("VID-", segurado);
        this.idade = idade;
        this.capital = capital;
        this.fumante = fumante;
        this.atestadoMedico = atestadoMedico;
    }


    @Override
    public double calculatePremio() {
        premio = (idade * 12) + (capital * 0.002);
        if (fumante) {
            premio *= 1.5;
        }
        return premio;
    }

    @Override
    public boolean validadeCobertura() {
        if (capital > 500000.00 && !atestadoMedico) {
        return false;
    }
    return true;
}
    @Override
    public List<String> listagemDocumentos() {
    List<String> documentos = new ArrayList<>();
    documentos.add("Documento de identidade");
    documentos.add("CPF");

    if (capital > 500000.00) {
        documentos.add("Atestado Médico");   // só quando aplicável
    }
    return documentos;
}
    
}
