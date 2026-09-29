public class FabricaViagem extends FabricaApolice {

    private String segurado;
    private int diasViagem;
    private boolean internacional;
    private double assistenciaMedica;
    private boolean passaporte;

    public FabricaViagem(String segurado, int diasViagem, boolean internacional,
                         double assistenciaMedica, boolean passaporte) {
        this.segurado = segurado;
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.assistenciaMedica = assistenciaMedica;
        this.passaporte = passaporte;
    }

    @Override
    public absApolice criarApolice() {
        return new Viagem(segurado, diasViagem, internacional,
                          assistenciaMedica, passaporte);
    }
    
}
