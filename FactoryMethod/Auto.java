import java.util.List;
public class Auto extends absApolice {

    private double fipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaContratada;

   public Auto( String segurado, double fipe, int idadeCondutor, int tempoHabilitacao, double coberturaContratada) {
        super("AUTO-", segurado);
        this.fipe = fipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaContratada = coberturaContratada;
    }

    @Override
    public double calculatePremio() {
        premio = (fipe * 0.08) / 12;
        if (idadeCondutor < 25) {
            premio *= 1.30;
        }
        if (tempoHabilitacao < 2) {
            premio *= 1.20;
        }
        return premio;

    }

    @Override
    public boolean validadeCobertura() {
        if (coberturaContratada < 50000.00) {
            return false;
        }
        return true;
    }

    @Override
    public List<String> listagemDocumentos() {
       return List.of("CNH", "CRLV", "Comprovante de Residência");
    }
    
}
