import java.util.ArrayList;
import java.util.List;

public class Logger {

    // 1. Atributo estático que guarda a única instância da classe
    private static Logger instancia;

    // 2. Outros atributos da classe
    private String nomeSistema;
    private List<String> registros;

    // 3. Construtor privado: ninguém de fora consegue fazer new Logger()
    private Logger() {
        this.nomeSistema = "Loja Virtual";
        this.registros = new ArrayList<>();
        System.out.println(">> Logger criado (isso só deve aparecer uma vez)");
    }

    // 4. Método público estático para obter a instância (inicialização tardia)
    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void registrar(String mensagem) {
        registros.add(mensagem);
    }

    public void exibirRegistros() {
        System.out.println("Log do sistema " + nomeSistema + ":");
        for (int i = 0; i < registros.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + registros.get(i));
        }
    }
}
