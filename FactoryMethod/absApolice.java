import java.time.LocalDate;
import java.util.List;

public abstract class absApolice {
    private static int contador = 0;      
    protected String numero;
    protected String segurado;
    protected LocalDate dataEmissao;       
    protected double premio;

    public absApolice(String prefixo, String segurado) {
        contador++;
        this.numero = prefixo + contador;      
        this.segurado = segurado;
        this.dataEmissao = LocalDate.now();     
    }

    public abstract double calculatePremio();

    public abstract boolean validadeCobertura();

    public abstract List<String> listagemDocumentos();

    public String gerarResumo(){

        return "Número da Apólice: " + numero + "\n" +
                "Segurado: " + segurado + "\n" +
                "Data de Emissão: " + dataEmissao + "\n" +
                "Documentos Necessários: " +
                listagemDocumentos() + "\n" +
                "Prêmio: R$" + String.format("%.2f", premio) + "\n";
    }
}