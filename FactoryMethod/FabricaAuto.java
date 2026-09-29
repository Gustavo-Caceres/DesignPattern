public class FabricaAuto extends FabricaApolice {


    private String segurado;
    private double fipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaContratada;


    public FabricaAuto(String segurado, double fipe, int idadeCondutor,
                       int tempoHabilitacao, double coberturaContratada) {
        this.segurado = segurado;
        this.fipe = fipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaContratada = coberturaContratada;
    }


    @Override
    public absApolice criarApolice() {
        return new Auto(segurado, fipe, idadeCondutor,
                        tempoHabilitacao, coberturaContratada);
    }
}