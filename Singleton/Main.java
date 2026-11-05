public class Main {
    public static void main(String[] args) {
        // Duas partes diferentes do sistema pedem o Logger
        Logger loggerLogin = Logger.getInstance();
        Logger loggerCarrinho = Logger.getInstance();

        // Cada parte grava suas mensagens
        loggerLogin.registrar("Usuário Ana fez login");
        loggerCarrinho.registrar("Notebook adicionado ao carrinho");
        loggerLogin.registrar("Usuário Ana fez logout");

        // As duas variáveis apontam para o mesmo objeto
        System.out.println("Mesma instância? " + (loggerLogin == loggerCarrinho));
        System.out.println();

        // O log tem as mensagens das duas partes, na ordem
        Logger.getInstance().exibirRegistros();

        // Logger outro = new Logger();  // não compila: o construtor é privado
    }
}
