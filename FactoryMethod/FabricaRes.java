public class FabricaRes extends FabricaApolice {

    private String segurado;
    private double valorImovel;
    private String classificacao;
    private boolean escritura;
    private boolean contratoLocacao;

    public FabricaRes(String segurado, double valorImovel, String classificacao,
                      boolean escritura, boolean contratoLocacao) {
        this.segurado = segurado;
        this.valorImovel = valorImovel;
        this.classificacao = classificacao;
        this.escritura = escritura;
        this.contratoLocacao = contratoLocacao;
    }

    @Override
    public absApolice criarApolice() {
        return new Res(segurado, valorImovel, classificacao, escritura, contratoLocacao);
    }
}