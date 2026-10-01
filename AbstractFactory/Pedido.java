public class Pedido {
    private double valor;
    private String codigoPostal;
    private String estadoDestino;
    private boolean essencial;
    private boolean interestadual;
    private String formaPagamento;

    public Pedido (double valor, String codigoPostal, String estadoDestino, boolean essencial, boolean interestadual, String formaPagamento){
        this.valor = valor;
        this.codigoPostal = codigoPostal;
        this.estadoDestino = estadoDestino;
        this.essencial = essencial;
        this.interestadual = interestadual;
        this.formaPagamento= formaPagamento;
    }


    public double getValor() { return valor;}
    public String getCodigoPostal() {return codigoPostal;}
    public String getEstadoDestino() {return estadoDestino;}
    public boolean isEssencial() {return essencial;}
    public boolean isInterestadual() {return interestadual;}
    public String getFormaPagamento() {return formaPagamento;}

    
}