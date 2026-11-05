//Observador concreto: vitrine da loja que atualiza o preço exibido
public class VitrineObserver extends Observer {

    //Construtor
    public VitrineObserver(Produto produto) {
        this.produto = produto;
        this.produto.attach(this);
    }

    @Override
    public void update() {
        System.out.printf("[Vitrine] Etiqueta atualizada: %s - R$ %.2f%n",
                produto.getNome(), produto.getPreco());
    }
}
