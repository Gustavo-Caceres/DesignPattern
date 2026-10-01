public class EtiquetaAlemanha implements Etiqueta {

    @Override
    public String gerarEtiqueta(Pedido pedido) {
        String plz = pedido.getCodigoPostal().replaceAll("[^0-9]", "");

        return "Deutsche Post | PLZ: " + plz;
    }
}