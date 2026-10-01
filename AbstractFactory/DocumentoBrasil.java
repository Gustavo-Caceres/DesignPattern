import java.util.Random;

public class DocumentoBrasil implements Documento {

    @Override
    public String gerarDocumento(Pedido pedido) {
        String cfop = pedido.isInterestadual() ? "6.102" : "5.102";
        double taxa = pedido.isInterestadual() ? 0.12 : 0.18;
        double icms = pedido.getValor() * taxa;

        Random random = new Random();
        StringBuilder chave = new StringBuilder();
        for (int i = 0; i < 44; i++) {
            chave.append(random.nextInt(10));
        }

        return "NF-e | CFOP: " + cfop +
               " | ICMS (" + (int) (taxa * 100) + "%): R$ " + String.format("%.2f", icms) +
               " | Chave de acesso: " + chave;
    }
}