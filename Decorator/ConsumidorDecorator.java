//Consumidor do Decorator
public class ConsumidorDecorator {
    public static void main(String[] args) {
        //Preparar um hambúrguer simples
        iLanche lanche = new Hamburguer();
        imprimir(lanche);

        //Adicionando queijo
        lanche = new QueijoDecorator(lanche);
        imprimir(lanche);

        //Adicionando bacon
        lanche = new BaconDecorator(lanche);
        imprimir(lanche);

        //Adicionando ovo
        lanche = new OvoDecorator(lanche);
        imprimir(lanche);

        //Outro pedido, montado de uma vez: hambúrguer com queijo duplo
        iLanche duploQueijo = new QueijoDecorator(new QueijoDecorator(new Hamburguer()));
        imprimir(duploQueijo);
    }

    private static void imprimir(iLanche lanche) {
        System.out.println("Lanche pedido: " + lanche.Descricao());
        System.out.printf("Custo        : R$ %.2f%n%n", lanche.Preco());
    }
}
