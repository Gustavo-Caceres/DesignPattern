public class EtiquetaBrasil implements Etiqueta {

    @Override
    public String gerarEtiqueta(Pedido pedido) {
        String cep = pedido.getCodigoPostal();
        String cepFormatado = cep.substring(0, 5) + "-" + cep.substring(5);

        return "Correios | CEP: " + cepFormatado;
    }
}