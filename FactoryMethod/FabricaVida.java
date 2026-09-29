public class FabricaVida extends FabricaApolice {

    private String segurado;
    private int idade;
    private double capital;
    private boolean fumante;
    private boolean atestadoMedico;

    public FabricaVida(String segurado, int idade, double capital,
                       boolean fumante, boolean atestadoMedico) {
        this.segurado = segurado;
        this.idade = idade;
        this.capital = capital;
        this.fumante = fumante;
        this.atestadoMedico = atestadoMedico;
    }

    @Override
    public absApolice criarApolice() {
        return new Vida(segurado, idade, capital, fumante, atestadoMedico);
    }
}