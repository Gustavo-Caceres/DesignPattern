public class ConsumidorObserver {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 4500.00);

        VitrineObserver vitrine = new VitrineObserver(notebook);
        ClienteObserver cliente1 = new ClienteObserver("Ana", notebook);
        ClienteObserver cliente2 = new ClienteObserver("Bruno", notebook);

        System.out.println("Antes de atualizar o preço do produto");
        notebook.setPreco(4200.00);
        System.out.println("Depois de atualizar o preço do produto");

        System.out.println();
        System.out.println("Antes da nova atualização do preço do produto");
        notebook.setPreco(3999.90);
        System.out.println("Depois de atualizar pela segunda vez o preço do produto");
    }
}
