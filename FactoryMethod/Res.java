import java.util.List;

public class Res extends absApolice {

    private double valorImovel;
    private String classificacao;
    private boolean escritura;
    private boolean contratoLocacao;

    public Res(String segurado, double valorImovel, String classificacao, boolean escritura, boolean contratoLocacao) {
        super("RES-", segurado);
        this.valorImovel = valorImovel;
        this.classificacao = classificacao;
        this.escritura = escritura;
        this.contratoLocacao = contratoLocacao;
    }

    @Override
    public double calculatePremio() {
        premio = (valorImovel * 0.015) / 12;
        if (classificacao.equals("Alto Padrão")) {
            premio *= 1.25;
        }
        return premio;
    }

    @Override
    public boolean validadeCobertura() {
        return escritura || contratoLocacao;
    }

    @Override
    public List<String> listagemDocumentos() {
       return List.of("Escritura ou Contrato de Locação", "Comprovante de Residência");
    }
    
}
