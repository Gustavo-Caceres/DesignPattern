import java.util.ArrayList;
import java.util.List;

/**
 * Singleton com a técnica "double-checked locking" + volatile.
 * O volatile impede que outra thread enxergue a instância parcialmente construída.
 */
public class AuditLog {

    private static volatile AuditLog instance;

    private final List<String> registros = new ArrayList<>();

    private AuditLog() { }

    public static AuditLog getInstance() {
        AuditLog local = instance;
        if (local == null) {                       // 1ª verificação, sem lock
            synchronized (AuditLog.class) {
                local = instance;
                if (local == null) {               // 2ª verificação, com lock
                    instance = local = new AuditLog();
                }
            }
        }
        return local;
    }

    // synchronized: gravações simultâneas não se perdem
    public synchronized void registrar(String mensagem) {
        registros.add(mensagem);
    }

    // Cópia imutável, na ordem de gravação
    public synchronized List<String> getRegistros() {
        return List.copyOf(registros);
    }

    public synchronized void limpar() {
        registros.clear();
    }
}
