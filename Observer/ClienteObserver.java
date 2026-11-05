//Observador concreto: cliente que quer ser avisado da mudança de preço
public class ClienteObserver extends Observer {
    private String nomeCliente;

    //Construtor
    public ClienteObserver(String nomeCliente, Produto produto) {
        this.nomeCliente = nomeCliente;
        this.produto = produto;
        this.produto.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("[%s] Aviso: o %s agora custa R$ %.2f%n",
                nomeCliente, produto.getNome(), produto.getPreco());
    }
}
