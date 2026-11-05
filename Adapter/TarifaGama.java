public class TarifaGama {
 
    private double valorBruto;
    private double desconto;     
    private int prazoHoras;
 
    public TarifaGama(double valorBruto, double desconto, int prazoHoras) {
        this.valorBruto = valorBruto;
        this.desconto = desconto;
        this.prazoHoras = prazoHoras;
    }
 
    public double getValorBruto() { return valorBruto; }
    public double getDesconto() { return desconto; }
    public int getPrazoHoras() { return prazoHoras; }
}